package com.vega.backend;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class StockInformationController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IStockInformationService stockInformationService;

    @GetMapping(value = "stock/{ticker}")
    @ResponseBody
    public StockDto getStock(@PathVariable("ticker") String ticker) {
        StockDto stockDto = null;
        try {
            stockDto = convertToDto(stockInformationService.getStockInformation(ticker));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stockDto;
    }

    private StockDto convertToDto(Stock stock) {
        StockDto stockDto = modelMapper.map(stock, StockDto.class);
        return stockDto;
    }

}
