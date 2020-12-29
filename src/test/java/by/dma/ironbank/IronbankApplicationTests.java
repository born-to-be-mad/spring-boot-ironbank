package by.dma.ironbank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import by.dma.ironbank.model.ProphetProperties;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class IronbankApplicationTests {

  @Autowired
  ProphetProperties prophetProperties;

  @Test
  public void contextLoads() {
    assert prophetProperties.getWhoPaysDebts().contains("Lanisters");
  }

}
