package by.dma.ironbank.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import by.dma.ironbank.dao.MoneyDao;
import by.dma.ironbank.model.Bank;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
@Service
@Transactional
@Log4j2
@RequiredArgsConstructor
public class TransferMoneyProphecyService implements TransferMoneyService {

  private final MoneyDao moneyDao;

  private final ProphetService prophet;

  @Override
  public long transfer(String whoName, long amount) {
    Bank bank = moneyDao.findAll().get(0);

    if (bank.getTotalAmount() > amount && prophet.willSurvive(whoName)) {
      bank.credit(amount);
      return moneyDao.save(bank).getTotalAmount();
    }

    return -1;
  }
}
