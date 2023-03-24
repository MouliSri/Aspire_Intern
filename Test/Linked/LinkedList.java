package Linked;

import java.util.Iterator;

public class LinkedList<T> {
	Node head;
	Node last;
	
	class Node{
		T val;
		Node next;
		Node(T data){
			val=data;
			next=null;
		}
	}
	LinkedList(){
		head=null;
		last=null;
	}
	
	public void add(T value) {
		
		if(head==null) {
		Node newNode=new Node(value);
		head=newNode;
		
		}
		else
		{
			Node newNode=new Node(value);
			newNode.next=head;
			head=newNode;
			
		}
	}
	
	public void show() {
		last=head;
		while(last!=null) {
			System.out.println(last.val);
			last=last.next;
		}
	}

//	public Iterator<Integer> iterator() {
//		 Iterator itr=last.iterator();
//	     while() {
//	    	 
//	     }
//		return null;
//	}
//	

}
