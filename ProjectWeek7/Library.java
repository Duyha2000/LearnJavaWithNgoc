package ProjectWeek7;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // array books (10 cuốn sách: Nhà giả kim,...) -> anh thêm 1 cuốn sách nhập lung
    // tung, phải báo lỗi
    public void addBook(Book book) {
        // try - catch
        try {
            if (book == null) {
                throw new IllegalArgumentException("Invalid, can't add books");
            }
            books.add(book);
            System.out.println("Book was added to library");
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }
    }

    // Nhập tên sách và check có trong array hay không, có thì cho xóa k thì quăng
    // ra cho nó cái lỗi như thằng ở trên !!!
    public void removeBook(String bookName) {
        try {
            if (books.isEmpty()) {
                throw new IllegalStateException("K có sách nào để xóa");
            }
            int position = -1;
            for (int i = 0; i < books.size(); i++) {
                if (bookName.equals(books.get(i).getBookName())) {
                    position = i;
                    break;
                }
            }

            if (position == -1) {
                throw new IllegalArgumentException("There is no book");
            } else {
                books.remove(position);
                System.out.println("Removal complete");
            }
        } catch (IllegalStateException ise) {
            System.err.println(ise.getMessage());
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());

        }

    }

    public void showAll() {
        try {
            if (books.isEmpty()) {
                throw new IllegalStateException("nothing to show");
            }
            for (Book book : books) {
                System.out.println(book);
            }
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }
    }

}