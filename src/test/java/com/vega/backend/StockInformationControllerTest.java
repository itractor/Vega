package com.vega.backend;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.nio.file.Paths;

@SpringBootTest
@AutoConfigureMockMvc
public class StockInformationControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getStockJsonData() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/stock/MOWI").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"totalRevenue\":100.0,\"operatingExpenses\":100.0,\"netIncome\":100.0,\"totalAssets\":100.0,\"stockTicker\":\"MOWI\"}")));
    //TODO make dynamic
    }

    @Test
    public void getTopStocksJsondata() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/topStocks").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"topStocks\":[\"MOWI\",\"EQNR\",\"FJKR\",\"DBRT\",\"TSLA\",\"QQQQ\",\"DOOB\"]}")));
        //TODO make dynamic
    }
}