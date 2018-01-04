package net.lzw.springmvc.messageconverter;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import net.lzw.springmvc.dto.ForConvertTestDto;

public class MyMessageConverter extends AbstractHttpMessageConverter<ForConvertTestDto> {//1

	public MyMessageConverter() {
		super(new MediaType("application", "class",Charset.forName("UTF-8")));//2 返回类型application/class 结果的转换器
	}
	
	/**
	 * 3 application/class 且TestDto
	 */
	@Override
	protected boolean supports(Class<?> clazz) {
		return ForConvertTestDto.class.isAssignableFrom(clazz);
	}
	
	/**
	 * 4 返回
	 */
	@Override
	protected void writeInternal(ForConvertTestDto obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		String out = "hello:" + obj.a;
		outputMessage.getBody().write(out.getBytes());
	}
	
	/**
	 * 5 如何读取requestbody 装配 TestDto
	 */

	@Override
	protected ForConvertTestDto readInternal(Class<? extends ForConvertTestDto> clazz,
			HttpInputMessage inputMessage) throws IOException,
			HttpMessageNotReadableException {
		String temp = StreamUtils.copyToString(inputMessage.getBody(),Charset.forName("UTF-8"));
		String[] tempArr = temp.split("-");
		return new ForConvertTestDto().setA(tempArr[1]);
	}
	

	




}
