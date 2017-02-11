package hashpackage;

/**
 * Created by admin on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyHashTable t=new MyHashTable(100);
        for (int counter=0;counter<1000;counter++)
            t.put(Integer.toString(counter),Integer.toString(counter+1));
        String r=t.get(Integer.toString(194));
        System.out.println(r);
    }
}
