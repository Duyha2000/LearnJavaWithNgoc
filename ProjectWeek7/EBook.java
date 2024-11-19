package ProjectWeek7;

public class EBook extends Book {
    private int pageCount;
    private int fileSize;

    public EBook(String bookName, int year, double price, String genre, boolean status, int pageCount, int fileSize) {
        super(bookName, year, price, genre, status);
        this.pageCount = pageCount;
        this.fileSize = fileSize;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                "FileSize : " + fileSize +
                "PageCount : " + pageCount;
    }
}