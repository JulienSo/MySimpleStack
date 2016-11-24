package MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Julien on 24/11/2016.
 * Test de la classe MySimpleStack
 */
public class MySimpleStackTest {

    private SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new MySimpleStack();
        System.out.println("Je suis executé avant chaque test");
    }

    @Test
    public void isEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element = "toto";
        simpleStack.push(new Item(element));
        Assert.assertEquals(false, simpleStack.isEmpty());

    }

    @Test
    public void getSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element = "toto";
        simpleStack.push(new Item(element));
        simpleStack.push(new Item(element + "2"));
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void peek() throws Exception {
        Item ita = new Item(8);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //ne doit pas retirer l'objet de la pile
        Assert.assertEquals(1, simpleStack.getSize());
        //on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void pop() throws Exception {
        Item ita = new Item(8);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        //doit retirer l'objet de la pile
        Assert.assertEquals(0, simpleStack.getSize());
        //on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void push() throws Exception {
        Item ita = new Item(8);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        //La taille de la pile doit etre incrémentée de 1
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //on doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

}