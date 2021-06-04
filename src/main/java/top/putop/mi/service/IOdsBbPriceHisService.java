package top.putop.mi.service;

import top.putop.mi.db.model.BBaseInfo;
import top.putop.mi.db.model.OdsBbPriceHis;

import java.util.HashMap;
import java.util.List;

/**
 * 火币历史价格服务层接口
 * @author lxf
 */
public interface IOdsBbPriceHisService extends IBaseService<OdsBbPriceHis> {
    /**
     * 获取指定币种指定日期范围的数据
     * @param bBaseInfo   币种信息
     * @param beginDate   开始日期
     * @param endDate     结束日期
     * @return
     */
    public List<OdsBbPriceHis> collectorHbDataByBeginAndEndDate(BBaseInfo bBaseInfo, String beginDate, String endDate) throws Exception;

    /**
     * 插入采集的数据到数据库
     * @param odsBbPriceHisList
     * @return
     * @throws Exception
     */
    public HashMap<OdsBbPriceHis, Boolean> insertOdsBbPriceHisToDb(List<OdsBbPriceHis> odsBbPriceHisList) throws Exception;


    /**
     * 批量更新指定币种在指定日期范围的历史价格数据入库
     * @param bBaseInfos
     * @param beginDate
     * @param endDate
     * @return
     * @throws Exception
     */
    public Boolean updateOdsBbPriceHis(List<BBaseInfo> bBaseInfos, String beginDate, String endDate) throws Exception;


    /**
     * 批量更新库中所有币种在指定日期范围的历史价格数据入库
     * @param beginDate
     * @param endDate
     * @return
     * @throws Exception
     */
    public Boolean updateOdsBbPriceHis(String beginDate, String endDate) throws Exception;

}
