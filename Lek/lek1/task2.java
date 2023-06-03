package Lek.lek1;

public class task2 {

    public static void main(String[] args) {
        task1 a = new task1(0);
        a.setX(12);
        a.setY(13);

        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getY());

        task1 b = new task1();

        System.out.println(b);
        var dis = task1.distance(a,b);
        System.out.println(dis);

    }
}
