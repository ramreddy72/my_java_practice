package Technical;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {
 public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] array3 = {5, 6, 7, 8, 9};

        Set<Integer> commonElements = findCommonElements(array1, array2, array3);

        System.out.println("Common elements in arrays: " + commonElements);
    }

    public static Set<Integer> findCommonElements(int[]... arrays) {
        Set<Integer> commonElements = new HashSet<>();
        
        if (arrays.length == 0) {
            return commonElements; // No arrays provided, return empty set
        }
        
        // Convert the first array into a set for constant time lookups
        Set<Integer> firstArraySet = new HashSet<>();
        for (int num : arrays[0]) {
            firstArraySet.add(num);
        }

        // Iterate through each element of the first array and check if it exists in all other arrays
        for (int num : firstArraySet) {
            boolean existsInAllArrays = true;
            for (int i = 1; i < arrays.length; i++) {
                if (!containsElement(arrays[i], num)) {
                    existsInAllArrays = false;
                    break;
                }
            }
            if (existsInAllArrays) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }

    public static boolean containsElement(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }
}
