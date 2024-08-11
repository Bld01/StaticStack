public class Main {

    public static void main(String[] args) {
        StaticStack s = new StaticStack(5);

        s.push("A");
        s.push(20);
        s.push(30.5);

        s.printStack();

    }
}