package com.praise.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praise.service.impl.DrugServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {

    @Autowired(required = false)
    DrugServiceImpl drugService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        //	    List
        model.addAttribute("drugSelect", drugService.selectDrug());

        return "home";
    }

}
