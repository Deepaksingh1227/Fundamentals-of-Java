package Streams;

public class Book {
    String title;
    int publicationYear;
    double price;
    String category;

    Book(String title, int publicationYear, double price, String category) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
        this.category = category;

    }

    @Override
    public String toString() {
        return "Book{" + "category='" + category + '\'' + ", title='" + title + '\'' + ",publicationYear="
                + publicationYear + ",price" + price + '}';

    }

}
