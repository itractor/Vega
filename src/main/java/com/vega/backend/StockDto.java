package com.vega.backend;

import lombok.Data;

public @Data class StockDto {

    private double totalRevenue;

    private double operatingExpenses;

    private double netIncome;

    private double totalAssets;

    private String stockTicker;
}