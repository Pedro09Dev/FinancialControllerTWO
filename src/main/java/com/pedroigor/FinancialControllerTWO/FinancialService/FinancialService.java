package com.pedroigor.FinancialControllerTWO.FinancialService;

import com.pedroigor.FinancialControllerTWO.FinancialEntity.Financial;
import com.pedroigor.FinancialControllerTWO.FinancialRepository.FinancialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialService {

    @Autowired
    private FinancialRepository financialRepository;
    public void save(Financial financial){
        financialRepository.save(financial);

    }

    public List<Financial> getAllFinances(){
        return financialRepository.findAll();
    }

    public Financial getFinancialById(Long id) {
        return financialRepository.findById(id).get();
    }

    public void deleteById(Long id){
        financialRepository.deleteById(id);
    }
}
