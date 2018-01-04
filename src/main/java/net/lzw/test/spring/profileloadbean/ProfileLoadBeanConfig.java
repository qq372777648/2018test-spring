package net.lzw.test.spring.profileloadbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import net.lzw.test.spring.pojo.ABean;

/** 
* @author: liangzhenwei
* @create：2017年12月29日 上午10:34:43 
* @company:广州荔支网络技术有限公司
*/
@Configuration
public class ProfileLoadBeanConfig {

	@Bean
	@Profile("dev")
	public ABean getDevAbean(){
		return new ABean("dev a bean");
	}
	
	@Bean
	@Profile("pre")
	public ABean getPreAbean(){
		return new ABean("pre a bean");
	}
}
