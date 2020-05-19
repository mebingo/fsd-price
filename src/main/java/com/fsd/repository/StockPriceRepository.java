package com.fsd.repository;

import com.fsd.entity.StockPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;


public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Long> {
    List<StockPriceEntity> findByCompanyCodeAndDateTimeBetween(String code, LocalDateTime start, LocalDateTime end);

    StockPriceEntity findFirstByCompanyCodeOrderByDateTimeDesc(String code);

    List<StockPriceEntity> findAllByCompanyCodeInAndDateTimeBetween(List<String> code, LocalDateTime start, LocalDateTime end);



}

