package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.makeSound();
        cat.legs++;

        Animal dog = new Animal();
        System.out.println(dog.legs); // 5
      //  dog.ABC = 2342;







        Animal.makeSound();
        int nogi = Animal.legs; // 0

        System.out.println();


        String str1 = new String("Hello");
        String str2 = new String("Hello");
       // System.out.println(str1==str2); <= так не надо
        System.out.println(str1.equals(str2)); // true

        // литерально
        String a1 = "Moscow";
        String a2 = "Moscow";
        // System.out.println(a1==a2); // true
        System.out.println(a1.equals(a2)); // true

        String abc = "Hello";
        System.out.println(abc.hashCode());
        abc += " World!";
        System.out.println(abc.hashCode());

        // класс String неизмен - immutable

        // StringBuffer // thread-safe
        // Эти два класс изменяют строки  - mutable
        StringBuilder strb = new StringBuilder(str1); // Hello
        System.out.println(strb.hashCode());
        strb.append(" Moscow!");
        System.out.println(strb.hashCode());

    }
}
