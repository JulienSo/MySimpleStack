package MySimpleStack;

import java.util.EmptyStackException;

import java.util.Stack;

/**
 * Created by Julien on 23/11/2016.
 * class Mysimplestack implémentant l'interface SimpleStack comme demandé
 * correspondance avec l'exigence #3
 */
public class MySimpleStack implements SimpleStack {

    private Stack<Object> wrappedStack = new Stack<>();

    @Override
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }

    @Override
    public void push(Item item) {
        wrappedStack.push(item);
    }
}
