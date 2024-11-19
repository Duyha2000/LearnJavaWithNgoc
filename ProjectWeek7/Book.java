package ProjectWeek7;

public class Book {
    private String bookName;
    private int year;
    private double price;
    private String genre;
    private boolean status;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Book(String bookName, int year, double price, String genre, boolean status) {
        this.bookName = bookName;
        this.year = year;
        this.genre = genre;
        this.price = price;
        this.status = status;
    }

    public Book() {
        this("", 0, 0.0, "", false);
    }

    public String toString() {
        return "Book name : " + bookName +
                "Year : " + year +
                "Price : " + price +
                "Genre : " + genre +
                "Status : " + status;
    }
}
