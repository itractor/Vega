package com.vegaSoftworks.vegacore.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Stock {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String currency;
    private String ticker;
    private int year;
    private BigInteger revenue;
    private BigInteger operatingIncome;
    private BigInteger netIncome;
    private BigInteger ebitda;
    private BigInteger totalAssets;
    private BigInteger totalLiabilities;
    private BigInteger totalDebt;
    private BigInteger totalEquity;
    private BigInteger cashAndEquivalents;
    private BigInteger workingCapital;

    private double earningsPerShare;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}