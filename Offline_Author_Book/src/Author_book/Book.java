package Author_book;

/**
 * Created by User on 9/19/2015.
 */
public class Book {
    private String name;
    private Author author=new Author();
    private double price;
    private int stock;

    Book(String name, Author author, double price, int stock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.stock = stock;

        }

    Book(String name, Author author) {
        this.name = name;
        this.author = author;
        }

        String getName()  {
        return name;
        }

        Author getAuthor()  {
        return author;
        }

        double getPrice()  {
        return price;
        }

        void setPrice(double price) {
        this.price = price;
        }

        int getStock()  {
        return stock;
        }

        void setStock(int stock) {
        this.stock = stock;
        }

        void returnBook(int amount) {
        stock += amount;
        }

        void borrowBook(int amount) {
        if (stock >= amount) {
        stock -= amount;
        } else {
            System.out.println("Borrowing amount exceeds the current stock!");
        }
        }

        void print()  {
            System.out.println("Author: " + getAuthorName() +" Name: " + name + " Price: " + price + " Stock: " + stock);
        }

        String getAuthorName()  {
        return author.getName();
        }


}
