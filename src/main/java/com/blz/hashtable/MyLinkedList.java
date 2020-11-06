package com.blz.hashtable;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<K> myNode) {
		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode<K> popLast() {
		INode<K> tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public INode<K> search(K key) {
		INode<K> tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void printMyNodes() {
		System.out.println("My nodes are: " + head);
	}

	public INode<K> removeNode(INode<K> deleteNode) {
		INode tempNode = this.head;
		INode prev = null;
		if (tempNode != null && tempNode.getKey() == deleteNode.getKey()) {
			tempNode.setNext(null);
			return tempNode;
		} else {
			while (tempNode != null && tempNode.getKey() != deleteNode.getKey()) {
				prev = tempNode;
				tempNode = tempNode.getNext();
			}
			prev.setNext(tempNode.getNext());
			tempNode.setNext(null);
			return tempNode;
		}
	}

	@Override
	public String toString() {
		return "MyLinkedListNodes{ " + head + " }";
	}
}
