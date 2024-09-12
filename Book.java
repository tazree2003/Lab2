 public class Book {
    private static int totalBooks = 0;
    private String title;
    private String author;
    private int year;
    private String genre;

    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        totalBooks++;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
    }

    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }

    public static void main(String[] args) {
        Book book1 = new Book("12th Fail", "Anurag Pathak", 2019, "Biography");
        Book book2 = new Book("The Girl on the Train", "Paula Hawkins", 2015, "Thriller");
        Book book3 = new Book("Chander Pahar", "Bibhutibhushan Bandyopadhyay", 1937, "Adventure");

        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
        System.out.println();
        book3.displayDetails();
        System.out.println();

        Book.displayTotalBooks();
    }
}
