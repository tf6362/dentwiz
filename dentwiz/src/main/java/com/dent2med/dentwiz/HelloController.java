package com.dent2med.dentwiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by bbates on 12/18/16.
 */
@Controller

public class HelloController{

    @RequestMapping("/dentwiz/hello")
   public ModelAndView printHello(ModelMap model) {
      //model.addAttribute("message", "Hello Spring MVC Framework!");
       String message=    "Hello Spring MVC Framework!";
      return new ModelAndView("hello","message",message);
   }

}
