package com.mycompany.app.controller;

import com.mycompany.app.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    EmployeeMapper mapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("model", mapper.getAllEmployees());
        return mav;
    }
}
