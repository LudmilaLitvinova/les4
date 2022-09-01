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
          super.run(length);
        } else {
            System.out.println(getName() +" стільки не бігає");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(getName() + " не плаває");
    }

    public static void printNumber(){
        System.out.println("Кількість створених котів: " +number);
    }
}
