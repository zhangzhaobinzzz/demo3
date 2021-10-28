//public class Test {
//    static boolean bool;
//    static byte by;
//    static char ch;
//    static double d;
//    static float f;
//    static int i;
//    static long l;
//    static short sh;
//    static String str;
//
//    public static void main(String[] args) {
//        System.out.println("Bool :" + bool);
//        System.out.println("Byte :" + by);
//        System.out.println("Character:" + ch);
//        System.out.println("Double :" + d);
//        System.out.println("Float :" + f);
//        System.out.println("Integer :" + i);
//        System.out.println("Long :" + l);
//        System.out.println("Short :" + sh);
//        System.out.println("String :" + str);
//    }
//}

//public class Test{
//    public void pupAge(){
//        int age =0;
//        age=age+7;
//        System.out.println("小狗的年龄是："+age);
//    }
//    public static void main(String[] args){
//        Test test=new Test();
//        test.pupAge();
//    }
//}

//import java.io.*;
//public class Test{
//    public String name;
//    private double salary;
//    public Test(String empName){
//        name=empName;
//    }
//    public void setSalary(double empSal){
//        salary=empSal;
//    }
//    public void printEmp(){
//        System.out.println("名字："+name);
//        System.out.println("薪水："+salary);
//    }
//    public static void main(String[] args){
//        Test test=new Test("runoob1");
//        test.setSalary(1000.0);
//        test.printEmp();
//    }
//}

//import java.io.*;
//public class Test{
//    private static double salary;
//    public static final String DEPARTMENT="开发人员";
//    public static void main(String[] args){
//        salary=100;
//        System.out.println(DEPARTMENT+"平均工资"+salary);
//    }
//}
//public class Test{
//    private String format;
//    public String getFormat(){
//        return this.format;
//    }
//    public void setFormat(String format){
//        this.format=format;
//    }
//}
//public class InstanceCounter {
//    private static int numInstances = 0;
//    protected static int getCount() {
//        return numInstances;
//    }
//    private static void addInstance() {
//        numInstances++;
//    }
//    InstanceCounter() {
//        InstanceCounter.addInstance();
//    }
//    public static void main(String[] arguments) {
//        System.out.println("Starting with " +
//                InstanceCounter.getCount() + " instances");
//        for (int i = 0; i < 500; ++i){
//            new InstanceCounter();
//        }
//        System.out.println("Created " +
//                InstanceCounter.getCount() + " instances");
//    }
//}
//public class Test{
//    final int value=10;
//    public static final int BOXWIDTH=6;
//    static final String TITLE="Manager";
//    public void changeValue(){
//        value=12;
//    }
//}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;
//
//public class StringDemo{
//    public static void main(String[] args) {
//        char[] helloArray={'r','u','n','o','o','b'};
//        System.out.println(helloArray);
//        String helloString=new String(helloArray);
//        System.out.println(helloString);
//
//        int[] i={1,2,3,4,5};
//        System.out.println(i);
//
//        String[] s=new String[] {"a","b"};
//        List<String> strings = Arrays.asList(s);
//        Arrays.asList("1","2");
//
//    }
//}
//public class TestArray {
//    public static void main(String[] args){
//        double[] mylist={1.9,2.9,3.4,3.5};
//        for (int i=0;i<mylist.length;i++){
//            System.out.println(mylist[i]+" ");
//        }
//        double total=0;
//        for(int i=0;i<mylist.length;i++){
//            total+=mylist[i];
//        }
//        System.out.println("Total is"+total);
//        double max=mylist[0];
//        for (int i=1;i<mylist.length;i++){
//            if(mylist[i]>max) max=mylist[i];
//        }
//        System.out.println("max is "+max);
//    }
//}


public class TestArray {
    static String[] str = {"1", "5", "6", "0", "5", "2", "4", "7", "5", "3", "8"};
    public static void main(String[] args){
        for (String s:str){
            System.out.println(s);
        }
    }
}