import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        String str = "23";
        List<String> lst = new ArrayList<>();
        lst.add("");
        List<String> lst2 = new ArrayList<>();

        char[] digits = str.toCharArray();
        for(char digit: digits){
            String letters = phoneMap.get(digit);
            for(char letter: letters.toCharArray()){
                for(String s : lst){
                    lst2.add(s + letter);
                }
            }
            lst.clear();
            lst.addAll(lst2);
            lst2.clear();
        }
    }
}