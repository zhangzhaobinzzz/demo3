import java.io.*;
public class EmployeeTest {
    public static void main(String[] args){
        HW hw1=new HW("runoob1");
        HW hw2=new HW("runoob2");

        hw1.empAge(26);
        hw1.empDesignation("高级程序员");
        hw1.empSalary(1000);
        hw1.printEmployee();

        hw2.empAge(21);
        hw2.empDesignation("菜鸟程序员");
        hw2.empSalary(500);
        hw2.printEmployee();
    }
}
