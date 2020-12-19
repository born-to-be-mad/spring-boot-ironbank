package by.dma.ironbank.model;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
@Data
@ConfigurationProperties("ironbank")
public class ProphetProperties {
  List<String> whoPaysDebts;
}
