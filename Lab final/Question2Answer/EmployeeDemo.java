package Lab_;
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 101, 5000.0);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 25.0, 80);

        System.out.println("Full-Time Employee:");
        emp1.displayInfo();

        System.out.println("\nPart-Time Employee:");
        emp2.displayInfo();

        System.out.println("\nDemonstrating Runtime Polymorphism:");
        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            System.out.println(emp.getName() + "'s salary: $" + emp.calculateSalary());
        }
    }
}