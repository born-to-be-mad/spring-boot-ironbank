package by.dma.ironbank.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
@Service
//@Profile(ProfileConstants.WINTER_SOON)
public class NameBasedProphetService implements ProphetService {

  @Override
  public boolean willSurvive(String name) {
    return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
  }
}
