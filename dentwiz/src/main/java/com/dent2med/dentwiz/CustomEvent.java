package com.dent2med.dentwiz;

/**
 * Created by bbates on 12/14/16.
 */
import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

   public CustomEvent(Object source) {
      super(source);
   }

   public String toString(){
      return "My Custom Event";
   }
}
