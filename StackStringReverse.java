import java.util.*;

public class StackStringReverse {
    public static String strreverse(String str) {
        Stack<Character> s = new Stack<>();
        int id = 0;
        // Push all characters of the string into the stack
        while (id < str.length()) {
            s.push(str.charAt(id));
            id++;
        }
        StringBuilder result = new StringBuilder();
        // Pop characters from the stack and append to the result
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abs";
        System.out.println(strreverse(str));  // Output: "sba"
    }
}
