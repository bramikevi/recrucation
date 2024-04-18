package com.streams.streams_group_by;

import com.streams.model.City;
import com.streams.model.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static org.assertj.core.api.Assertions.assertThat;

public class StreamTests {

    @Test
    void test1(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        List<String> words = Arrays.asList("apple", "banana", "carrot", "avocado", "blueberry");

        Map<Character, List<String>> wordsByFirstLetter = words.stream()
                .collect(groupingBy(s -> s.charAt(0)));

        List<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());

        Stream<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0);

        List<Integer> e = evenNumbers.toList();

        assertThat(sum).isEqualTo(15);
    }

    @Test
    void test2(){
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);
    }

    @Test
    void test3() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        Map<String, List<Integer>> evenOddMap = listOfLists.stream()
                .flatMap(list -> list.stream())
                .collect(groupingBy(
                        num -> num % 2 == 0 ? "even" : "odd"
                ));

        System.out.println(evenOddMap);
    }

    @Test
    void test4() {

        List<Person> people = Arrays.asList(
                new Person("John", "Doe", "New York"),
                new Person("Alice", "Smith", "Paris"),
                new Person("Bob", "Johnson", "New York"),
                new Person("Emily", "Brown", "Paris"),
                new Person("Michael", "Davis", "Tokyo")
        );

        Map<String, List<Person>> peopleByCity = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCityName // klucz grupy
                ));

        Map<String, List<String>> namesByCity = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCityName, // klucz grupy
                        Collectors.mapping(
                                Person::getFirstName, // przekształcenie wartości (imię)
                                Collectors.toList() // kolektor zbierający imiona w listę
                        )
                ));

        System.out.println(peopleByCity);
    }

    @Test
    void test5() {
        List<Person> people = Arrays.asList(
                new Person("John", "Doe", new City("New York")),
                new Person("Alice", "Smith", new City("Paris")),
                new Person("Bob", "Johnson", new City("New York")),
                new Person("Emily", "Brown", new City("Paris")),
                new Person("Michael", "Davis", new City("Tokyo"))
        );

        Map<City, List<Person>> peopleByCity = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity // klucz grupy
                ));

        System.out.println(peopleByCity);
    }

    @Test
    void test6() {
        List<Person> people = Arrays.asList(
                new Person("John", "Doe", new City("New York")),
                new Person("Alice", "Smith", new City("Paris")),
                new Person("Bob", "Johnson", new City("New York")),
                new Person("Emily", "Brown", new City("Paris")),
                new Person("Michael", "Davis", new City("Tokyo"))
        );

        Map<City, List<String>> peopleByCity = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity, // klucz grupy
                        Collectors.mapping(
                                Person::getLastName,
                                Collectors.toList()
                        )
                ));

        System.out.println(peopleByCity);
    }

    @Test
    void test7() {
        List<Person> people = Arrays.asList(
                new Person("John", Arrays.asList(10, 20, 30)),
                new Person("Alice", Arrays.asList(15, 25, 35)),
                new Person("Bob", Arrays.asList(12, 22, 32))
        );

        // Utwórz mapę, gdzie kluczem jest osoba, a wartością suma punktów
        Map<Person, Integer> pointsByPerson = people.stream()
                .collect(Collectors.toMap(
                        person -> person, // Klucz - osoba
                        person -> person.getPoints().stream().mapToInt(Integer::intValue).sum() // Wartość - suma punktów
                ));

        // Wyświetl uzyskaną mapę
        pointsByPerson.forEach((person, totalPoints) -> System.out.println(person.getFirstName() + ": " + totalPoints));

    }
}
