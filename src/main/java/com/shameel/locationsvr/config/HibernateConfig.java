package com.shameel.locationsvr.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement

public class HibernateConfig {
	
	@Bean
	  public DataSource dataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/locationdb?useSSL=false");
	    dataSource.setUsername("root");
	    dataSource.setPassword("123456");
	    return dataSource;
	  }

	  @Bean
	  public LocalSessionFactoryBean sessionFactory() {
	    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
	    sessionFactoryBean.setDataSource(dataSource());
	    sessionFactoryBean.setPackagesToScan(new String[] {"com.shameel.locationsvr.model"});
	    Properties hibernateProperties = new Properties();
	    hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MYSQLDialect");
	    hibernateProperties.put("hibernate.show_sql", true);
	    hibernateProperties.put("hibernate.ddl-auto", true);
	    sessionFactoryBean.setHibernateProperties(null);
	    
	    return sessionFactoryBean;
	  }

	  @Bean
	  public HibernateTransactionManager transactionManager() {
	    HibernateTransactionManager transactionManager = 
	        new HibernateTransactionManager();
	    transactionManager.setSessionFactory(sessionFactory().getObject());
	    return transactionManager;
	  }


}
