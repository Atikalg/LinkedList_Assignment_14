package com.bridgelab.Assignment_14_LinkedList;
/*
 * @author : Atik
 * Lets create a simple Linked List of 56, 30 and 70
 */class Node {
	    public int data;
	    public Node next;

	    //Node Constructor for Creating New Node
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedListData {
		Node head;
	    Node tail;
	    //Insert Data in New Node
	    public void insertFirst(int data) {
	        Node newNode = new Node(data);
	    }
	}

	public class LinkedList {
	    public static void main(String[] args) {
	    	 //Welcome Message
	        System.out.println("Welcome to LinkedList Data Structures Problems.");

	        LinkedListData linkedList = new LinkedListData();
	        //Insert 70, 50, 36 in Linked List Nodes
	        linkedList.insertFirst(70);
	        linkedList.insertFirst(30);
	        linkedList.insertFirst(56);
	    }
}
	
	
