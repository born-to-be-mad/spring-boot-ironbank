package by.dma.ironbank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import by.dma.ironbank.model.ProphetProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IronbankApplicationTests {

  @Autowired
  ProphetProperties prophetProperties;

  @Test
  public void contextLoads() {
    assert prophetProperties.getWhoPaysDebts().contains("Lanisters");
  }

}
