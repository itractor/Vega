package com.vegaSoftworks.vegacore.repositories;

import com.vegaSoftworks.vegacore.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

}
