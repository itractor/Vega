package com.vegaSoftworks.vegacore.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
@Getter @Setter @NoArgsConstructor
public class Stock {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String currency;
    private String ticker;
    private int reportyear;
    private BigInteger revenue;
    /*private BigInteger operatingIncome;
    private BigInteger netIncome;
    private BigInteger ebitda;
    private BigInteger totalAssets;
    private BigInteger totalLiabilities;
    private BigInteger totalDebt;
    private BigInteger totalEquity;
    private BigInteger cashAndEquivalents;
    private BigInteger workingCapital;

    private double earningsPerShare;
*/

}