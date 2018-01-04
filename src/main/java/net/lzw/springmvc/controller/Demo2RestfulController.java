package net.lzw.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
* @author: liangzhenwei
* @create：2018年1月3日 下午3:41:29 
* @company:广州荔支网络技术有限公司
*/


@Controller // 1
@RequestMapping("/restful") //2
public class Demo2RestfulController {
	//http://localhost/test-spring/restful/static/lzw/8hio
	@RequestMapping(value = "/static/{name}/{id}")
	@ResponseBody
	public  String text(@PathVariable String name,@PathVariable String id, HttpServletRequest request) { // 4
		return name+id;
	}
}
