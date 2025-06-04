package ch13.verify;

public class Util{
    public static <A extends Pair<K, V>,K,V> V getValue(A a, K k){
        if(a.getKey().equals(k)){
            return a.getValue();
        }
        else{
            return null;
        }
    }
}
