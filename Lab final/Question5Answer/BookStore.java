package Question5;
public class BookStore {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book(101, "Java Programming", 450.0);
        books[1] = new Book(102, "Data Structures", 550.0);
        books[2] = new Book(103, "Python Basics", 350.0);
        books[3] = new Book(104, "Web Development", 600.0);
        books[4] = new Book(105, "Database Systems", 520.0);

        System.out.println("Books with price greater than 500:");
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getPrice() > 500) {
                books[i].displayInfo();
            }
        }

        double total = 0;
        for (int i = 0; i < books.length; i++) {
            total += books[i].getPrice();
        }

        double average = total / books.length;
        System.out.println("Average price of all books: $" + average);
    }
}
s