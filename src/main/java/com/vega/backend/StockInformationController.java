package com.vega.backend;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@CrossOrigin
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
            stockDto = modelMapper.map(stockInformationService.getStockInformation(ticker), StockDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stockDto;
    }

    @GetMapping(value = "topStocks")
    @ResponseBody
    public TopStocksDto getStock() {
        TopStocksDto stockDto = null;
        try {
            stockDto = modelMapper.map(stockInformationService.getTopStocks(), TopStocksDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stockDto;
    }

}
