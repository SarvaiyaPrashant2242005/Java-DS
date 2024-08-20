public class Stack_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean Isempty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (Isempty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (Isempty()) {
                return -1;
            }
            return head.data;
        }

        public static void main(String[] args) {
            Stack.push(1);
            Stack.push(2);
            Stack.push(3);

            while (!Stack.Isempty()) {
                System.out.println("^");

                System.out.println(Stack.peek());
                Stack.pop();
            }
        }
    }
}
