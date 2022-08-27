package ua.hillelit.lms.model;

public class Animal {
    static int number=0;
    private final String name;

    public Animal(String name) {
        this.name = name;
        number++;
    }

    public String getName() {
        return name;
    }

    public void run(int length) {
        System.out.println( name +" пробігла " + length + " м.");
    }

    public void swim(int length) {
        System.out.println(name +" проплила " + length + " м.");
    }

    public static void printNumber(){
        System.out.println("Кількість створених тварин: " + number);
    }
}
