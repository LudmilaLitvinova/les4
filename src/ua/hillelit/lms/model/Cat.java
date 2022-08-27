package ua.hillelit.lms.model;

public class Cat extends Animal{

    static int number=0;

    public Cat(String name) {
        super(name);
        number++;
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println(super.getName() +" пробіг " + length + " м.");
        } else {
            System.out.println(super.getName() +" стільки не бігає");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(super.getName() + " не плаває");
    }

    public static void printNumber(){
        System.out.println("Кількість створених котів: " +number);
    }
}
