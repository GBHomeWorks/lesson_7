package hw7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vasya", 5),
                new Cat("Semen", 8),
                new Cat("Jacki", 3),
                new Cat("Gavrila", 7),
                new Cat("Grisha", 5)
        };

        FoodPlate plate = new FoodPlate(27);

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        plate.increaseFood(10);
        plate.info();
    }
}
