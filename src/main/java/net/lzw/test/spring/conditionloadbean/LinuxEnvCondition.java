package net.lzw.test.spring.conditionloadbean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: liangzhenwei
 * @create：2017年12月29日 上午10:09:35
 * @company:广州荔支网络技术有限公司
 */
public class LinuxEnvCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getEnvironment().getProperty("os.name").contains("Linux");
	}

}
