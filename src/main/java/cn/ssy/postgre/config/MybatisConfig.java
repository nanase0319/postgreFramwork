package cn.ssy.postgre.config;

import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.extension.MybatisMapWrapperFactory;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: sl
 * @since: 20/11/05 10:59
 */

@Configuration
@MapperScan("cn.ssy.**.mapper")
public class MybatisConfig {

    /**
     * SQL执行效率插件
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {

        return new PerformanceInterceptor();
    }

    /**
     * Map下滑线转驼峰
     *
     * @return
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return configuration -> configuration.setObjectWrapperFactory(new MybatisMapWrapperFactory());
    }
}
