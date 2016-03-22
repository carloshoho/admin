package admin.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class DataSourceConfig {

/*  @Bean
  public BasicDataSource dateSource() {
    BasicDataSource ds = new BasicDataSource();
    ds.setDriverClassName("com.mysql.jdbc.Driver");
    ds.setUrl("jdbc:mysql://localhost:3306/admin");
    ds.setUsername("root");
    ds.setPassword("qwe123");
    ds.setInitialSize(5);
    return ds;
  }*/

  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).setScriptEncoding("UTF-8")
        .addScript("classpath:schema.sql")
        .addScript("classpath:test-data.sql").build();
  }

  @Bean
  public DataSourceTransactionManager transactionManager(DataSource ds) {
    DataSourceTransactionManager dstxm = new DataSourceTransactionManager();
    dstxm.setDataSource(ds);
    return dstxm;
  }

}
