package by.dma.ironbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import by.dma.ironbank.model.ProphetProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class IronbankApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(IronbankApplication.class, args);
    System.out.println("####################################");
    System.out.printf("# Amount of beans in context: %4s #%n", context.getBeanDefinitionCount());
    System.out.println("####################################");
  }

}
