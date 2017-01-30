package com.dent2med.dentwiz;

/**
 * Created by bbates on 12/14/16.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAOP {
   public static void main(String[] args) {
      ApplicationContext context =
             new ClassPathXmlApplicationContext("AOPBeans.xml");

      Student student = (Student) context.getBean("student");

      student.getName();
      student.getAge();
      try{
      student.printThrowException();
      }catch(Exception e){}
        System.out.println("-------------------------");
       ApplicationContext context2 =
              new ClassPathXmlApplicationContext("AOPBeansAnnotated.xml");

       Student student2 = (Student) context2.getBean("student");

       student2.getName();
       student2.getAge();

       student2.printThrowException();


   }
}
