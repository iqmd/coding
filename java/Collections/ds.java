import java.util.*;

class ds{

    public static void main(String args[]){
        Set<Integer> arr = new HashSet<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(8);
        arr.add(9);
        arr.add(4);
        arr.add(14);
        arr.add(57);


        // Iterator<Integer> it = arr.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        //

        Map<Character, Integer> dict = new HashMap<>();

        dict.put('a',1);
        dict.put('b',2);
        dict.put('c',3);
        dict.put('d',4);

        if(dict.containsValue(9)){
            System.out.println("true");
        }

        Set<Map.Entry<Character,Integer>> entrySet = dict.entrySet();

        for(Map.Entry<Character,Integer> e:entrySet){
            System.out.println(e.getValue());
        }

        System.out.println("====");
        for(Integer i:arr){
            System.out.println(i);
        }

        String str1 = "tr";
        String str2 = "tr";


        if(str1.equals(str2)) System.out.println("equal");
        if(str1.charAt(1) == 'r')System.out.println("equal");



        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.addAll(arr);
        Collections.sort(list);
        if(list.containsAll(arr)){
            System.out.println("Yes");
        }
        System.out.println(list);

        // for(int i=0; i < narr.length; i++){
        //     System.out.println(narr[i]);
        // }

    }

}
