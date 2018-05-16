package com.ganesh.ds.linkedList;

import com.ganesh.ds.common.Node;

public class DeleteMiddleNode {

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
		Node n = head.next.next.next.next.next;
		displayLinkedList(head);
		boolean flag = deleteMiddleNode(n);
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		System.out.println(" Middle node delete : "+flag );
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
	
	private static boolean deleteMiddleNode(Node n) {
		if(n == null || n.next == null) {
			return false;
		}
		
		Node next = n.next;
		n.data = next.data;
		n.next = next.next;
		next.next = null;		
		return true;
	}

}
