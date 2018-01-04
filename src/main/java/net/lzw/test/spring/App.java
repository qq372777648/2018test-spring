package net.lzw.test.spring;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import net.lzw.test.spring.bean.TestBean;
import net.lzw.test.spring.conditionloadbean.ListService;
import net.lzw.test.spring.event.EventPublicer;
import net.lzw.test.spring.event.SendSmsEvent;
/**
 * 
* @author: liangzhenwei
* @create：2017年12月29日 上午10:05:30 
* @company:广州荔支网络技术有限公司
* 
* 
* 1.profile 不同环境  不同bean
* 2.异步方法
 */

@Configuration
@ComponentScan("net.lzw.test.spring")
@EnableScheduling//支持计划任务
public class App {
	private static Logger logger = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(App.class);
		System.out.println(ctx.getBean(TestBean.class).name);
		
		//event
		EventPublicer eventPublicer=ctx.getBean(EventPublicer.class);
		eventPublicer.publish(new SendSmsEvent(new Date(), "klksajdflksjdf"));
		
		//condition load bean
		System.out.println(ctx.getBean(ListService.class).cmd());
		
//		ctx.close();
		logger.debug("-------------------------debug");
		logger.info("-------------------------info");
		logger.warn("-------------------------warn");
		logger.error("-------------------------error");
		
	}
}
