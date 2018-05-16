package com.ganesh.ds.linkedList;

import java.util.HashSet;

import com.ganesh.ds.common.Node;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Node head = new Node();
		head.next=null;
		head.data = 1;
		
		head = insertNodeAtEnd(head,2);
		head = insertNodeAtEnd(head,3);
		head = insertNodeAtEnd(head,4);
		head = insertNodeAtEnd(head,4);
		head = insertNodeAtEnd(head,6);
		head = insertNodeAtEnd(head,7);
		head = insertNodeAtEnd(head,7);
		head = insertNodeAtEnd(head,8);
		displayLinkedList(head);
		head = removeDuplicates(head);
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
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
	
	public static Node removeDuplicates(Node head) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node previous = null;
		Node n = head;
		while(n != null) {
			if(set.contains(n.data)) {
				previous.next = n.next;
			}
			else {
				set.add(n.data);
				previous = n;
			}
			n=n.next;
		}
		return head;
	}
}
