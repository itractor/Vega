package com.vega.backend.services;

import com.vega.backend.entities.Stock;
import com.vega.backend.entities.TopStocks;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public interface IStockInformationService {

    public Stock getStockInformation(String stockTicker) throws IOException;

    public TopStocks getTopStocks() throws IOException;
}
