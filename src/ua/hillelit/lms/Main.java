package ua.hillelit.lms;

import ua.hillelit.lms.model.Animal;
import ua.hillelit.lms.model.Cat;
import ua.hillelit.lms.model.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобік");
        Dog dogDobik = new Dog("Добік");
        Dog dogRex = new Dog("Рекс");
        Cat catMonya = new Cat("Моня");
        Cat catRonya = new Cat("Роня");

        dogBobik.run(50);
        dogDobik.run(508);
        dogRex.swim(7);
        dogBobik.swim(20);
        catMonya.run(100);
        catRonya.run(600);
        catMonya.swim(2);

        Animal.printNumber();
        Cat.printNumber();
        Dog.printNumber();
    }
}
