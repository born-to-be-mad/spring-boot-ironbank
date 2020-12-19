package by.dma.ironbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import by.dma.ironbank.model.Bank;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
public interface MoneyDao extends JpaRepository<Bank, String> {
}
