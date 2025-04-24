package controllers;

import models.Person;

public class SearchMethods {
    public Person binarySearchByAge(Person[] persons, int age) {
        int low = 0;
        int high = persons.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (persons[mid].getAge() == age) {
                return persons[mid];
            } else if (persons[mid].getAge() < age) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public Person binarySearchByName(Person[] persons, String name) {
        int bajo = 0;
        int alto = persons.length - 1;
        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            if (persons[centro].getName().equals(name)) {
                return persons[centro];
            } else if (persons[centro].getName().compareTo(name) < 0) {
                bajo = centro + 1;
            } else {
                alto = centro - 1;
            }
        }
        return null;
    }

}