package com.dent2med.dentwiz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by bbates on 12/14/16.
 */
@Configuration
//@Import(ConfigA.class)
public class HelloWorldConfig {

   @Bean (initMethod = "init", destroyMethod = "cleanup")
   @Scope("prototype")
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }

    @Bean
    public TextEditor textEditor(){
       return new TextEditor( spellChecker(),1 );
    }

    @Bean
    public SpellChecker spellChecker(){
       return new SpellChecker( );
    }
}
