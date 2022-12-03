package itmo.abogatov.ministryoftruthbackend.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:7788/studs");
        dataSourceBuilder.username("s312418");
        dataSourceBuilder.password("SHcG20J5fve3ymwA");
//        dataSourceBuilder.url("jdbc:oracle:thin:@localhost:1521:orbis");
//        dataSourceBuilder.username("");
//        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}