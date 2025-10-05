import java.util.*;
class p {
    public static void main(String args[]){
        HashMap map = new HashMap();
        map.put(5,"apple");
        map.put(4,"jhdh");
        Set set =  map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me =(Map.Entry)i.next();
            System.out.println(me.getKey()+" : "+me.getValue());
            
        }
        System.out.println("Before shorting :");
        map.forEach((k,v)->System.out.println(k+" : "+v));
        
        TreeMap tmap = new TreeMap(map);
        tmap.forEach((k,v)->System.out.println(k+" : "+v));

    }
}
