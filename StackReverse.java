import java.util.Stack;

public class StackReverse {

    // Function to push an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Function to print all elements of the stack
    public static void print(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    // Function to reverse the stack
    public static void ReverseStack(Stack<Integer> s) {
        if (s.isEmpty()) { // Base case to stop recursion
            return;
        }
        int top = s.pop();
        ReverseStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // print(s);
        ReverseStack(s);
        print(s);
    }
}
