package Sem.hw2;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Murzik", 5);
        cats[2] = new Cat("Tom", 10);
        cats[3] = new Cat("Pushok", 5);

        Plate plate = new Plate(10);
        plate.info();
        System.out.println();

        // for (Cat cat : cats) {
        // cat.eat(plate);
        // System.out.println(cat.getName() + ": " + (cat.isSatiety() ? "Satisfied" :
        // "Hungry"));
        // plate.info();
        // }
        // }
        int count = 0; // Счётчик добавления еды

        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i];
            cat.eat(plate);
            System.out.println(cat.getName() + ": " + (cat.isSatiety() ? "Сытый" : "Голодный"));
            plate.info();
            System.out.println();

        
            if (count < 1) {
                //Если в тарелке еды меньше, чем хочет кот, то добавляем
                if (plate.getFood() < cat.getAppetite()) {
                    plate.addFood(10);
                    System.out.println("Добавили еды: " + plate.getFood());
                    i--; // Возвращаемся к предыдущему коту
                }
                count++;//сообщаем, что уже добавляли корм
            } else {
                count--;
            }

        }
    }
}
