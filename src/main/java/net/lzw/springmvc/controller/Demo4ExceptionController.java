package net.lzw.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
* @author: liangzhenwei
* @create：2018年1月3日 下午3:41:29 
* @company:广州荔支网络技术有限公司
*/


@Controller // 1
@RequestMapping("/exception") //2
public class Demo4ExceptionController {
	@RequestMapping(value = "/1",produces = "application/json;charset=UTF-8")
	@ResponseBody 
	public  Map text() { // 4
		throw new RuntimeException("我抛的RuntimeException");
	}
}
