package net.lzw.test.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/** 
* @author: liangzhenwei
* @create：2017年12月28日 下午6:33:03 
* @company:广州荔支网络技术有限公司
*/
@Component
public class SendSmsEventListener implements ApplicationListener<SendSmsEvent> {

	public void onApplicationEvent(SendSmsEvent event) {

		System.out.println("heh, your message has been catched:"+event.msg);
		System.out.println(event.getSource());
		
	}

}
