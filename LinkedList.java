package com.bridgelab.Assignment_14_LinkedList;

import java.util.Scanner;

/*
 * @author : Atik
 *  Ability to delete the first element in the LinkedList
 *  Write pop method.
 */
class Node {
	    public int data;
	    public Node next;

	    //Node Constructor for Creating New Node
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	//Operation and data storing 
	class LinkedListData {
		 int location = 0;

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
		        location++;
		        System.out.println("Location:"+location);
		    }

		    //Insert Data from Last
		    public void insertLast(int data) {
		        Node newNode = new Node(data);
		        if(tail == null) {
		            head = newNode;
		            tail = newNode;
		        } else {
		            tail.next = newNode;
		            tail = newNode;
		        }
		        location++;
		        System.out.println("Location: "+location);
		    }

		    //Insert New Node after Given Node
		    public void insertNthPosition(int data,int nthdata) {
		        Node newNode = new Node(data);
		        if(head == null) {
		            head = newNode;
		            tail = newNode;
		        } else {
		            Node temp = head;
		            Node nextNode;
		            while (temp != null) {
		                nextNode = temp.next;
		                if(temp.data == nthdata) {
		                    temp.next = newNode;
		                    newNode.next = nextNode;
		                }
		                temp = temp.next;
		            }
		        }
		    }
		    //Method to Delete First Node from Linked List
		    public void pop() {
		        if(head == null) {
		            System.out.println("Linked List is Empty.");
		        } else {
		            head = head.next;
		        }
		    }
		    //Method to Delete Last Node from Linked List
		    public void popLast() {
		        if(head == null) {
		            System.out.println("Linked List is Empty.");
		        } else {
		            Node second_Last = head;
		            while(second_Last.next.next != null)
		                second_Last = second_Last.next;
		                second_Last.next = null;
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
	        System.out.println("Welcome to LinkedList Data Structures Problems.");

	        Scanner sc = new Scanner(System.in);

	        LinkedListData linkedList = new LinkedListData();

	        int choice;
	        do {
	            System.out.println("1. Insert First \n2. Insert Last \n3. Display list \n4. Insert at Nth position \n5. Delete first element \n6. Delete last element \n7. EXIT \nEnter the Choice for Operation : ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the Data to Insert at First : ");
	                    int dataFirst = sc.nextInt();
	                    linkedList.insertFirst(dataFirst);
	                    break;
	                case 2:
	                    System.out.println("Enter the Data to Insert at Last : ");
	                    int dataLast = sc.nextInt();
	                    linkedList.insertLast(dataLast);
	                    break;
	                case 3:
	                    linkedList.displayLinkedList();
	                    System.out.println();
	                    break;
	                case 4:
	                    System.out.println("Enter the Data After which to Insert New Data : ");
	                    int nthData = sc.nextInt();
	                    System.out.println("Enter the Data : ");
	                    int data = sc.nextInt();
	                    linkedList.insertNthPosition(data,nthData);
	                    break;
	                case 5:
	                    linkedList.pop();
	                    break;
	                case 6:
	                    linkedList.popLast();
	                    break;
	            }
	        }while(choice != 7);
	    }
}
	
	
