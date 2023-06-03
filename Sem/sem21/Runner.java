package Sem.sem21;

public interface Runner {
    private final String name = "Persik";
    private final int maxRun;
    private  final int maxJump;

    public Cat(String name, int maxRun, int maxJump){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    default boolean jump(int height){
        if(heigth<=maxJump){
            System.out.printf("%s prignul: %d\n", name, heigth);
            return true;
        }
        else {
            System.out.printf("%s ne prignul: %d\n", name, heigth);
            return false;
        }
    }

    default boolean run(int length){
        if(length<=maxRun){
            System.out.printf("%s probezhal po dorozhke: %d\n", name, length);
            return true;
        }
        else {
            System.out.printf("%s ne probezhal: %d\n", name, length);
            return false;
        }
    }
}
