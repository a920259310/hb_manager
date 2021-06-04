package top.putop.mi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.putop.mi.db.dao.OdsBbPriceHisMapper;
import top.putop.mi.db.model.BBaseInfo;
import top.putop.mi.db.model.OdsBbPriceHis;
import top.putop.mi.service.impl.OdsBbPriceHisServiceImpl;

import java.util.HashMap;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestOdsBbPriceHisService {

    @Autowired
    private IOdsBbPriceHisService iOdsBbPriceHisService;

    @Test
    public void collectorHbDataByBeginAndEndDate() throws Exception {
        BBaseInfo bBaseInfo = new BBaseInfo();
        bBaseInfo.setbName("BTC");
        bBaseInfo.setCoincode("bitcoin");
        bBaseInfo.setId(1);
        List<OdsBbPriceHis> odsBbPriceHis = iOdsBbPriceHisService.collectorHbDataByBeginAndEndDate(bBaseInfo, "20200901", "20200904");
        System.out.println(odsBbPriceHis);
    }


    @Test
    public void insertOdsBbPriceHisToDb() throws Exception {
        BBaseInfo bBaseInfo = new BBaseInfo();
        bBaseInfo.setbName("BTC");
        bBaseInfo.setCoincode("bitcoin");
        bBaseInfo.setId(1);
        List<OdsBbPriceHis> odsBbPriceHis = iOdsBbPriceHisService.collectorHbDataByBeginAndEndDate(bBaseInfo, "20200831", "20200831");
        System.out.println(odsBbPriceHis);
        // 20200831_BTC

        HashMap<OdsBbPriceHis, Boolean> odsBbPriceHisBooleanHashMap = iOdsBbPriceHisService.insertOdsBbPriceHisToDb(odsBbPriceHis);

        System.out.println(odsBbPriceHisBooleanHashMap);
    }


    @Test
    public void updateOdsBbPriceHis() throws Exception {

//        Boolean aBoolean3 = iOdsBbPriceHisService.updateOdsBbPriceHis("20201029", "20201112");
//        Boolean aBoolean3 = iOdsBbPriceHisService.updateOdsBbPriceHis("20201112", "20201117");
//        Boolean aBoolean3 = iOdsBbPriceHisService.updateOdsBbPriceHis("20201117", "20201123");
//        Boolean aBoolean3 = iOdsBbPriceHisService.updateOdsBbPriceHis("20201123", "20201127");
//        Boolean aBoolean3 = iOdsBbPriceHisService.updateOdsBbPriceHis("20201127", "20201203");
//        Boolean aBoolean3 = iOdsBbPriceHisService.updateOdsBbPriceHis("20201203", "20210302");
        Boolean aBoolean3 = iOdsBbPriceHisService.updateOdsBbPriceHis("20210302", "20210604");
//        System.out.println(aBoolean);

    }


}
