package com.vega.backend;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class StockInformationService implements IStockInformationService{

    ObjectMapper objectMapper = new ObjectMapper();

    //TODO get data from kafka and not locally (Maybe use AVRO?)
    public Stock getStockInformation(String stockTicker) throws IOException {
        Stock stock =
                objectMapper.readValue(Paths.get("TestDataStock.json").toFile(), Stock.class);

        return stock;
    }

    @Override
    public TopStocks getTopStocks() throws IOException {
        TopStocks stock =
                objectMapper.readValue(Paths.get("TestDataTopStocks.json").toFile(), TopStocks.class);

        return stock;
    }

}
