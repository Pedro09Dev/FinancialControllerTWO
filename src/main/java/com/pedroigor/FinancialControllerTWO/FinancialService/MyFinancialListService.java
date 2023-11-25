package com.pedroigor.FinancialControllerTWO.FinancialService;

import com.pedroigor.FinancialControllerTWO.FinancialEntity.MyFinancialList;
import com.pedroigor.FinancialControllerTWO.FinancialRepository.MyFinancialListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyFinancialListService {

    @Autowired
    private MyFinancialListRepository myFinancialListRepository;

    public void saveMyFinances(MyFinancialList myFinancialList){
        myFinancialListRepository.save(myFinancialList);

    }

    public List<MyFinancialList> getAllMyFinances(){
        return myFinancialListRepository.findAll();
    }

    public void deleteById(Long id){
       myFinancialListRepository.deleteById(id);
    }

}
