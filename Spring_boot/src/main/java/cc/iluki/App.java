package cc.iluki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * hello world
 * @author lk
 *
 */
//其中@SpringBootApplication声明让spring boot自动给程序进行必要的配置，等价于以默认属性
//使用@Configuration,@EnableAutoConfiguration和@ComponentScan
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}

}
