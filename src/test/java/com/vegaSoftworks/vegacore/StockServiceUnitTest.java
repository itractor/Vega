package com.vegaSoftworks.vegacore;

import com.vegaSoftworks.vegacore.models.Stock;
import com.vegaSoftworks.vegacore.services.StockService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StockServiceUnitTest {

    @Autowired
    private StockService stockService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Stock> stocks = stockService.list();

        for (Stock stock : stocks) {
            System.out.println(stock.getId());
        }

        Assert.assertEquals(stocks.size(), 3);
    }
}