package top.putop.mi.spader.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import top.putop.mi.spader.model.OdsBbPriceHis;

import java.text.MessageFormat;

/**
 * 数据采集工具
 */
@Component
public class FeiXiaoHaoDataCollector {

    //https://dncapi.bqiapp.com/api/v3/coin/history?coincode=bitcoin&begintime=20190901&endtime=20190903&page=1&per_page=1000&webp=1

    @Autowired
    RestTemplate restTemplate;

    static String url = "https://dncapi.bqiapp.com/api/v3/coin/history?coincode={0}&begintime={1}&endtime={2}&page=1&per_page=1000&webp=1";
                         //https://dncapi.bqiapp.com/api/v3/coin/history?coincode=bitcoin&begintime=20200829&endtime=20200905&page=1&per_page=1000&webp=1

    public static void main(String[] args) {

        FeiXiaoHaoDataCollector feiXiaoHaoDataCollector = new FeiXiaoHaoDataCollector();
        OdsBbPriceHis odsBbPriceHis = feiXiaoHaoDataCollector.getHbDataByStartAndEndDate("bitcoin","20190901","20190902");
        System.out.println(odsBbPriceHis);

    }

    /**
     * 获取指定币种指定日期范围的数据
     * @param coincode    币种code
     * @param beginDate   开始日期
     * @param endDate     结束日期
     * @return
     */
    public OdsBbPriceHis getHbDataByStartAndEndDate(String coincode,String beginDate,String endDate){
        String bitcoin = MessageFormat.format(url, coincode, beginDate, endDate);
        System.out.println("请求地址URL:" + bitcoin);
        ResponseEntity<OdsBbPriceHis> forEntity = restTemplate.getForEntity(bitcoin, OdsBbPriceHis.class);
        return forEntity.getBody();
    }
}
