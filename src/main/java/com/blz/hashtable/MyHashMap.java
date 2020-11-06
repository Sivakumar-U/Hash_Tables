package com.blz.hashtable;

public class MyHashMap<K, V> {
	MyLinkedList<K> myLinkedList;

	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

	public V get(K key) {
		MyHashMapNode<K, V> mapNode = (MyHashMapNode<K, V>) this.myLinkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();

	}

	public void add(K key, V value) {
		MyHashMapNode<K, V> mapNode = (MyHashMapNode<K, V>) this.myLinkedList.search(key);
		if (mapNode == null) {
			mapNode = new MyHashMapNode<>(key, value);
			this.myLinkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{ " + myLinkedList + " }";
	}
}
