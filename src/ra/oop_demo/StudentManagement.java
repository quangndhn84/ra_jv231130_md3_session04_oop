package ra.oop_demo;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //Syntax: ClassName objectName = new Constructor(arguments)
        //1. Khai báo và khởi tạo đối tượng sinh viên 1 mà không khởi tạo thông tin gì
        Student student1 = new Student();
        //2. Khai báo và khởi tạo đối tượng sinh viên 2 và khởi tạo mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002", "Nguyễn Văn B");
        //3. Khai báo và khởi tạo đối tượng sinh viên 3 và khởi tạo tất cả thông tin sinh viên
        Student student3 = new Student("SV003", "Nguyễn Văn C", (byte) 22, true, "TP HCM");
        //5. Sử dụng phương thức inputData để nhập thông tin cho sinh viên 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHẬP THÔNG TIN CHO SINH VIÊN 1:");
        student1.inputData(scanner);
        //6. Sử dụng phương thức set để nhập các thông tin còn lại của sinh viên 2
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 2:");
        System.out.println("Nhập vào tuổi sinh viên 2:");
        student2.setAge(Byte.parseByte(scanner.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên 2:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào địa chỉ sinh viên 2:");
        student2.setAddress(scanner.nextLine());
        //7. Tính tổng tuổi 3 sinh viên và in ra
        int totalAge = student1.getAge() + student2.getAge() + student3.getAge();
        System.out.println("Tổng tuổi 3 sinh viên: " + totalAge);
        //4. Sử dụng phương thức displayData in thông tin các sinh viên
        System.out.println("THÔNG TIN SINH VIÊN 1:");
        student1.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 2:");
        student2.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 3:");
        student3.displayData();
    }
}
