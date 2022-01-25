package com.vegaSoftworks.vegacore.controllers;

import com.vegaSoftworks.vegacore.models.Stock;
import com.vegaSoftworks.vegacore.repositories.StockRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    private final StockRepository repository;

    StockController(StockRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin(origins = "*") //TODO create proxy and remove
    @GetMapping("/topStocks")
    List<Stock> getTopStocks() {
        return repository.findAll(); //TODO ACTUALLY return the top stocks
    }
/*
    @PostMapping("/addStockData")
    Stock newEmployee(@RequestBody Stock newEmployee) {
        return repository.save(newEmployee);
    }
*/
}
