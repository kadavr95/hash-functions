package hashpackage;

import java.util.ArrayList;

/**
 * Created by admin on 10.02.2017.
 */
public class MyHashTable {
    ArrayList<Bucket>buckets=new ArrayList<>();
    MyHashTable(int n){
        for (int i=0; i<n; i++){
            buckets.add(new Bucket());
        }
    }
    String get(String k){
        Bucket b = getBucket(k);
        for (Pair p:b.pairs){
            if (p.key.equals(k)){
                return p.value;
            }
        }
        return null;
    }
    void put (String k, String v){
        Bucket b = getBucket(k);
        for (Pair p:b.pairs){
            if (p.key.equals(k)){
                p.value=v;
                return;
            }
        }
        b.pairs.add(new Pair(k,v));
    }

    private Bucket getBucket(String k) {
        int h=k.hashCode();
        int index=Math.abs(h%buckets.size());
        return buckets.get(index);
    }
}
