package demo100;

import java.util.Scanner;

public class Subject6 {
    String name;
    int age;
    String ticket;
    public void info(){
        ticket=age<=12 ? "免费":"价格为：20元";
        System.out.println(name+"的年龄为："+age+"，门票"+ticket+"\n");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age=0;
        String name=" ";
        for (;;){
            Subject6 sub=new Subject6();
            if(!name.equals("n")){
                System.out.println("请输入姓名：");
                name=input.next();
                if(name.equals("n")){
                    System.out.println("退出程序");
                    break;
                }
                System.out.println("请输入年龄：");
                age=input.nextInt();
                sub.name=name;
                sub.age=age;
                sub.info();

            }else{
                break;
            }

        }
    }
}
