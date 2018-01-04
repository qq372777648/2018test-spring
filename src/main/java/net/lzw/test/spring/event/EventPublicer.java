package net.lzw.test.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/** 
* @author: liangzhenwei
* @create：2017年12月28日 下午6:36:19 
* @company:广州荔支网络技术有限公司
*/
@Component
public class EventPublicer {
	@Autowired
	private ApplicationContext ctx;
	
	public boolean publish(ApplicationEvent event){
		ctx.publishEvent(event);
		return true;
	}

}
