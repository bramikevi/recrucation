package com.streams.model;

import java.util.List;

public class Person {


    private String firstName;
    private String lastName;
    private String cityName;
    private City city;
    private List<Integer> points;

    public Person(String firstName, List<Integer> points) {
        this.firstName = firstName;
        this.points = points;
    }

    public Person(String firstName, String lastName, String cityName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityName = cityName;
    }

    public Person(String firstName, String lastName, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public City getCity() {
        return city;
    }

    public String getCityName() {
        return cityName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

