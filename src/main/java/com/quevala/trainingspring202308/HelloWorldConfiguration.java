package com.quevala.trainingspring202308;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {}

record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Léon";
    }

    @Bean
    public int age() {
        return 26;
    }

    @Bean
    public Person person0() {
        var person0 = new Person("Gaspard", 29, address0());
        return person0;
    }

    @Bean
    public Person person1() {
        var person1 = new Person("Jean", 20, new Address("rue du Pont", "Paris"));
        return person1;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address0());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address1) {
        return new Person(name, age, address1);
    }

    @Bean
    public Address address0() {
        var address0 = new Address("avenue Charles de Gaulle", "Lyon");
        return address0;
    }

    @Bean
    public Address address1() {
        var address1 = new Address("boulevard de la Paix", "Rouen");
        return address1;
    }
}
