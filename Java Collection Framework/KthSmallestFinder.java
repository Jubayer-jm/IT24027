//Find the kth Smallest Element in an ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallestFinder {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(3);
        numbers.add(9);
        numbers.add(7);
        numbers.add(2);

        System.out.println("Original List: " + numbers);

        int k = 3; 
        if (k > 0 && k <= numbers.size()) {
            
            Collections.sort(numbers);
            
            
            int kthSmallest = numbers.get(k - 1);
            
            System.out.println("The " + k + "rd smallest element is: " + kthSmallest);
        } else {
            System.out.println("Invalid value of k");
        }
    }
}
//TreeMap for Word Frequencies

import java.util.TreeMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "hello world this is a hello world java program";
        
        
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

       
        String[] words = text.split(" ");

        for (String word : words) {
           
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

      
        System.out.println("Word Frequencies (Sorted):");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

//Queue and Stack using PriorityQueue

import java.util.PriorityQueue;
import java.util.Comparator;


class Element {
    String value;
    int order;

    public Element(String value, int order) {
        this.value = value;
        this.order = order;
    }
}

public class PQStackQueueImplementation {
    public static void main(String[] args) {
        
        
        PriorityQueue<Element> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.order));
        
        System.out.println("--- Queue Operation ---");
        queue.add(new Element("First", 1));
        queue.add(new Element("Second", 2));
        queue.add(new Element("Third", 3));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll().value);

        
        PriorityQueue<Element> stack = new PriorityQueue<>((e1, e2) -> e2.order - e1.order);
        
        System.out.println("\n--- Stack Operation ---");
        stack.add(new Element("First", 1));
        stack.add(new Element("Second", 2));
        stack.add(new Element("Third", 3));

        while (!stack.isEmpty()) {
            System.out.println(stack.poll().value);
    }
}
//TreeMap for Student IDs and Details

import java.util.TreeMap;

class Student {
    String name;
    double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", CGPA: " + cgpa;
    }
}

public class StudentDirectory {
    public static void main(String[] args) {
        
        TreeMap<Integer, Student> studentMap = new TreeMap<>();

       
        studentMap.put(103, new Student("Alice", 3.8));
        studentMap.put(101, new Student("Bob", 3.5));
        studentMap.put(102, new Student("Charlie", 3.9));

        System.out.println("Student Details (Sorted by ID):");
       
        for (Integer id : studentMap.keySet()) {
            System.out.println("ID: " + id + " -> " + studentMap.get(id));
        }
    }
}
//Check if two LinkedLists are equal
import java.util.LinkedList;

public class LinkedListEquality {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        
        boolean isEqualBuiltIn = list1.equals(list2);
        System.out.println("Are lists equal (Using equals)? " + isEqualBuiltIn);

        
        boolean isEqualManual = checkEquality(list1, list2);
        System.out.println("Are lists equal (Manual Check)? " + isEqualManual);
    }

   
    public static boolean checkEquality(LinkedList<String> one, LinkedList<String> two) {
        
        if (one.size() != two.size()) {
            return false;
        }

        
        for (int i = 0; i < one.size(); i++) {
            if (!one.get(i).equals(two.get(i))) {
                return false;
            }
        }
        return true;
    }
}
//HashMap for Employee IDs and Departments
import java.util.HashMap;

public class EmployeeMap {
    public static void main(String[] args) {
        
        HashMap<Integer, String> employees = new HashMap<>();

        
        employees.put(501, "HR");
        employees.put(502, "Engineering");
        employees.put(503, "Marketing");
        employees.put(504, "Sales");

        System.out.println("Employee Department List:");
        
        
        employees.forEach((id, dept) -> {
            System.out.println("ID: " + id + " works in " + dept);
        });

        
        int searchId = 502;
        if(employees.containsKey(searchId)) {
            System.out.println("\nEmployee " + searchId + " belongs to: " + employees.get(searchId));
        }
    }
}