package net.lzw.test.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.lzw.test.spring.pojo.ABean;
import net.lzw.test.spring.profileloadbean.ProfileLoadBeanConfig;

/** 
* @author: liangzhenwei
* @create：2017年12月29日 上午10:38:12 
* @company:广州荔支网络技术有限公司
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ProfileLoadBeanConfig.class})
@ActiveProfiles("pre")
public class SpringTest {
	@Autowired
	private ABean a;
	
	@Test
	public void test(){
		System.out.println(a.name);
		Assert.assertEquals(a.name, "dev a bean");
	}

}
