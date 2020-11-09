package cn.ssy.postgre;

import cn.ssy.postgre.mapper.PersonMapper;
import cn.ssy.postgre.mapper.WeatherMapper;
import cn.ssy.postgre.model.entity.PersonDO;
import cn.ssy.postgre.model.entity.WeatherDO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootTest
class PostgreApplicationTests {
    @Resource
    private WeatherMapper weatherMapper;
    @Resource
    private PersonMapper personMapper;
    @Test
    void contextLoads() {
    }


    @Test
    public void testConnection(){
        WeatherDO weatherDO = new WeatherDO();
        weatherDO.setCity("上海");
//        weatherDO.setDate(Date.now());
        weatherDO.setTempHi(1);
        weatherDO.setTempLo(2);
        weatherDO.setPrcp(1.1f);
        weatherMapper.add(weatherDO);
        System.out.println("插入成功");
    }

    @Test
    public void testFind(){
        WeatherDO byId = weatherMapper.findById(1);
        System.out.println(byId);
    }
    @Test
    public void testFindAll(){
        List<WeatherDO> weathers = weatherMapper.findWeathers();
        System.out.println(weathers);
    }

    //使用其他模式的表时
    @Test
    public void testSchema(){
        PersonDO personDO = new PersonDO();
        personDO.setName("xxx");
        personDO.setAge(1);
        personMapper.add(personDO);
    }


    @Test
    public void testTime(){
        Date date = new Date();
        System.out.println("this Date is:"+date);
        LocalDate now = LocalDate.now();
        System.out.println("using LocalDate is:"+now);
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("using LocalDateTime is:" +now1);
        Date time = Calendar.getInstance().getTime();
        System.out.println("using Calendar is:"+time);

    }
}
