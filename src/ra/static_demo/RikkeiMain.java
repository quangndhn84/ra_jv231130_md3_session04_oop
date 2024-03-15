package ra.static_demo;

import ra.oop_demo.Student;

public class RikkeiMain {
    public static void main(String[] args) {
        RA_Web_App guest1 = new RA_Web_App();
        guest1.userVisited();
        RA_Web_App.userVisited();
        RA_Web_App guest2 = new RA_Web_App();
        guest2.userVisited();
        RA_Web_App guest3 = new RA_Web_App();
        guest3.userVisited();
        Student student = new Student();
        student.studentId = "SV001";
    }
}
