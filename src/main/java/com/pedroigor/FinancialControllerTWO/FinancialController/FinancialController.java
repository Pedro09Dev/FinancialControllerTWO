package com.pedroigor.FinancialControllerTWO.FinancialController;

import com.pedroigor.FinancialControllerTWO.FinancialEntity.Financial;
import com.pedroigor.FinancialControllerTWO.FinancialEntity.MyFinancialList;
import com.pedroigor.FinancialControllerTWO.FinancialService.FinancialService;
import com.pedroigor.FinancialControllerTWO.FinancialService.MyFinancialListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FinancialController {

    @Autowired
    private FinancialService financialService;

    @Autowired
    private MyFinancialListService myFinancialListService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/financial_register")
    public String financialRegister(){
        return "financialRegister";
    }

    @GetMapping("/available_finances")
    public ModelAndView getAllFinances(){
        List<Financial>list=financialService.getAllFinances();
        //ModelAndView modelAndView=new ModelAndView();
        //modelAndView.setViewName("financesList");
        //modelAndView.addObject("financial", list);
        return new ModelAndView("financesList", "financial", list);
    }

    @PostMapping("/save")
    public String addFinances(@ModelAttribute Financial financial){
        financialService.save(financial);
        return "redirect:/available_finances";
    }

    @GetMapping("/my_finances")
    public String getMyFinances(Model model){
    {
        List<MyFinancialList>list=myFinancialListService.getAllMyFinances();
        model.addAttribute("financial",list );
        return "myFinances";
    }
    }

    @RequestMapping("/myfinances/{id}")
    public String getMyFinance(@PathVariable("id") Long id){
        Financial financial = financialService.getFinancialById(id);
        MyFinancialList myFinancialList = new MyFinancialList(financial.getId(), financial.getName(), financial.getDate(), financial.getTransferencia(), financial.getMediaGasto());
        myFinancialListService.saveMyFinances(myFinancialList);
        return "redirect:/my_finances";
    }

    @RequestMapping("/editFinance/{id}")
    public String editFinance(@PathVariable("id") Long id, Model model){
        Financial financial = financialService.getFinancialById(id);
        model.addAttribute("financial", financial);
        return "financeEdit";
    }

    @RequestMapping("/deleteFinance/{id}")
    public String deleteFinance(@PathVariable("id") Long id){
        financialService.deleteById(id);
        return "redirect:/available_finances";
    }
}

