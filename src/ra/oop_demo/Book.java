package ra.oop_demo;

import java.util.Scanner;

public class Book {
    /*
     * 1. Thuộc tính
     *   - Mã sách: int
     *   - Tên sách: String
     *   - Giá nhập: float
     *   - Giá xuất: float
     *   - Tác giả: String
     *   - Nhà xuất bản: String
     *   - Trạng thái: boolean - true(hoạt động) - false(Không hoạt động)
     * 2. Hàm tạo:
     *   - Hàm tạo default
     *   - Hàm tạo khởi tạo tất cả thông tin của sách
     * 3. Phương thức:
     *   - getter/setter
     *   - inputData(Scanner scanner): cho phép nhập thông tin sách trừ giá xuất
     *   - displayData(): cho phép in thông tin sách
     *   - calExportPrice(): cho phép tính giá xuất của sách theo công thức: 1.2 * importPrice
     *     *
     * */
    private int bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private String publising;
    private boolean status;

    public Book() {
    }

    public Book(int bookId, String bookName, float importPrice, float exportPrice, String author, String publising, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.publising = publising;
        this.status = status;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublising() {
        return publising;
    }

    public void setPublising(String publising) {
        this.publising = publising;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sách:");
        this.bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sách:");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập vào giá nhập của sách:");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào tác giả:");
        this.author = scanner.nextLine();
        System.out.println("Nhập vào nhà xuất bản:");
        this.publising = scanner.nextLine();
        System.out.println("Nhập vào trạng thái sách:");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    public void displayData() {
        System.out.printf("Mã sách: %d - Tên sách: %s - Tác giả: %s\n",
                this.bookId, this.bookName, this.author);
        System.out.printf("Giá nhập: %f - Giá xuất: %f - NXB: %s - Trạng thái: %s\n",
                this.importPrice, this.exportPrice, this.publising, this.status ? "Hoạt động" : "Không hoạt động");
    }

    public void calExportPrice() {
        this.exportPrice = 1.2F * this.importPrice;
    }
}
