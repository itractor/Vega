package com.vega.backend.entities;

import lombok.Data;

public @Data class Stock {

    private double totalRevenue;

    private double operatingExpenses;

    private double netIncome;

    private double totalAssets;

    private double totalEquity;

    private String stockTicker;
}
