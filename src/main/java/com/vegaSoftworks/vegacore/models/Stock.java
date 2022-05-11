package com.vegaSoftworks.vegacore.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "Stock")
public class Stock {

    @Id
    @Column(name="STOCK_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="TICKER", nullable=false, unique=true)
    private String ticker;

    @OneToMany(mappedBy = "stock", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<AnnualStats> annualStats;

    private String score;

}