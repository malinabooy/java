package Lek.lek1;

/**
 * Это точка 2д
 */
public class task1 {
    private int x,y;
    /**
     * Это конструктор
     * @param valueX коорд х
     * @param valueY коорд у
     */
    public task1(int valueX, int valueY){
        x = valueX;
        y = valueY;
    }

    public task1(int value) {
        this(value, value);
    }

    public task1() {
        this(10, 11);
    }

    public int getX(){
        return x;

    }

    public int getY(){
        return y;
        
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }


    //ctor
    //get; set;
    //docs
    /* 
    public task1(){
        x = 0;
        y = 0; 
    }
    public task1(int value) {
        x = value;
        y = value;
    }
    */
    /*
         public String getInfo(){
        return String.format("x: %d; y: %d", x,y);
    }
     */


    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x,y);//getInfo();
    }

    public static double distance(task1 a, task1 b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
        
    }

}
