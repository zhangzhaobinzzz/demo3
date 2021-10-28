package demo100;

import java.util.Scanner;

class Customer {
    int mark;
    String cardType;

    public void showInfo(){
        System.out.println("积分："+mark+",卡类型："+cardType);
        if(mark>1000&&cardType.equals("金卡")||mark>5000&&cardType.equals("普卡")){
            System.out.println("回馈积分500");
        }
    }
}
public class Subject7{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Customer test=new Customer();
        System.out.println("请输入您的信用卡积分：");
        test.mark=input.nextInt();
        System.out.println("请输入您的信用卡类型（金卡/普卡）:");
        test.cardType=input.next();
        test.showInfo();
    }
}
