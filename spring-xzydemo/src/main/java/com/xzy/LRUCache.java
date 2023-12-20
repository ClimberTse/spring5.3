package com.xzy;
import java.util.*;

class LRUCache {
	private int capacity;

	private static LinkedHashMap<Integer, Integer> map;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new LinkedHashMap<>();
	}

	public int get(int key) {
		return map.getOrDefault(key, -1);
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			map.put(key, value);
		} else if (map.size() >= capacity) {
			map.remove(map.keySet().iterator().next());
			map.put(key, value);
		} else if (map.size() < capacity) {
			map.put(key, value);
		}
	}




}
