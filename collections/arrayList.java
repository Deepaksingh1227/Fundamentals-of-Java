package collections;

import java.util.*;

public class arrayList {

    static class Car {
        String brand;

        Car(String brand) {
            this.brand = brand;
        }
    }

    public static void main(String args[]) {
        ArrayList<String> user = new ArrayList<>();

        user.add("Deepak");
        user.add("Shiv");
        user.add("saurabh");
        user.add("riya");

        System.out.println("All Users Blongss To This List:  ");
        for (String users : user) {
            System.out.println(users);
        }
        System.out.println("getting user using index: " + user.get(2));
        user.add("rawat");
        System.out.println("All Users Blongss To This List:  ");
        for (String users : user) {
            System.out.println(users);
        }

        // list of objects
        Car c1 = new Car("Maruti");
        Car c2 = new Car("swift");

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(c1);
        carList.add(c2);

        System.out.println("All cars");
        for (Car car : carList) {
            System.out.println(car.brand);
        }

    }

}
