package net.lzw.springmvc.dto;

import java.util.Date;

/** 
* @author: liangzhenwei
* @create：2018年1月3日 下午5:49:36 
* @company:广州荔支网络技术有限公司
*/
public class TestDto {
	public String a;
	public int b;
	public Float c;
	public Date d;
	public String getA() {
		return a;
	}
	public TestDto setA(String a) {
		this.a = a;
		return this;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Float getC() {
		return c;
	}
	public void setC(Float c) {
		this.c = c;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	
}
