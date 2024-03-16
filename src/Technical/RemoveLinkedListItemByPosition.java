package Technical;

import java.util.LinkedList;

public class RemoveLinkedListItemByPosition {

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

         
        // Display the original list
        System.out.println("Original LinkedList: " + list);

        // Remove node at position 2 (index starts from 0)
        int positionToRemove = 2;
        removeNodeAtPosition(list, positionToRemove);

        // Display the modified list
        System.out.println("LinkedList after removing node at position " + positionToRemove + ": " + list);
    }

    public static void removeNodeAtPosition(LinkedList<Character> list, int position) {

        if (position < 0 || position >= list.size()) {
            System.out.println("Invalid position");
            return;
        }

        int index = 0;

        for (Character item : list) {
            if (index == position) {
                list.remove(item);
                break;
            }
            index++;
        }
    }
}

