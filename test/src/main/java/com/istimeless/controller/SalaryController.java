package com.istimeless.controller;

import com.istimeless.beans.AutoWired;
import com.istimeless.service.SalaryService;
import com.istimeless.web.mvc.Controller;
import com.istimeless.web.mvc.RequestMapping;
import com.istimeless.web.mvc.RequestParam;

/**
 * @author lijiayin
 */
@Controller
@RequestMapping("/salary")
public class SalaryController {
    @AutoWired
    private SalaryService salaryService;
    
    @RequestMapping("/getSalary.json")
    public Integer getSalary(@RequestParam("name") String name, 
                             @RequestParam("experience") String experience){
        return salaryService.calSalary(Integer.parseInt(experience));
    }
}
