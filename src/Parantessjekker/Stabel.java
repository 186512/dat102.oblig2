package Parantessjekker;

public class Stabel<T> implements stabelADT<T>{
    private Stack<T> stack;

    public Stabel() {
        stack = new Stack<>();
    }

    @Override
    public void push(T newEntry) {
        stack.push(newEntry);
    }

    @Override
    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    @Override
    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void clear() {
        stack.clear();
    }
}
