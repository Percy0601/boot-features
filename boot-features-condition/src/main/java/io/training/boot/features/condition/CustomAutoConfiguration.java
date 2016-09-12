package io.training.boot.features.condition;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(DataSource.class)
@ConditionalOnBean(DataSource.class)
@EnableConfigurationProperties(CustomConfigProperties.class)
@AutoConfigureAfter(DataSourceAutoConfiguration.class)
public class CustomAutoConfiguration {

	// @Bean
	// @ConditionalOnMissingBean
	// public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory
	// sqlSessionFactory) {
	// ExecutorType executorType = this.properties.getExecutorType();
	// if (executorType != null) {
	// return new SqlSessionTemplate(sqlSessionFactory, executorType);
	// } else {
	// return new SqlSessionTemplate(sqlSessionFactory);
	// }
	// }

}
