package com.ganesh.ds.linkedList;

import com.ganesh.ds.common.Node;

public class ReturnKthtoLast {

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
		head = insertNodeAtEnd(head,9);
		head = insertNodeAtEnd(head,8);
		displayLinkedList(head);
		printKthToLast(head, 3);
		Node n = kthToLastUsingIterative(head, 3);
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		System.out.println(" kth node is "+ n.data);
		//displayLinkedList(head);

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
	
	public static int printKthToLast(Node head, int k) {
		if(head == null) {
			return 0;
		}
		
		int index = printKthToLast(head.next, k) + 1;
		if(index == k) {
			System.out.println(k +"th to last node is "+head.data);
		}
		return index;
	}
	
	public static Node kthToLastUsingIterative(Node head, int k) {
		Node p1 = head;
		Node p2 = head;
		for(int i=0; i<k;i++) {
			if(p1 == null) {
				return null;
			}
			p1=p1.next;
		}
		
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

}
