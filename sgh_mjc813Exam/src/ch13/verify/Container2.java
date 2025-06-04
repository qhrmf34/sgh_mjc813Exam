package ch13.verify;

public class Container2<K,M> {
    private K key;
    private M value;
    public K getKey() {
        return key;
    }
    public void set(K key, M value) {
        this.key = key;
        this.value = value;
    }
    public M getValue() {
        return value;
    }
 }
