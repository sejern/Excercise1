

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ClassOfMethods {


     public int totalVowels(List<String> list){

        int totalNumberOfVowels = 0;

        for (String str : list) {

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'a' ||
                (str.charAt(i) == 'e') ||
                (str.charAt(i) == 'i') ||
                (str.charAt(i) == 'o') ||
                (str.charAt(i) == 'u'))
                    totalNumberOfVowels++;
            }
//            Pattern pattern = Pattern.compile("a", Pattern.CASE_INSENSITIVE );
//            Matcher matcher = pattern.matcher(str);
//            boolean matchfound = matcher.find();
//
//            if(matchfound){
//                totalNumberOfVowels++;
//            }
        }

        if(list.size() == 0){
            return 0;
        }

        return totalNumberOfVowels;
    }

    public int countUnique(int[] intArray){
        // count each unique number in array
        int count = 0;

        Set<Integer> setOfInts =
                Arrays.stream(intArray)
                        .boxed()
                        .collect(Collectors.toSet());

        for (Integer i : setOfInts) {
            count++;
        }
        return count;
    }

    public int minLength(Set<String> setOfStrings){
         if(setOfStrings.isEmpty()){
             return 0;
         }

        // making ArrayList from setOfStrings to use the Collections interface.
        ArrayList<String> listToSort = new ArrayList<>(setOfStrings);
        // using the Comparator.comparing method to create a Comparable on the length of strings using a lambda expression
        Collections.sort(listToSort, Comparator.comparing(String::length));
        //returning the length of the first element in the sorted ArrayList
        return listToSort.get(0).length();


    }

    public void removeOddLength(Set<String> setOfStrings){
//        setOfStrings
//              .removeIf(str -> str.length() % 2 != 0);
//        setOfStrings.forEach(System.out::println);

        setOfStrings.stream()
                .sorted()
                .filter(s -> s.length() % 2 == 0)
                .forEach(System.out::println);

    }

    public boolean contains3(List<String> arrayList){
         //return true if one string occurs 3 times or more
         //use a map to store data

         Map<String, Integer> containsMap = new HashMap<>();

         for (String str : arrayList) {
             if(!containsMap.containsKey(str)){
                 containsMap.put(str,1);
             }  else {
                 int count = containsMap.get(str);
                 containsMap.put(str, count + 1);
                    if(containsMap.get(str) >= 3){
                        return true;
                    }
             }
         }
         return false;
    }

    public boolean isUnique(Map<String, String> map){
         //return true if all values are unique and vise versa

        List<String> arrList = new ArrayList<>(map.values());

        for (int i = 0; i < arrList.size(); i++) {
            for (int j = i+1; j < arrList.size(); j++) {

                if(arrList.get(i).equals(arrList.get(j))){
                    return false;
                }
            }
        }
        return true;
    }
}



