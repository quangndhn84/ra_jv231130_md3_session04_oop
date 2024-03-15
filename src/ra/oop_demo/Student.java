package ra.oop_demo;

import java.util.Scanner;

public class Student {
    /*
     * Xây dựng lớp sinh viên mô tả các đối tượng sinh viên trong thế giới thực gồm:
     * 1. Các đặc điểm:
     *   - Mã sinh viên
     *   - Tên sinh viên
     *   - Tuổi
     *   - Giới tính
     *   - Địa chỉ
     * 2. Các hành vi
     *   - Chào giảng viên
     *   - Học java
     *   - Tổng 2 số
     * */
    //1. Fields/Properties/Attributes: Thuộc tính mô tả các hành vi của đối tượng
    //Syntax: Access Modifier + Datatype + FieldName (private)
    public String studentId;
    private String studentName;
    private byte age;
    private boolean sex;
    private String address;

    //2. Constructors: Hàm tạo để khởi tạo các đối tượng
    //Syntax: Access Modifier + ClassName (parameters) --> public
    //Parameter: Datatype + paramName
    //- Constructor default - 0 param
    public Student() {
    }

    //- Constructor cho phép khởi tạo đối tượng thông tin gồm mã sinh viên và tên sinh viên
    public Student(String studentId, String studentName) {
        //studentId: tham số của constructor
        //this.studentId: thuộc tính studentId của lớp Student
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //- Constructor cho phép khởi tạo đối tượng sinh viên với đầy đủ thông tin
    public Student(String studentId, String studentName, byte age, boolean sex, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    //3. Methods mô tả các hành vi của đối tượng
    //Syntax: Access Modifier + ReturnDataType (void) + MethodName(parameters)
    //3.1. Getter/Setter: Cho phép truy cập vào các thuộc tính của đối tượng từ bên ngoài
    //Getter: lấy dữ liệu của đối tượng
    //Setter: gán giá trị cho các thuộc tính của đối tượng
    //Chỉ có những người là giảng viên mới lấy được mã sinh viên
    public String getStudentId() {
        //Kiểm tra điều kiện người dùng có phải là giảng viên hay không
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //3.2. Methods - Mô tả hành vi của đối tượng
    //Syntax: Access Modifier + ReturnData + methodName (params)
    //Param: Datatype paramName
    //- Hành vi chào giảng viên - 1 tham số - tên giảng viên --> trong cùng lớp mới gọi được: private
    private void helloTeacher(String teacherName) {
        System.out.println("Xin chào " + teacherName);
    }

    //- Hành vi học java - In ra màn hình: Tôi nhất định học Java để trở thành Java Developer Fullstack
    //protected - default
    void studyJava() {
        System.out.println("Tôi nhất định học Java để trở thành Java Developer Fullstack");
    }

    //Hành vi tính tổng 2 số - ở đâu cũng gọi được
    public int addTwoNumber(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Phương thức cho phép nhập thông tin đối tượng sinh viên
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Byte.parseByte(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên:");
        this.address = scanner.nextLine();

    }

    //Phương thức cho phép in ra thông tin sinh viên
    public void displayData() {
        System.out.printf("Mã sinh viên: %s - Tên sinh viên: %s - Tuổi: %d\n",
                this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %s - Địa chỉ: %s\n",
                this.sex ? "Nam" : "Nữ", this.address);
    }

}
