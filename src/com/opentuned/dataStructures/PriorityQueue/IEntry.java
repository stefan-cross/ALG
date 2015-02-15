package com.opentuned.dataStructures.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 04/02/2015
 * Time: 10:32
 */
public interface IEntry<K, V> {
    
    K getKey();
    
    V getValue();
}
