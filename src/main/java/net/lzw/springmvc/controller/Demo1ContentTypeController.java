package net.lzw.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.lzw.springmvc.dto.TestDto;

/** 
* @author: liangzhenwei
* @create：2018年1月3日 下午3:41:29 
* @company:广州荔支网络技术有限公司
*/


@Controller // 1
@RequestMapping("/demo") //2
public class Demo1ContentTypeController {
	public String html="<!DOCTYPE html><html><head><meta charset='UTF-8'><title></title></head><body>{}</body></html>";
	
//	text/html是指以html网页形式发送的，而text/plain是以纯文本格式发送的
	@RequestMapping(value="text",produces = "text/plain;charset=UTF-8")	// 3纯文本
	public @ResponseBody String text(HttpServletRequest request) { // 4
		return html.replace("{}", "url:" + request.getRequestURL() + " can access,requestparam a="+request.getParameter("a"));
	}
	@RequestMapping(value="html",produces = "text/html;charset=UTF-8")	// html
	public @ResponseBody String html(HttpServletRequest request) { // 4
		return html.replace("{}", "url:" + request.getRequestURL() + " can access,requestparam a="+request.getParameter("a"));
	}
	@RequestMapping(value="json",produces = "application/json;charset=UTF-8")	// json
	@ResponseBody 
	public  TestDto json(HttpServletRequest request) { // 4
		return new TestDto();
	}
	@RequestMapping(value="xml",produces = "application/xhtml+xml;charset=UTF-8")	// json
	@ResponseBody 
	public  TestDto xml(HttpServletRequest request) { // 4
		return new TestDto();
	}

}
