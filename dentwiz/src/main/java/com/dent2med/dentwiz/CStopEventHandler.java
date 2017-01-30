package com.dent2med.dentwiz;

/**
 * Created by bbates on 12/14/16.
 */
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler
   implements ApplicationListener<ContextStoppedEvent>{

   public void onApplicationEvent(ContextStoppedEvent event) {
      System.out.println("ContextStoppedEvent Received");
   }
}
