package cn.ssy.postgre;

import cn.ssy.postgre.mapper.PersonMapper;
import cn.ssy.postgre.mapper.WeatherMapper;
import cn.ssy.postgre.model.entity.PersonDO;
import cn.ssy.postgre.model.entity.WeatherDO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
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
    @Test void testSchema(){
        PersonDO personDO = new PersonDO();
        personDO.setName("xxx");
        personDO.setAge(1);
        personMapper.add(personDO);
    }
}
