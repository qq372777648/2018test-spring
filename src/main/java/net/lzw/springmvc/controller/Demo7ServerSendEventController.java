package net.lzw.springmvc.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
* @author: liangzhenwei
* @create：2018年1月3日 下午7:14:01 
* @company:广州荔支网络技术有限公司
*/
//http://localhost/test-spring/sse
@Controller
public class Demo7ServerSendEventController {
	
	@RequestMapping(value="/push",produces="text/event-stream") //1
	@ResponseBody
	public  String push(){
		 Random r = new Random();
        try {
                Thread.sleep(5000);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }   
        return "data:Testing 1,2,3" + r.nextInt() +"\n\n";
	}

}
