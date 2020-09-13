

import java.util.*;

public class Main {

    public static void main(String[] args) {

    ClassOfMethods methods = new ClassOfMethods();

       /*List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("fffaaaaa");
        listOfStrings.add("fffaaaaa");
        listOfStrings.add("eeiolbio");
        listOfStrings.add("aaaaisdlfia");

        System.out.println(methods.contains3(listOfStrings));*/
    /*
        System.out.println(methods.totalVowels(listOfStrings));*/


	/*  int[] intArr = {1,2,4,4,4,4,5,5,6,6,6,6};
        System.out.println(methods.countUnique(intArr));*/


        /*Set<String> set = new HashSet<>();
        set.add("This is a very long string");
        set.add("Short123");
        set.add("1234567890");
        set.add("Medium strings");
        set.add("Medium string15");

        System.out.println(methods.minLength(set));
        System.out.println();
        methods.removeOddLength(set);
*/
        Map<String,String> map = new HashMap<>();

        map.put("Rasmus", "Sejer");
        map.put("Claus", "Jensen");
        map.put("Julie", "Munk");
        map.put("Camma", "Nielsen");


        System.out.println(methods.isUnique(map));

    }
}
