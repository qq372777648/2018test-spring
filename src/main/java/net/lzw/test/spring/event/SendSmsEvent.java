package net.lzw.test.spring.event;

import org.springframework.context.ApplicationEvent;

/** 
* @author: liangzhenwei
* @create：2017年12月28日 下午6:29:58 
* @company:广州荔支网络技术有限公司
*/
public class SendSmsEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;
	String msg;

	public SendSmsEvent(Object source,String msg) {
		super(source);
		this.msg=msg;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	


}
