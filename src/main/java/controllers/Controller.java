package controllers;

import models.Person;
import views.View;

public class Controller {
    private View view;
    private Person persons[];
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.persons = persons;
        this.sortingMethods = new SortingMethods();
        this.searchMethods = new SearchMethods();
    }
    public void start(){

    }
    public void insertPerson(){

    }
    public void sortPerson(){}
    public void searchPerson(){}

}
