#hello world.java
##code
~~~
public class HelloWorld {     public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}
~~~
#pattern.java
##code
~~~
class DisplayPattern { public static void main(String[] args)  
{ 
 
    System.out.println("    J     A     V     V    A"); 
    System.out.println("    J    A A     V   V    A A"); 
    System.out.println("J   J   AAAAA     V V    AAAAA"); 
    System.out.println(" J J   A     A     V    A     A"); 
    } 
 } 

~~~
#rainy day.java
##code
~~~
public class RainyDay {     public static void main(String[] args) { 
        System.out.println("It's a rainy day"); 
    } 
} 


~~~
#CGPA Calculation .java
##code
~~~
import java.util.Scanner; 
 
public class CGPACalculator { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter number of subjects: "); 
        int n = sc.nextInt(); 
 
        double totalGradePoints = 0; 
 
        for (int i = 1; i <= n; i++) { 
            System.out.print("Enter grade point for subject " + i + ": ");             double gradePoint = sc.nextDouble();             totalGradePoints += gradePoint; 
        } 
 
        double cgpa = totalGradePoints / n; 
 
        System.out.println("Your CGPA is: " + cgpa); 
 
        sc.close(); 
    } 
} 

~~~
#Command Line in Java .java
##code
~~~
public class TriangleArea {     public static void main(String[] args) { 
 
        if (args.length != 2) { 
            System.out.println("Usage: java TriangleArea <base> <height>"); 
            return; 
        } 
 
        double base = Double.parseDouble(args[0]);         double height = Double.parseDouble(args[1]); 
 
        double area = 0.5 * base * height; 
 
        System.out.println("Area of Triangle = " + area); 
    } 
} 

~~~
#Series Sum CODE.java
##code
~~~
public class SeriesSum {     public static void main(String[] args) { 
 
        if (args.length != 1) { 
            System.out.println("Usage: java SeriesSum <n>"); 
            return; 
        } 
 
        int n = Integer.parseInt(args[0]);         int sum = 0; 
 
        for (int i = 1; i <= n; i++) {             sum += i; 
        } 
 
        System.out.println("Sum of series 1 + 2 + ... + " + n + " = " + sum); 
    } 
} 
 

~~~
#Rectangular Area CODEn.java
##code
~~~
import java.util.Scanner; 
 
public class RectangleArea {     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
         
        System.out.print("Enter the length of the rectangle: ");         double length = scanner.nextDouble(); 
 
        System.out.print("Enter the width of the rectangle: ");         double width = scanner.nextDouble(); 
 
                double area = length * width; 
 
                System.out.println("The area of the rectangle is: " + area); 
 
        scanner.close(); 
    } 
} 

~~~
#Triangle Perimeter .java
##code
~~~
public class TrianglePerimeter {     public static void main(String[] args) { 
         
        int a = 5;         int b = 7;         int c = 9; 
 
        
        int perimeter = a + b + c; 
 
         
        System.out.println("Perimeter of the triangle: " + perimeter); 
    } 
} 


~~~
#Sum Two Numbers .java
##code
~~~
public class SumTwoNumbers { 
    public static void main(String[] args) {         int num1 = 5;           int num2 = 7;   
 
        int sum = num1 + num2;  
 
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum); 
    } 
} 

~~~
#Multiply Two Numbers .java
##code
~~~
public class MultiplyTwoNumbers { 
    public static void main(String[] args) {         int num1 = 5;           int num2 = 7;   
 
        int product = num1 * num2;  
 
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product); 
    } 
} 

~~~
