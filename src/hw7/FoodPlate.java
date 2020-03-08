package hw7;

public class FoodPlate {
    private int food;

    public FoodPlate(int food){ this.food = food; }

    public int getFood() {
        return food;
    }

    public void increaseFood(int inc){
        if(inc > 0) {
            food += inc;
        }
    }
    public boolean decreaseFood(int dec){
        if(dec > 0 ) {
            food -= dec;
            return true;
        } else {
            return false;
        }
    }
    public void info(){
        System.out.println("Food in plate: "+ food);
    }
}

//