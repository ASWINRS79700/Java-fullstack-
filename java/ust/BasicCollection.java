package in.stackroute.ust;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class BasicCollection {
    
    public void setOfNumbers(){
        Set<Integer> numbersSet = new HashSet<>();
        System.out.println("Adding values to the set");
        numbersSet.add(4);
        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(5);
        numbersSet.add(3);
        System.out.println("Printing the set");
        System.out.println(numbersSet);
        System.out.println("Creating a second set.");
        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(1);
        secondSet.add(2);
        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);
        System.out.println("Printing the second set");
        System.out.println(secondSet);
        System.out.println("Checking if the second set is equal to the first set");
        System.out.println(numbersSet.equals(secondSet));
        System.out.println("Copying second set into first set");
        numbersSet.addAll(secondSet);
        System.out.println("Printing the first set");
        System.out.println(numbersSet);
    }

    public void listOfNumbers(){

        List<Integer> numbersList = new ArrayList<>();
        System.out.println("Adding values to the list");
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        System.out.println("Printing the list");
        System.out.println(numbersList);
        System.out.println("Size of the list: " + numbersList.size());
        System.out.println("Checking if value 3 exists in the list: " + numbersList.contains(3));
        
        List<Integer> secondList = new LinkedList<>();
        secondList.add(6);
        secondList.add(7);
        secondList.add(8);
        secondList.add(9);
        secondList.add(10);
        System.out.println("Printing the second list");
        System.out.println(secondList);

        System.out.println("Adding second list to the first list");
        numbersList.addAll(secondList);

        System.out.println("Printing the first list");
        System.out.println(numbersList);

        System.out.println("Removing value 3 from the list");
        System.out.println(numbersList.remove(3));

        System.out.println("Printing the first list");
        System.out.println(numbersList);

        numbersList.clear();
        System.out.println("Printing the first list after clearing");
        System.out.println(numbersList);

        numbersList.addAll(secondList);
        numbersList.addAll(secondList);
        System.out.println("Printing the first list after adding second list twice");
        System.out.println(numbersList);

        System.out.println("Iterating through the list");
        for(int listValue : numbersList){
            System.out.println(" [ " + listValue + " ] ");
        }
        System.out.println("Iterating through the list using iterator");
        Iterator<Integer> iterator = numbersList.iterator();
        while(iterator.hasNext()){
            System.out.println(" [ " + iterator.next() + " ] ");
        }

        System.out.println("Iterating through the list in backward direction");
        ListIterator<Integer> listIterator = numbersList.listIterator(numbersList.size());
        while(listIterator.hasPrevious()){
            System.out.println(" [ " + listIterator.previous() + " ] ");
        }
    }
}
