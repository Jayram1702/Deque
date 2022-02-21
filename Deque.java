import java.util.*;
public class Deque<Item> implements Iterable<Item> {
    
    private Node first, last;
    int lenth ;
    private class Node{
        Item item;
        Node next;
    }

    // construct an empty deque
    public Deque(){
        first = null;
        last = null;
        lenth = 0;
    }

    // is the deque empty?
    public boolean isEmpty(){
        if (first == null && last == null){
            return true;
        }
        return false;
    }

    // return the number of items on the deque
    public int size(){
        return lenth;
    }

    // add the item to the front
    public void addFirst(Item item){
        if(item == null) throw new IllegalArgumentException();
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        lenth = lenth + 1;
    }

    // add the item to the back
    public void addLast(Item item){
        if(item == null) throw new IllegalArgumentException();
        Node oldlast = last;
        last = new Node();
        last.item = item;
        oldlast.next = oldlast;
        lenth = lenth + 1;
    }

    // remove and return the item from the front
    public Item removeFirst(){
        if(isEmpty()) throw new NoSuchElementException(); 
        Item item = first.item;
        first = first.next;
        lenth = lenth - 1;
        return item;    
    }

    // remove and return the item from the back
    public Item removeLast()

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator()

    // unit testing (required)
    public static void main(String[] args)

