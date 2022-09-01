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
            super.run(length);
        } else {
            System.out.println(getName() +" стільки не бігає");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            super.swim(length);
        } else {
            System.out.println(getName() +" стільки не плаває");
        }
    }

    public static void printNumber(){
        System.out.println("Кількість створених собак: " +number);
    }
}
