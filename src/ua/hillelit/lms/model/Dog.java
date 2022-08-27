package ua.hillelit.lms.model;

public class Dog extends Animal{
    static int number=0;

    public Dog(String name) {
        super(name);
        number++;
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println(super.getName() +" пробіг " + length + " м.");
        } else {
            System.out.println(super.getName() +" стільки не бігає");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println(super.getName() +" проплив " + length + " м.");
        } else {
            System.out.println(super.getName() +" стільки не плаває");
        }
    }

    public static void printNumber(){
        System.out.println("Кількість створених собак: " +number);
    }
}
