package com.opentuned.dataStructures.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 04/02/2015
 * Time: 10:20
 */
public class AbstractPriorityQueue<K, V> implements IPriorityQueue<K, V>{
    
    protected static class PQEntry<K, V> implements IEntry<K, V> {

        private K k;
        private V v;
        
        public PQEntry(K key, V value){
            k = key;
            v = value;
        }
        
        public K getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }
        
        protected void setKey(K key){
            k = key;
        }
        
        protected void setValue(V value){
            v = value;
        }
    }
    
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public IEntry<K, V> insert(K key, V val) {
        return null;
    }

    @Override
    public IEntry<K, V> min() {
        return null;
    }

    @Override
    public IEntry<K, V> removeMin() {
        return null;
    }
}
