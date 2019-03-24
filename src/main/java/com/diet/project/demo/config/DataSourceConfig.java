package com.diet.project.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/*
*  DataSource 설명
*  JDBC를 통해 DB에 접근할 수 있게 해주는 객체
*  application.properties (spring 에서 root-context.xml과 유사) 에서 DB정보를 입력 한 후
*  아래와 같이 설정하여 DB에 접근
 * */
@Configuration
@MapperScan(value = "com.diet.project.demo.dao")
public class DataSourceConfig {

    @Bean(name = "datasource")
    @Primary
    @ConfigurationProperties("spring.datasource.hikari")
    public DataSource db1DataSource(){

        return DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
    }
/*
* SQlSessionFactory 설명
* DataSource를 참조하여 Mybatis와 DB서버를 연동함
* Mybatis 설정할 때에 주석 제거 예정.
* */
    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        Resource[] arrResource = new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapper/**/*Mapper.xml");
        sqlSessionFactoryBean.setMapperLocations(arrResource);
        sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
        return sqlSessionFactoryBean.getObject();
    }

}
