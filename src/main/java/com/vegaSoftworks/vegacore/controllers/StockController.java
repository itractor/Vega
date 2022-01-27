package com.vegaSoftworks.vegacore.controllers;

import com.vegaSoftworks.vegacore.models.Stock;
import com.vegaSoftworks.vegacore.repositories.StockRepository;
import com.vegaSoftworks.vegacore.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") //TODO create proxy and remove
@RestController
public class StockController {
    @Autowired
    StockService stockService;

    private final StockRepository repository;

    StockController(StockRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/topStocks")
    List<Stock> getTopStocks() {
        return stockService.list(); //TODO ACTUALLY return the top stocks
    }

    @GetMapping("/stock/{stock}")
    Stock getRequestedStock(@PathVariable String stock) {
        return stockService.getStockDetails(stock);
    }
/*
    @PostMapping("/addStockData")
    Stock newEmployee(@RequestBody Stock newEmployee) {
        return repository.save(newEmployee);
    }
*/
}
