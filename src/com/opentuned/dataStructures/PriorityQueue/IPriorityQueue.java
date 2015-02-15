package com.opentuned.dataStructures.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 04/02/2015
 * Time: 10:21
 */
public interface IPriorityQueue<K, V> {

    public int size();

    public boolean isEmpty();
    
    public IEntry<K, V> insert(K key ,V val);
    
    public IEntry<K, V> min();
    
    public IEntry<K, V> removeMin();
}
