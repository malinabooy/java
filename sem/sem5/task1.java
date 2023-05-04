package sem.sem5;
/*
 Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static boolean isIsomorph(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        Map<Character, Character> dict = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if(dict.containsKey(str1.charAt(i))){
                if(!dict.get(str1.charAt(i)).equals(str2.charAt(i))){
                    return false;
                }
            }
            else {
                dict.put(str1.charAt(i), str2.charAt(i));
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "paper";
        String str2 = "title";
        if(isIsomorph(str1, str2)){
            System.out.println("Isomorph");
        }
        else System.out.println("NO");

    }
}
