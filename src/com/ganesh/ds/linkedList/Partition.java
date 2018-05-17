package com.ganesh.ds.linkedList;

import com.ganesh.ds.common.Node;

public class Partition {

	public static void main(String[] args) {
		Node head = new Node();
		head.next=null;
		head.data = 1;
		
		head = insertNodeAtEnd(head,5);
		head = insertNodeAtEnd(head,9);
		head = insertNodeAtEnd(head,2);
		head = insertNodeAtEnd(head,7);
		head = insertNodeAtEnd(head,3);
		head = insertNodeAtEnd(head,9);
		head = insertNodeAtEnd(head,98);
		head = insertNodeAtEnd(head,8);
		displayLinkedList(head);
		head = partition(head, 6);
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		//System.out.println(" Middle node delete : "+);
		displayLinkedList(head);

	}
	
	public static Node insertNodeAtEnd(Node head, int data) {
		Node n = head;
		while(n.next !=null) {
			n = n.next;
		}
		n.next = new Node();
		n=n.next;
		n.data = data;
		n.next = null;
		return head;
				
	}	

	public static void displayLinkedList(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node partition(Node n, int x) {
		
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		
		while(n != null) {
			Node newNode = n.next;
			n.next = null;
			
			if(n.data < x) {
				if(beforeStart == null) {
					beforeStart = n;
					beforeEnd = beforeStart;
				}
				else {
					beforeEnd.next = n;
					beforeEnd = beforeEnd.next;
				}									
			}
			else {
				if(afterStart == null) {
					afterStart = n;
					afterEnd = afterStart;
				}
				else {
					afterEnd.next = n;
					afterEnd = afterEnd.next;
				}
			}
			n = newNode;
		}
		
		if(beforeStart == null) {
			return afterStart;
		}
		beforeEnd.next = afterStart;
		return beforeStart;
	}
}
