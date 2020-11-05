package cn.ssy.postgre.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDate;

/**
 * @author: sl
 * @since: 20/11/05 10:37
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class WeatherDO {
    private Long id;
    private String city;
    private Integer tempLo;
    private Integer tempHi;
    private Float prcp ;
    private LocalDate date;

}
