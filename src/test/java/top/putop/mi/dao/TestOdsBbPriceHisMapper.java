package top.putop.mi.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.putop.mi.db.dao.OdsBbPriceHisMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestOdsBbPriceHisMapper {

    @Autowired
    private OdsBbPriceHisMapper odsBbPriceHisMapper;

    @Test
    public void selectByTbId(){
//        System.out.println(odsBbPriceHisMapper.selectByPrimaryKey(1));
    }



}
