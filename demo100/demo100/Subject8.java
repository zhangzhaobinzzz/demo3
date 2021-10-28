package demo100;

import java.util.Scanner;

public class Subject8 {
    String name;
    int passWord;
    public void adminInfo(){
        System.out.println("姓名："+name+"密码："+passWord);
    }
    public void modifyInfo(){

    }

    public static void main(String[] args) {
        Subject8 sub1=new Subject8();
        sub1.name="admin1";
        sub1.passWord=111;
        sub1.adminInfo();

        Subject8 sub2=new Subject8();
        sub2.name="admin2";
        sub2.passWord=222;
        sub2.adminInfo();

        Subject8 sub3=new Subject8();
        sub3.name="admin3";
        sub3.passWord=333;
        sub3.adminInfo();

        Scanner input=new Scanner(System.in);
        boolean isFlag=true;
        while(isFlag){
            System.out.println("请输入用户名：");
            String name=input.next();
            System.out.println("请输入密码：");
            int passWord=input.nextInt();
            if(sub3.name.equals("admin3")&&sub3.passWord==passWord){
                System.out.println("请输入新密码");
                passWord=input.nextInt();
                sub3.passWord=passWord;
                System.out.println("密码修改成功，密码为："+sub3.passWord);
                isFlag=false;
            }
            else{
                System.out.println("用户名和密码不匹配！");
            }
        }
    }
}
