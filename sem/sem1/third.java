package sem.sem1;
import java.util.Arrays;

//Дан массив nums = [3,2,2,3] и число val = 3. 
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class third {

    public static void main(String[] args) {
        int num[] = { 3,3,2,1,2,1, 2, 2, 3 };
        int val = 3;
        int count = 0;
        int end = num.length - 1;
        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            if (num[i] == val) {
                result[end--] = num[i];
            } else {
                result[count++] = num[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}