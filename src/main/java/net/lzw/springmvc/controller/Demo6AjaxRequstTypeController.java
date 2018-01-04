package net.lzw.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.lzw.springmvc.dto.TestDto;

/** 
* @author: liangzhenwei
* @create：2018年1月3日 下午3:41:29 
* @company:广州荔支网络技术有限公司
*/


@Controller // 1
public class Demo6AjaxRequstTypeController {
	public String html="<!DOCTYPE html><html><head><meta charset='UTF-8'><title></title></head><body>{}</body></html>";
	
	@RequestMapping(value="urlParam",produces = "application/json;charset=UTF-8")	// 3纯文本
	@ResponseBody 
	public  TestDto urlParam(TestDto p) { 
		return p;
	}
	@RequestMapping(value="requestBody",produces = "application/json;charset=UTF-8")	// json
	@ResponseBody 
	public  TestDto requestBody(@RequestBody TestDto p) { 
		return p;
	}
	@RequestMapping(value="postJson",produces = "application/json;charset=UTF-8")	// json
	@ResponseBody 
	public  TestDto postJson(TestDto p) { 
		return p;
	}
	

}
