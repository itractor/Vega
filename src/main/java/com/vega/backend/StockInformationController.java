package com.vega.backend;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockInformationController {

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    private StockDto convertToDto(Stock stock) {
        StockDto stockDto = modelMapper.map(stock, StockDto.class);
        return stockDto;
    }

}
