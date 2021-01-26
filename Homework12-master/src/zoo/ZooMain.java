package zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZooMain {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите: Cat, Dog, Duck или Tiger");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String scan = reader.readLine();

            while (scan != null) {

                switch (scan) {
                    case "Cat" -> {
                        Cat cat = new Cat();
                        System.out.println("Cat created");
                        cat.run();
                        cat.climb();
                    }
                    case "Dog" -> {
                        Dog dog = new Dog();
                        System.out.println("Dog created");
                        dog.run();
                    }
                    case "Duck" -> {
                        Duck duck = new Duck();
                        System.out.println("Duck created");
                        duck.run();
                        duck.fly();
                    }
                    case "Tiger" -> {
                        Tiger tiger = new Tiger();
                        System.out.println("Tiger created");
                        tiger.run();
                    }
                }
            }
        }
    }


