package cn.ssy.postgre.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * @author: sl
 * @since: 20/11/05 10:59
 */

@Component
@MapperScan("cn.ssy.**.mapper")
public class MybatisConfig {
}
