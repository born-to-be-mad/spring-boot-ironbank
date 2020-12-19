package by.dma.ironbank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
@Data
@Entity
public class Bank {
  @Id
  long id;

  long totalAmount;

  public void credit(long amount){
    totalAmount -= amount;
  }
}
