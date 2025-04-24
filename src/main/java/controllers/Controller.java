package controllers;

import models.Person;
import views.View;

public class Controller {
    private View view;
    private Person[] persons = new Person[0];
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
    }

    public void start() {
        while (true) {
            int option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    sortByNameBubble();
                    break;
                case 3:
                    sortByNameSelection();
                    break;
                case 4:
                    sortByAgeInsertion();
                    break;
                case 5:
                    sortByNameInsertion();
                    break;
                case 6:
                    searchByAge();
                    break;
                case 7:
                    searchByName();
                    break;
                case 8:
                    view.displayPersons(persons);
                    break;
                case 9:
                    return;
                default:
                    break;
            }
        }
    }

    public void inputPersons() {
        int n = view.inputInt("Ingrese el número de personas: ");
        persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i] = view.inputPerson();
        }
    }

    public void sortByNameBubble() {
        sortingMethods.sortByNameWithBubble(persons);
        System.out.println("Personas ordenadas por nombre (Burbuja).");
    }

    public void sortByNameSelection() {
        sortingMethods.sortByNameWithSelectionDes(persons);
        System.out.println("Personas ordenadas por nombre (Seleccion Descendente).");
    }

    public void sortByAgeInsertion() {
        sortingMethods.sortByAgeWithInsertion(persons);
        System.out.println("Personas ordenadas por edad (Inserción).");
    }

    public void sortByNameInsertion() {
        sortingMethods.sortByNameWithInsertion(persons);
        System.out.println("Personas ordenadas por nombre (Inserción).");
    }

    public void searchByAge() {
        Person person = searchMethods.binarySearchByAge(persons, view.inputAge());
        if(person==null){
            System.out.println("La Persona no existe");
        }
        else{
            System.out.println(person.toString());
        }
    }

    public void searchByName() {
        Person person = searchMethods.binarySearchByName(persons,view.inputName());
        if(person==null){
            System.out.println("La Persona no existe");
        }
        else{
            System.out.println(person.toString());
        }
    }
}