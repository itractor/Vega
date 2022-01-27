package com.vegaSoftworks.vegacore.repositories;

import com.vegaSoftworks.vegacore.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    @Query("SELECT u FROM Stock u WHERE u.ticker = ?1")
    Stock findByTicker(String ticker);
}
