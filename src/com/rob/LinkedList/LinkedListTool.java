package com.rob.LinkedList;

import java.util.LinkedList;

public class LinkedListTool {
    public Node head;
    public Node tail;

    public void setHead(Node node) {
        // Write your code here.
    }

    public void setTail(Node node) {
        // Write your code here.
    }

    public void insertBefore(Node node, Node nodeToInsert) {
        // Write your code here.
    }

    public void insertAfter(Node node, Node nodeToInsert) {
        // Write your code here.
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
        // Write your code here.
    }

    public void removeNodesWithValue(int value) {
        // Write your code here.
    }

    public void remove(Node node) {

    }

    public boolean containsNodeWithValue(int value) {
        if (this.containsNodeWithValue(value) ==true){
            return true;
        }
        return false;
    }

// Do not edit the class below.
static class Node {
    public int value;
    public Node prev;
    public Node next;

    public Node(int value) {
        this.value = value;
    }
}
}
