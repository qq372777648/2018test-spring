package net.lzw.test.spring.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 
* @author: liangzhenwei
* @create：2017年12月28日 下午7:08:17 
* @company:广州荔支网络技术有限公司
*/
@Component
public class TestSchedule {
	@Scheduled(fixedRate=5000)
	public void test(){
		System.out.println(new Date());
	}
	
	@Scheduled(cron="0 16 11 ? * *")
	public void test2(){
		System.out.println("xxx"+new Date());
	}

}
