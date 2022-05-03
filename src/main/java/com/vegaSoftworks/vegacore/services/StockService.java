package com.vegaSoftworks.vegacore.services;

import com.vegaSoftworks.vegacore.models.Stock;
import com.vegaSoftworks.vegacore.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> list() {
        return stockRepository.findAll();
    }

    public List<Stock> getStockDetails(String ticker) {
        List<Stock> stock = stockRepository.findByTicker(ticker);
        System.out.println(stock);
        return stockRepository.findByTicker(ticker);
    }
}
