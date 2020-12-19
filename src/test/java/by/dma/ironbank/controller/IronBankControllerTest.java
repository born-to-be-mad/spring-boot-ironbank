package by.dma.ironbank.controller;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import by.dma.ironbank.service.ProphetService;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * TODO
 *
 * @author dzmitry.marudau
 * @since 2020.4
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class IronBankControllerTest {
  @Autowired
  MockMvc mockMvc;

  @MockBean
  ProphetService prophetService;

  @Before
  public void setUp() throws Exception {
    when(prophetService.willSurvive(anyString()))
            .thenReturn(true);
  }

  @Test
  public void should_credit() throws Exception {
    mockMvc.perform(get("/credit?name=Rob&amount=10"))
           .andExpect(status().isOk());

    mockMvc.perform(get("/state"))
           .andExpect(status().isOk())
           .andExpect(content().string("100490"))
           .andReturn();
  }
}
