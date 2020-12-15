package com.dev;
import com.dev.configuration.AppConfig;
import com.dev.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.dev"})
public class SpringFundamentalsApplication {

	public static void main(String[] args) {

		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
		configApplicationContext.register(AppConfig.class);
		configApplicationContext.refresh();
		StudentService service = configApplicationContext.getBean(StudentService.class);
		System.out.println(service.findAll());


	}

}
