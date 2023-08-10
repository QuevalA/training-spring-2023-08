package com.quevala.trainingspring202308.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Primary
    public Address address0() {
        var address0 = new Address("avenue Charles de Gaulle", "Genève");
        return address0;
    }

    @Bean
    public Address address1() {
        var address1 = new Address("boulevard de la Paix", "Troy");
        return address1;
    }

    @Bean
    @Primary
    public Person person0() {
        var person0 = new Person("Gaspard", 29, address0());
        return person0;
    }

    @Bean
    public Person person1() {
        var person1 = new Person("Jean", 20, new Address("rue du Pont", "Marseilles"));
        return person1;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address0());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }
}
