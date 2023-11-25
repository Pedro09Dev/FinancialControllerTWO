package com.pedroigor.FinancialControllerTWO.FinancialRepository;

import com.pedroigor.FinancialControllerTWO.FinancialEntity.MyFinancialList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyFinancialListRepository extends JpaRepository<MyFinancialList, Long> {
}
