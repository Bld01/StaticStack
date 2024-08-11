public class StaticStack<T> {
    private int top = -1;
    private T[] data;

    public StaticStack(int size) {
        data = (T[]) new Object[size];
    }

    public void push(T item) {
        if (isFull()) {
            throw new IllegalStateException("Pilha Cheia");
        }

        data[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha Vazia");
        }
        T item = data[top];
        data[top--] = null;
        return item;
    }

    public void clear() {
        while (!isEmpty()) {
            pop();
        }
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Pilha Vazia");
            return;
        }

        System.out.print("Itens da Pilha: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}
