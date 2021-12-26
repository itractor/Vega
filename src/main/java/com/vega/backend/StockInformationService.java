package com.vega.backend;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class StockInformationService {

    ObjectMapper objectMapper = new ObjectMapper();


    //TODO get data from kafka and not locally
    public Stock getStockInformation(String stockTicker) throws IOException {
        Stock stock =
                objectMapper.readValue(new URL("TestData.json"), Stock.class);

        return stock;
    }

}
