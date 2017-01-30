package com.dent2med.dentwiz;

/**
 * Created by bbates on 12/14/16.
 */
import org.springframework.context.ApplicationListener;

public class CustomEventHandler
   implements ApplicationListener<CustomEvent>{

   public void onApplicationEvent(CustomEvent event) {
      System.out.println(event.toString());
   }

}
