package com.blz.hashtable;

public class MyHashMapNode<K, V> implements INode<K> {

	K key;
	V value;
	MyHashMapNode<K, V> next;

	public MyHashMapNode(K key, V value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = (MyHashMapNode<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder mapNode = new StringBuilder();
		mapNode.append("MyHashMapNode { " + " K = ").append(key).append(" V = ").append(value).append(" } ");
		if (next != null) {
			mapNode.append("->").append(next);
		}
		return mapNode.toString();
	}

}
