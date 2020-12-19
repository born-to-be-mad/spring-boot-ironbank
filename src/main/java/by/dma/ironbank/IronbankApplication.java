package by.dma.ironbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import by.dma.ironbank.model.ProphetProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProphetProperties.class)
public class IronbankApplication {

  public static void main(String[] args) {
    SpringApplication.run(IronbankApplication.class, args);
  }

}
