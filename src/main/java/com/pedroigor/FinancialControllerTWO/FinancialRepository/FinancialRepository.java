package com.pedroigor.FinancialControllerTWO.FinancialRepository;

import com.pedroigor.FinancialControllerTWO.FinancialEntity.Financial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialRepository extends JpaRepository<Financial, Long> {
}
