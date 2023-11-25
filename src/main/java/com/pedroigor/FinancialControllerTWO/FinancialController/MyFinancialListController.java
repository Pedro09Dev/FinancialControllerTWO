package com.pedroigor.FinancialControllerTWO.FinancialController;

import com.pedroigor.FinancialControllerTWO.FinancialService.MyFinancialListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFinancialListController {

    @Autowired
    private MyFinancialListService myFinancialListService;

    @RequestMapping("/deleteMyFinance/{id}")
    public String deleteMyFinance(@PathVariable("id") Long id){
        myFinancialListService.deleteById(id);
        return "redirect:/my_finances";
    }
}
