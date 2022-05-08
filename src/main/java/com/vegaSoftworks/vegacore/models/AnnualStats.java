package com.vegaSoftworks.vegacore.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@NoArgsConstructor
@Table(name = "ANNUAL_STATS")
public class AnnualStats {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name="STOCK_ID")
    Stock stock;

    private BigInteger revenue;
    private BigInteger expenditures;
    @Column(name="report_year", nullable = false)
    private int year;
}
