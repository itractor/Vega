package com.vega.backend;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public interface IStockInformationService {

    public Stock getStockInformation(String stockTicker) throws IOException;

}
