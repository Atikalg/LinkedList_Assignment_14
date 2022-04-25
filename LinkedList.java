package com.bridgelab.Assignment_14_LinkedList;
/*
 * @author : Atik
 * Ability to create Linked List by adding 30 and 56 to 70
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
		        //Adding Data in Node
		        if(head == null) {
		            head = newNode;
		            tail = newNode;
		        } else {
		            newNode.next = head;
		            head = newNode;
		        }
		    }

		    //Display Node in Linked List
		    public void displayLinkedList() {
		        if(head == null) {
		            System.out.println("Linked List is Empty.");
		        } else {
		            Node temp = head;
		            while (temp != null) {
		                System.out.print(temp.data + " -> ");
		                temp = temp.next;
		            }
		        }
		    }
		}
	public class LinkedList {
	    public static void main(String[] args) {
	    	  //Welcome Message
	        System.out.println("Welcome to LinkedList Data Structures Problem.");

	        LinkedListData linkedList = new LinkedListData();

	        //Insert 70, 50, 36 in Linked List Nodes
	        linkedList.insertFirst(70);
	        linkedList.insertFirst(30);
	        linkedList.insertFirst(56);

	        //Showing Linked List Data
	        linkedList.displayLinkedList();
	    }
}
	
	
