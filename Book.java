public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public class Books {
        public static void main(String[] args) {
           
            Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
            Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
            Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
    
            System.out.println("Book 1:");
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            System.out.println("Year Published: " + book1.getYearPublished());
            System.out.println("Price: $" + book1.getPrice());

            System.out.println("Book 2:");
            System.out.println("Title: " + book2.getTitle());
            System.out.println("Author: " + book2.getAuthor());
            System.out.println("Year Published: " + book2.getYearPublished());
            System.out.println("Price: $" + book2.getPrice());

            System.out.println("Book 3:");
            System.out.println("Title: " + book3.getTitle());
            System.out.println("Author: " + book3.getAuthor());
            System.out.println("Year Published: " + book3.getYearPublished());
            System.out.println("Price: $" + book3.getPrice());

    
        }
    }
}

