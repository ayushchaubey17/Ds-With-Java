import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String ,Integer> hm = new HashMap<>();

        // insertion in hashmap
        hm.put("Tea",10);
        hm.put("coffee",30);
        hm.put("cococola",40);
        hm.put("maza",50);

        //output
        System.out.println(hm);     //{Tea=10, coffee=30, maza=50, cococola=40}

        //updating the value of maza not added an extra section
        hm.put("maza",40);

        System.out.println(hm);    //{Tea=10, coffee=30, maza=40, cococola=40}

        // get operation
        System.out.println(hm.get("coffee"));

        //contains key
        System.out.println(hm.containsKey("Tea"));

        //remove key
        hm.remove("Tea");
        System.out.println(hm);

        //for size
        System.out.println(hm.size());

        //IsEmpty
        System.out.println(hm.isEmpty());

        //clear

        hm.clear();
        System.out.println(hm);



    }
}
