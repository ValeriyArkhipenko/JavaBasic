/**
 * Java 1. Homework 7
 * 
 * @author ValeriyArkhipenko
 * @version 4.11.2021
 */
 
 public class Lesson7Homework {

   public static void main(String[] args) {
        Cat[] catArray = {new Cat("Мурзик", 7), new Cat("Рыжик", 5), new Cat("Черныш", 3), new Cat("Барсик", 4)};
        for (Cat i : catArray) {
            System.out.println(i);
        }

        Plate plate = new Plate(14);
        System.out.println(plate);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
        }
        System.out.println(plate);
        plate.addFood(10);
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
        }

        for (Cat i : catArray) {
            System.out.println(i);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    @Override
    public String toString() {
        return "Кот " + name + ", аппетит - " + appetite + ". " + (fullness == true ? "Нажрался." : "Стучит миской.");
    }

    public void eat(Plate plate) {
        if (this.fullness) {
            System.out.println("    Кот " + this.name + " не стал есть");
            return;
        }
        if (plate.decreaseFood(this.appetite)) {
            this.fullness = true;
            System.out.println("    кот " + this.name + " поел и стал сыт");
        } else {
            System.out.println(" Не хватило еды для " + this.name);
        }
    }
}

class Plate {
    private int food;

    Plate(int capacity) {
        this.food = capacity;
    }

    @Override
    public String toString() {
        return "В миске " + food + " еды";
    }

    public void addFood(int food) {
        this.food += food;
    }

    public boolean decreaseFood(int volume) {
        if (this.food >= volume) {
            this.food -= volume;
            return true;
        } else {
            return false;
        }
    }
}