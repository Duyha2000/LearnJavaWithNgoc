package ProjectWeek7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Library library = new Library();
        do {
            System.out.println("Select : ");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Show all books");
            System.out.println("4. Exit");
            System.out.println("Your option : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    System.out.println("=== Add a New Book ===");
                    System.out.println("Choose the type of book to add:");
                    System.out.println("1. Audio Book");
                    System.out.println("2. E-Book");

                    int choice = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the title of the book:");
                    String title = sc.nextLine();

                    System.out.println("Enter the year of publication:");
                    int year = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter the price of the book:");
                    double price = Double.parseDouble(sc.nextLine());

                    System.out.println("Enter the author's name:");
                    String author = sc.nextLine();

                    System.out.println("Is the book available? (true/false):");
                    boolean isAvailable = Boolean.parseBoolean(sc.nextLine());

                    if (choice == 1) {
                        System.out.println("--- Adding an Audio Book ---");
                        System.out.println("Enter the duration of the audio book (in minutes):");
                        int duration = Integer.parseInt(sc.nextLine());

                        System.out.println("Enter the audio format (e.g., MP3, WAV):");
                        String audioFormat = sc.nextLine();

                        AudioBook audioBook = new AudioBook(title, year, price, author, isAvailable, duration,
                                audioFormat);
                        library.addBook(audioBook);
                        System.out.println("Audio Book added successfully!");

                    } else if (choice == 2) {
                        System.out.println("--- Adding an E-Book ---");
                        System.out.println("Enter the file size of the e-book (in MB):");
                        int fileSize = Integer.parseInt(sc.nextLine());

                        System.out.println("Enter the number of pages:");
                        int pages = Integer.parseInt(sc.nextLine());

                        EBook ebook = new EBook(title, year, price, author, isAvailable, fileSize, pages);
                        library.addBook(ebook);
                        System.out.println("E-Book added successfully!");
                    } else {
                        System.out.println("Invalid choice! Please select either 1 or 2.");
                    }
                    break;

                case 2:
                    System.out.println("=== Remove a Book ===");
                    System.out.println("Enter the title of the book to remove:");
                    String bookToRemove = sc.nextLine();
                    library.removeBook(bookToRemove);
                    System.out.println("Book removed successfully!");
                    break;

                case 3:
                    System.out.println("=== Display All Books ===");
                    library.showAll();
                    break;

                case 4:
                    System.out.println("=== Exit ===");
                    System.out.println("Thank you for using the library system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }

        } while (option != 4);
    }
}
