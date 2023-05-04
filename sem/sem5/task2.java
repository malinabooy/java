package sem.sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь

 */
public class task2 {
    public static boolean isCorrect(String str) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> dict = new HashMap<>();
        dict.put('{', '}');
        dict.put('(', ')');
        dict.put('[', ']');
        dict.put('<', '>');

        for (char item : str.toCharArray()) {
            if (dict.containsKey(item)) {
                stack.push(item);
            } else if (dict.containsValue(item)) {
                if (!dict.get(stack.pop()).equals(item)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "a+(d*3)";
        if (isCorrect(str)) {
            System.out.println("Истина");
        } else
            System.out.println("Ложь");
    }
}
