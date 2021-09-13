package com.algorithm.reverse_list;

public class Node {
    public int data;
    public Node next;

    public static Node reverse(Node head) {
        Node previous=null;
        Node current=head;
        Node forward;
        while(current != null) {
            forward=current.next;
            current.next=previous;
            previous=current;
            current=forward;
        }
        return previous;
    }
}
