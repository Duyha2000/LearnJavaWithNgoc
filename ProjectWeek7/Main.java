package ProjectWeek7;

public class Main {
    public static void main(String[] args) {
        int option;
        Library library = new Library();
        do {
            System.out.println("Select : ");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Show all books");
            System.out.println("4. Exit");
            System.out.println("Your option : ");
            option = In.nextInt();
            if (option == 1) {
                System.out.println("=== Add a New Book ===");
                System.out.println("Choose the type of book to add:");
                System.out.println("1. Audio Book");
                System.out.println("2. E-Book");

                int choice = In.nextInt();
                System.out.println("Enter the title of the book:");
                String title = In.nextLine();

                System.out.println("Enter the year of publication:");
                int year = In.nextInt();

                System.out.println("Enter the price of the book:");
                double price = In.nextDouble();

                System.out.println("Enter the author's name:");
                String author = In.nextLine();

                System.out.println("Is the book available? (true/false):");
                boolean isAvailable = In.nextBoolean();

                if (choice == 1) {
                    System.out.println("--- Adding an Audio Book ---");
                    System.out.println("Enter the duration of the audio book (in minutes):");
                    int duration = In.nextInt();

                    System.out.println("Enter the audio format (e.g., MP3, WAV):");
                    String audioFormat = In.nextLine();

                    AudioBook audioBook = new AudioBook(title, year, price, author, isAvailable, duration,
                            audioFormat);
                    library.addBook(audioBook);
                    System.out.println("Audio Book added successfully!");

                } else if (choice == 2) {
                    System.out.println("--- Adding an E-Book ---");
                    System.out.println("Enter the file size of the e-book (in MB):");
                    int fileSize = In.nextInt();

                    System.out.println("Enter the number of pages:");
                    int pages = In.nextInt();

                    EBook ebook = new EBook(title, year, price, author, isAvailable, fileSize, pages);
                    library.addBook(ebook);
                    System.out.println("E-Book added successfully!");
                } else {
                    System.out.println("Invalid choice! Please select either 1 or 2.");
                }
            } else if (option == 2) {
                System.out.println("=== Remove a Book ===");
                System.out.println("Enter the title of the book to remove:");
                String bookToRemove = In.nextLine();
                library.removeBook(bookToRemove);
                System.out.println("Book removed successfully!");
                break;
            } else if (option == 3) {
                System.out.println("=== Display All Books ===");
                library.showAll();
            } else if (option == 4) {
                System.out.println("=== Exit ===");
                System.out.println("Thank you for using the library system. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (option != 4);
    }
}
