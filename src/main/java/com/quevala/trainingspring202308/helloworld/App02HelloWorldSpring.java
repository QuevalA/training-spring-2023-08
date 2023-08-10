package com.quevala.trainingspring202308.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        try (var context =
                        new AnnotationConfigApplicationContext
                                (HelloWorldConfiguration.class))
        {
            System.out.println("var name = " + context.getBean("name"));
            System.out.println("var age = " + context.getBean("age") + "\n");
            //System.out.println("Address class call = " + context.getBean(Address.class) + "\n");
            System.out.println("Object address0 = \n" + context.getBean("address0") + "\n");
            System.out.println("Object person0 = \n" + context.getBean("person0") + "\n");
            System.out.println("Object person1 = \n" + context.getBean("person1") + "\n");
            System.out.println("Object person2 = \n" + context.getBean("person2MethodCall") + "\n");
            System.out.println("Object person3 = \n" + context.getBean("person3Parameters"));
        }
    }
}
