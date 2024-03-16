package Technical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonNumberInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 3, 4, 6, 7, 8 };
        int[] arr2 = { 4, 5, 6, 8, 20 };

        commonElements(arr1, arr2);
    }

    public static int commonElements(int[] arr1, int[] arr2) {

         
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        list1.retainAll(list2);

        System.out.println(list1);


        // TreeSet set = new TreeSet(Arrays.asList(list1));
        // set.removeAll(Arrays.asList(list2));

        // System.out.println(set);

        // String[] result = list1.stream()
        //                 .filter((s) ->!list2.contains(s.intValue()))
        //                 .toArray(String[]::new);

        // System.out.println(Arrays.toString(result));

        list1.stream().filter((s) -> !list2.contains(s.intValue())).forEach(System.out::println);

         // first & second List
        // List<String> nameList1 = Arrays.asList("Ram", "Sam", "Sundar", "Shaz", "Ankit");
        // List<String> nameList2 = Arrays.asList("Ram", "Sam", "Shaz","rod");
 
        // // find uncommon elements & store in new List
        // List<String> uncommonNames = nameList1
        //         .stream()
        //         .filter(name -> !nameList2.contains(name))
        //         .collect(Collectors.toList());
 
        // // print to console
        // System.out.print(uncommonNames);

        return 0;
    }
}
