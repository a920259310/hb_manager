package top.putop.mi.dao;

import com.baomidou.mybatisplus.mapper.Wrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.putop.mi.db.dao.BBaseInfoMapper;
import top.putop.mi.db.model.BBaseInfo;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestBBaseInfoMapper {

    @Autowired
    private BBaseInfoMapper bBaseInfoMapper;

    @Test
    public void selectList(){


//        List<BBaseInfo> bBaseInfos = bBaseInfoMapper.selectList(null);
//
//        System.out.println(bBaseInfos);
    }



}
