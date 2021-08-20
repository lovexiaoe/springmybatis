package net.zhaoyu.springmybatis;

import net.zhaoyu.springmybatis.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("net.zhaoyu.springmybatis")
public class SpringmybatisApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    	applicationContext.register(SpringmybatisApplication.class);
    	applicationContext.refresh();

		UserService userService = applicationContext.getBean("userService", UserService.class);
	}

}
