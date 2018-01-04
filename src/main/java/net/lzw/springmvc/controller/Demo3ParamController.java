package net.lzw.springmvc.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.lzw.springmvc.dto.TestDto;

/** 
* @author: liangzhenwei
* @create：2018年1月3日 下午3:41:29 
* @company:广州荔支网络技术有限公司
*/


@Controller // 1
@RequestMapping("/param") //2
public class Demo3ParamController {
	public String html="<!DOCTYPE html><html><head><meta charset='UTF-8'><title></title></head><body>{}</body></html>";
	
	//http://localhost/test-spring/param/static/lzw?id=5&age=24&a=29
	@RequestMapping(value = "/static/{name}",produces = "application/json;charset=UTF-8")
	@ResponseBody 
	public  Map text(@PathVariable String name, String id,TestDto obj,Model model, HttpServletRequest request) { // 4
		Map m =new LinkedHashMap<>();
		m.put("name",name);
		m.put("id",id);
		m.put("age",request.getParameter("a"));
		m.put("a",obj.getA());
		return m;
	}
}
