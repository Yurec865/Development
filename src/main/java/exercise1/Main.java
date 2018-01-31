package exercise1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(11);
            arrayList.add(13);
            arrayList.add(17);
            System.out.println("ArrayList : " + arrayList);

            List<String> linkedList = new LinkedList<>();
            linkedList.add("Barsik");
            linkedList.add("Murzik");
            linkedList.add("Ryzhik");
            System.out.println("LinkedList : " + linkedList);

            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Yura", 1);
            hashMap.put("Dima", 2);
            hashMap.put("Kolya", 3);
            System.out.println("HashMap : " + hashMap);

            Map treeMap = new TreeMap<>();
            treeMap.put("Yura", "Shnurenko");
            treeMap.put("Dima", "Shnurenko");
            treeMap.put("Sergey", "Drozd");
            System.out.println("TreeMap : " + treeMap);

            HashSet<String> countryHashSet = new HashSet<>();
            countryHashSet.add("Украина");
            countryHashSet.add("Россия");
            countryHashSet.add("Польша");
            System.out.println("HashSet : " + countryHashSet);

            SortedSet<Integer> numberSet = new TreeSet<>();
            numberSet.add(1);
            numberSet.add(89);
            numberSet.add(25);
            System.out.println("TreeSet : " + numberSet);

            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                    System.out.println("Iterator ArrayList : " + iterator.next());
            }
            Iterator iterator2 = linkedList.iterator();
            while (iterator2.hasNext()) {
                    System.out.println("Iterator LinkedList : " + iterator2.next());
            }
            Iterator iterator3 = countryHashSet.iterator();
            while (iterator3.hasNext()) {
                    System.out.println("Iterator CountryHashSet : " + iterator3.next());
            }
            Iterator iterator4 = numberSet.iterator();
            while (iterator4.hasNext()) {
                    System.out.println("Iterator NumberSet : " + iterator4.next());
            }
            Iterator iterator5 = hashMap.entrySet().iterator();
            while (iterator5.hasNext()) {
                    System.out.println("Iterator HashMap : " + iterator5.next());
            }
            Iterator iterator6 = treeMap.entrySet().iterator();
            while (iterator6.hasNext()) {
                    System.out.println("Iterator TreeMap : " + iterator6.next());
            }
    }
}
