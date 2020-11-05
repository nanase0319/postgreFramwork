package cn.ssy.postgre.mapper;

import cn.ssy.postgre.model.entity.WeatherDO;

import java.util.List;

/**
 * @author: sl
 * @since: 20/11/05 10:40
 */

public interface WeatherMapper {
     void add( WeatherDO weatherDO);

     void delete(Integer id);

     void update(WeatherDO weatherDO);

     WeatherDO findById(Integer id);

     List<WeatherDO> findWeathers();
}
