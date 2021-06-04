package top.putop.mi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.putop.mi.db.dao.BBaseInfoMapper;
import top.putop.mi.db.dao.OdsBbPriceHisMapper;
import top.putop.mi.db.model.BBaseInfo;
import top.putop.mi.db.model.OdsBbPriceHis;
import top.putop.mi.service.IOdsBbPriceHisService;
import top.putop.mi.spader.http.FeiXiaoHaoDataCollector;
import top.putop.mi.utils.DateUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 火币历史价格服务层接口
 *
 * @author lxf
 *
 */
@Service
public class OdsBbPriceHisServiceImpl implements IOdsBbPriceHisService {

    @Autowired
    private BBaseInfoMapper bBaseInfoMapper;

    @Autowired
    private OdsBbPriceHisMapper odsBbPriceHisMapper;

    @Autowired
    private FeiXiaoHaoDataCollector feiXiaoHaoDataCollector;

//    @Override
//    public int deleteByPrimaryKey(Integer colId) {
//        return odsBbPriceHisMapper.deleteByPrimaryKey(colId);
//    }

    @Override
    public int deleteByPrimaryKey(Integer colId) {
        return 0;
    }

    @Override
    public int insert(OdsBbPriceHis odsBbPriceHis) {
        return odsBbPriceHisMapper.insert(odsBbPriceHis);
    }

    @Override
    public int insertSelective(OdsBbPriceHis odsBbPriceHis) {
        return odsBbPriceHisMapper.insertSelective(odsBbPriceHis);
    }

    @Override
    public OdsBbPriceHis selectByPrimaryKey(Integer colId) {
        return null;
    }

//    @Override
//    public OdsBbPriceHis selectByPrimaryKey(Integer colId) {
//        return odsBbPriceHisMapper.selectByPrimaryKey(colId);
//    }

    @Override
    public int updateByPrimaryKeySelective(OdsBbPriceHis odsBbPriceHis) {
        return odsBbPriceHisMapper.updateByPrimaryKeySelective(odsBbPriceHis);
    }

    @Override
    public int updateByPrimaryKey(OdsBbPriceHis odsBbPriceHis) {
        return odsBbPriceHisMapper.updateByPrimaryKey(odsBbPriceHis);
    }

    @Override
    public List<OdsBbPriceHis> collectorHbDataByBeginAndEndDate(BBaseInfo bBaseInfo, String beginDate, String endDate) throws Exception {

        System.out.println("准备爬取数据:bBaseInfo="+bBaseInfo);
        System.out.println("准备爬取数据:beginDate="+beginDate);
        System.out.println("准备爬取数据:endDate="+endDate);
        top.putop.mi.spader.model.OdsBbPriceHis hbDataByStartAndEndDate = feiXiaoHaoDataCollector.getHbDataByStartAndEndDate(bBaseInfo.getCoincode(), beginDate, endDate);

        List<top.putop.mi.spader.model.OdsBbPriceHis.DataBeanX.ListBean> list = hbDataByStartAndEndDate.getData().getList();

        List<OdsBbPriceHis> collect = list.stream().map(x -> {
            OdsBbPriceHis odsBbPriceHis = new OdsBbPriceHis();
            double openprice = x.getOpenprice();
            double closeprice = x.getCloseprice();
            double high = x.getHigh();
            double low = x.getLow();
            String tickertime = x.getTickertime();

            odsBbPriceHis.setStartPrice(openprice);
            odsBbPriceHis.setEndPrice(closeprice);
            odsBbPriceHis.setMaxPrice(high);
            odsBbPriceHis.setMinPrice(low);

            try {
                Date parse = DateUtils.parse(tickertime, DateUtils.FORMAT_YYYY_MM_DDTHHMMSS);
                odsBbPriceHis.setDate(parse);

                odsBbPriceHis.setYear(DateUtils.format(parse,DateUtils.FORMAT_yyyy));

                String s = DateUtils.format(parse,DateUtils.FORMAT_yyyyMMdd) + "_" + bBaseInfo.getbName();

                odsBbPriceHis.setId(s);

            } catch (ParseException e) {
                e.printStackTrace();
            }


            odsBbPriceHis.setbName(bBaseInfo.getbName());
            odsBbPriceHis.setFkBId(bBaseInfo.getId());

            return odsBbPriceHis;
        }).collect(Collectors.toList());


        return collect;
    }

    @Override
    public HashMap<OdsBbPriceHis, Boolean> insertOdsBbPriceHisToDb(List<OdsBbPriceHis> odsBbPriceHisList) throws Exception {
        HashMap<OdsBbPriceHis, Boolean> odsBbPriceHisBooleanHashMap = new HashMap<>();

        for (OdsBbPriceHis odsBbPriceHis : odsBbPriceHisList) {
            Boolean aBoolean = insertOrUpdate(odsBbPriceHis);
            odsBbPriceHisBooleanHashMap.put(odsBbPriceHis,aBoolean);
        }


        return odsBbPriceHisBooleanHashMap;
    }

    @Override
    public Boolean updateOdsBbPriceHis(List<BBaseInfo> bBaseInfos, String beginDate, String endDate) throws Exception {

        for (BBaseInfo bBaseInfo : bBaseInfos) {
            Thread.sleep(200);
            List<OdsBbPriceHis> odsBbPriceHis = this.collectorHbDataByBeginAndEndDate(bBaseInfo, beginDate, endDate);
            HashMap<OdsBbPriceHis, Boolean> odsBbPriceHisBooleanHashMap = insertOdsBbPriceHisToDb(odsBbPriceHis);
        }


        return Boolean.TRUE;
    }

    @Override
    public Boolean updateOdsBbPriceHis(String beginDate, String endDate) throws Exception {
        ArrayList<BBaseInfo> bBaseInfos = new ArrayList<>();

        bBaseInfos.add(bBaseInfoMapper.selectByPrimaryKey(1));
        bBaseInfos.add(bBaseInfoMapper.selectByPrimaryKey(2));
        bBaseInfos.add(bBaseInfoMapper.selectByPrimaryKey(4));
        bBaseInfos.add(bBaseInfoMapper.selectByPrimaryKey(5));

        return this.updateOdsBbPriceHis(bBaseInfos,beginDate,endDate);

//        return Boolean.TRUE;
    }


    public Boolean insertOrUpdate(OdsBbPriceHis odsBbPriceHis){
        OdsBbPriceHis odsBbPriceHis1 = odsBbPriceHisMapper.selectByPrimaryKey(odsBbPriceHis.getId());
        if(odsBbPriceHis1 != null){
            odsBbPriceHisMapper.updateByPrimaryKey(odsBbPriceHis);
        }else{
            odsBbPriceHisMapper.insert(odsBbPriceHis);
        }
        return Boolean.TRUE;
    }


    public static void main(String[] args) throws Exception {

    }
}
