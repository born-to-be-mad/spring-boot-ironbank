package by.dma.ironbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import by.dma.ironbank.dao.MoneyDao;
import by.dma.ironbank.service.TransferMoneyService;
import lombok.RequiredArgsConstructor;

import static java.lang.String.*;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
@RestController
@RequiredArgsConstructor
public class IronBankController {

  private final TransferMoneyService moneyService;
  private final MoneyDao moneyDao;

  @GetMapping("/credit")
  public String credit(@RequestParam String name, @RequestParam long amount) {
    long deposit = moneyService.transfer(name, amount);
    if (deposit == -1) {
      return "Rejected<br/>" + name + " <b>will not</b> survive this winter";
    }
    return format(
            "<i> Credit appoved %s</i> <br/> Current balance:<b>%s</b>",
            name,
            deposit
    );
  }

  @GetMapping("/state")
  public long currentState() {
    return moneyDao.findAll().get(0).getTotalAmount();
  }

}
