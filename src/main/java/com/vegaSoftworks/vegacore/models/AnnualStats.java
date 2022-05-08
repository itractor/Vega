package com.vegaSoftworks.vegacore.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ANNUAL_STATS")
public class AnnualStats {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="STOCK_ID")
    @JsonBackReference //Due to using Lombok, this must be defined to prevent stackoverflow
    Stock stock;

    private BigInteger revenue;
    private BigInteger expenditures;
    @Column(name="report_year", nullable = false)
    private int year;
}
