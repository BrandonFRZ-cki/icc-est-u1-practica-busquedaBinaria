package views;

import models.Person;
import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        int opcion = 0;
        System.out.println("----- MENU PRINCIPAL -----");
        System.out.println("1. Crear Arreglo de Personas");
        System.out.println("2. Ordenar Persona por Nombre (Burbuja)");
        System.out.println("3. Ordenar Persona por Nombre (Seleccion Descendente)");
        System.out.println("4. Ordenar Persona por Edad (Inserción)");
        System.out.println("5. Ordenar Persona por Nombre (Inserción)");
        System.out.println("6. Buscar Persona por Edad");
        System.out.println("7. Buscar Persona por Nombre");
        System.out.println("8. Mostrar Personas");
        System.out.println("9. Salir");
        System.out.println("-------------------------");
        System.out.print("Seleccione una opción → ");
        opcion = scanner.nextInt();
        return opcion;
    }

    public Person inputPerson() {
        Person person = new Person(inputName(),inputAge());
        System.out.println("---");
        return person;
    }

    public int selectSortingMethod() {
        return scanner.nextInt();
    }

    public int selectSearchCriterion() {
        return scanner.nextInt();
    }

    public void displayPersons(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void displaySearchResult(Person person) {
        if (person != null) {
            System.out.println(person);
        } else {
            System.out.println(" ***** Persona no Encontrada");
        }
    }

    public int inputAge() {
        System.out.print("\nIngrese la edad:");
        int age = scanner.nextInt();
        return age;
    }

    public String inputName() {
        System.out.print("\nIngrese el nombre:");
        String name = scanner.next();
        return name;
    }
    public int inputInt(String message) {
        System.out.print("\n"+message);
        int num = scanner.nextInt();
        return num;
    }
}