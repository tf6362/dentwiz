package com.dent2med.dentwiz;

/**
 * Created by bbates on 12/14/16.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

         HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

         objA.setMessage("I'm object A");
         objA.getMessage();

         HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
         objB.getMessage();
         objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objC = (HelloIndia) context.getBean("helloIndia");
        objC.getMessage1();
        objC.getMessage2();
        objC.getMessage3();


        TextEditor te = (TextEditor) context.getBean("textEditor");

        te.spellCheck();
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

        context.registerShutdownHook();
        System.out.println("-----------------------");
        /* Context with event listeners */
        ConfigurableApplicationContext context2 =
        new ClassPathXmlApplicationContext("Beans.xml");

        // Let us raise a start event.
        context2.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
        CustomEventPublisher cvp =
              (CustomEventPublisher) context2.getBean("customEventPublisher");
              cvp.publish();
              cvp.publish();
        // Let us raise a stop event.
        context2.stop();

        ConfigurableApplicationContext context3 =
                new ClassPathXmlApplicationContext("Beans.xml");

                // Let us raise a start event.
                context2.start();
   /*
        StudentJDBCTemplate studentJDBCTemplate =
        (StudentJDBCTemplate)context3.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record : students) {
           System.out.print("ID : " + record.getId() );
           System.out.print(", Name : " + record.getName() );
           System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
        */
        StudentJDBCTemplate studentJDBCTemplate =
            (StudentJDBCTemplate)context3.getBean("studentJDBCTemplate");

            System.out.println("------Records creation--------" );
            studentJDBCTemplate.create("Zara", 11, 99, 2010);
            studentJDBCTemplate.create("Nuha", 20, 97, 2010);
            studentJDBCTemplate.create("Ayan", 25, 100, 2011);

            System.out.println("------Listing all the records--------" );
            List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
            for (StudentMarks record : studentMarks) {
               System.out.print("ID : " + record.getId() );
               System.out.print(", Name : " + record.getName() );
               System.out.print(", Marks : " + record.getMarks());
               System.out.print(", Year : " + record.getYear());
               System.out.println(", Age : " + record.getAge());
            }

        context3.stop();

      }
}
