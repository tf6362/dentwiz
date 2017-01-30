package com.dent2med.dentwiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by bbates on 12/14/16.
 */
public class MainAppConfigExample {
    public static void main(String[] args) {
       ApplicationContext ctx =
       new AnnotationConfigApplicationContext(HelloWorldConfig.class);

       HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

       helloWorld.setMessage("Hello World!");
       helloWorld.getMessage();
        TextEditor te = ctx.getBean(TextEditor.class);

        te.spellCheck();
    }
}
