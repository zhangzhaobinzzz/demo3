//public class HW{
//    public static void main(String[] args){
//        System.out.println("hello world");
//    }
//}

//class FreshJuice{
//    enum FreshJuiceSize{SMALL,MEDIUM,LARGE}
//    FreshJuiceSize size;
//}
//public class HW{
//    public static void main(String[] args){
//        FreshJuice juice =new FreshJuice();
//        juice.size= FreshJuice.FreshJuiceSize.MEDIUM;
//        System.out.println(juice.size);
//    }
//}


//public class HW{
//    String bread;
//    int size;
//    String color;
//    int age;
//
//    void eat(){
//
//    }
//    void run(){
//
//    }
//    void sleep(){
//
//    }
//    void name(){
//
//    }
//}

//public class HW{
//    public HW(){
//
//    }
//    public HW(String name){
//
//    }
//}

//public class HW{
//    int hwage;
//    public HW(String name){
//        System.out.println("小狗的名字是："+name);
//    }
//    public void setage(int age){
//        hwage=age;
//    }
//    public int getAge(){
//        System.out.println("小狗的年龄为："+hwage);
//        return hwage;
//    }
//    public static void main(String[] args){
//        HW hw=new HW("小彭");
//        hw.setage(22);
//        hw.getAge();
//        System.out.println("变量值："+hw.hwage);
//    }
//}

import java.io.*;
public class HW{
    String name;
    int age;
    String designation;
    double salary;
    public HW(String name){
        this.name=name;
    }
    public void empAge(int empAge){
        age=empAge;
    }
    public void empDesignation(String empDesgin){
        designation=empDesgin;
    }
    public void empSalary(double empSalary){
        salary=empSalary;
    }
    public void printEmployee(){
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
        System.out.println("职位："+designation);
        System.out.println("薪水："+salary);
    }
}
