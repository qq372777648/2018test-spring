package net.lzw.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.lzw.springmvc.dto.ForConvertTestDto;

@Controller
public class Demo5ConverterController {
	
	
	
	@RequestMapping(value = "/convert", produces = { "application/class" }) //1
	@ResponseBody
    public  ForConvertTestDto convert(@RequestBody ForConvertTestDto t) {
        return t;
        
    }

}
