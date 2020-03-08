package hw7;

public class Cat {
    private String name;
    private boolean satiety;
    private int hunger;
    {
        this.satiety = false;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.hunger = appetite;
    }

    public void eat(FoodPlate plate) {
        if(plate.getFood() >= hunger){
            plate.decreaseFood(hunger);
            System.out.println("Cat " + name + " eat...");
            satiety = true;
        }else {
            System.out.println("Cat " + name + "  no eat");
        }

    }

        public String getName() {
            return name;
        }



        public boolean isSatiety() {
            return satiety;
        }

        @Override
        public String toString() {
            return "Cat " + name +
                    ", satiety: " + satiety +
                    ", appetite: " + hunger;
        }
    }

//

