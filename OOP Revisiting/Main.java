//classes and object
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // object creation
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive();
    }
}
//acces modifiers
class Person {
    private String name;  // private: accessible only within the class

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");
        System.out.println(p.getName());
    }
}
//inheritance
class Animal {
    protected String type = "Animal";

    void display() {
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(type + " says Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.bark();
    }
}
//Encapsulation
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println(acc.getBalance());
    }
}
//Abstract Classes
abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
    }
}
//Interface
interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}
//Multiple Inheritance using Interface
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying...");
    }

    public void swim() {
        System.out.println("Duck is swimming...");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
//ATM - Project (Mini Project Idea)
import java.util.Scanner;

public class ATM {
    private double balance = 1000.0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter amount:");
                    atm.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter amount:");
                    atm.withdraw(sc.nextDouble());
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
//Calculator - Project (Mini Project Idea)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation (+, -, *, /):");
        char op = sc.next().charAt(0);

        double result = 0;

        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if(num2 != 0) 
                    result = num1 / num2; 
                else 
                    System.out.println("Cannot divide by zero!");
                break;
            default: System.out.println("Invalid operation");
        }

        System.out.println("Result: " + result);
    }
}