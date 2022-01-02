package com.vega.backend;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public interface IStockInformationService {

    public Stock getStockInformation(String stockTicker) throws IOException;

    public TopStocks getTopStocks() throws IOException;
}
