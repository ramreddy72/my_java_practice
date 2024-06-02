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


/*Let's analyze the time and space complexity of the provided program, which finds common elements in multiple arrays.

1. **Time Complexity**:
   - Let \( n \) be the average size of the arrays and \( m \) be the number of arrays.
   - Converting the first array into a set (`firstArraySet`) takes \( O(n) \) time.
   - The nested loops iterate through elements of `firstArraySet` and check if they exist in all other arrays. This involves:
     - Outer loop iterating through \( O(n) \) elements.
     - Inner loop iterating through \( O(m-1) \) arrays, each with an average size of \( O(n) \).
   - The `containsElement` method is called \( O(n) \) times in the worst-case scenario.
   
   Therefore, the overall time complexity is approximately:
   \[
   O(n) + O(n) \cdot O((m-1) \cdot n) = O(n + m \cdot n^2)
   \]
   In practice, if the arrays are of similar sizes and \( m \) is not too large, we can simplify this to \( O(m \cdot n^2) \).

2. **Space Complexity**:
   - The space complexity primarily depends on the additional data structures used.
   - `firstArraySet` stores elements from the first array, contributing \( O(n) \) space.
   - `commonElements` set stores common elements, which could be up to \( O(n) \) in the worst case if all elements are common.
   - Overall, the space complexity is \( O(n) \) due to the sets used to store elements.

In conclusion, the time complexity of the program is approximately \( O(m \cdot n^2) \) and the space complexity is \( O(n) \), where \( n \) is the average size of the arrays and \( m \) is the number of arrays. Improvements can be made by optimizing the algorithm or using more efficient data structures if dealing with very large arrays or a large number of arrays. */