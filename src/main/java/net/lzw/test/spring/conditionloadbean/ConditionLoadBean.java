package net.lzw.test.spring.conditionloadbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/** 
* @author: liangzhenwei
* @create：2017年12月29日 上午10:08:32 
* @company:广州荔支网络技术有限公司
*/
@Configuration
public class ConditionLoadBean {
	@Bean
	@Conditional(LinuxEnvCondition.class)
	public LinuxEnvCondition getLinuxEnvCondition(){
		return new LinuxEnvCondition();
	}
	@Bean
	@Conditional(WindowEvnCondition.class)
	public WindowListService getWindowListService(){
		return new WindowListService();
	}

}
