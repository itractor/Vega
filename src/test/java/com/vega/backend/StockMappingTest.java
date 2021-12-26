package com.vega.backend;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockMappingTest {

    private ModelMapper modelMapper = new ModelMapper();

    @Test
    public void whenConvertStockEntityToStockDto_thenCorrect() {
        Stock stock = new Stock();
        stock.setStockTicker("MOWI");
        stock.setNetIncome(100.000);
        stock.setTotalAssets(10.000);

        StockDto stockDto = modelMapper.map(stock, StockDto.class);
        assertEquals(stock.getStockTicker(), stockDto.getStockTicker());
        assertEquals(stock.getNetIncome(), stockDto.getNetIncome());
        assertEquals(stock.getTotalAssets(), stockDto.getTotalAssets());
    }
}
