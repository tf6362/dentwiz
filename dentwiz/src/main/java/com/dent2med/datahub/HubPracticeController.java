package com.dent2med.datahub;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by bbates on 1/5/17.
 */

@Controller

public class HubPracticeController{
    HubPracticeDAO hubPracticeDAO;
    @Autowired
    public HubPracticeController(HubPracticeDAO hubPracticeDAO ){
         this.hubPracticeDAO=hubPracticeDAO;
    }
    @RequestMapping(value = "/listHubPractice", method = RequestMethod.GET)
    public ModelAndView listHubPractice() {
       return new ModelAndView("hubPracticeList", "hubPracticeList", hubPracticeDAO.listHubPractice());
    }
    @RequestMapping(value = "/listHubPractice", method = RequestMethod.POST)
      public ModelAndView listHubPracticePost() {
         return new ModelAndView("hubPracticeList", "hubPracticeList", hubPracticeDAO.listHubPractice());
      }
    @RequestMapping(value = "/listHubPractice.json", method = RequestMethod.GET)
        public @ResponseBody
    List<HubPractice> listHubPracticeJSON() {
           return hubPracticeDAO.listHubPractice();
        }



    @RequestMapping(value = "hubPractice/{guid}.json", method = RequestMethod.GET)
    public ResponseEntity<HubPractice> hubPractice(@PathVariable Integer guid) {
        HubPractice hubPractice= hubPracticeDAO.getHubPractice(guid);
        HttpStatus status = hubPractice != null ?
                HttpStatus.OK : HttpStatus.NOT_FOUND;
       return new ResponseEntity<HubPractice>(hubPractice,status);
    }


   @RequestMapping(value = "/addHubPractice", method = RequestMethod.POST)
   public String addHubPractice(@ModelAttribute("SpringWeb")HubPractice hubPractice,
   ModelMap model) {
      model.addAttribute("guid", hubPractice.getGuid());

      return "result";
   }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
        public String loginPagePost() {
            return "login";
        }
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }
}