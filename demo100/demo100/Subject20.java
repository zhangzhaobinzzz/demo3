package demo100;

import com.sun.java.swing.action.CancelAction;

import java.util.Scanner;

public abstract class Subject20 {
    int number;
    String brand;
    String color;
    double mileAge;
    public abstract void calcRent(int day);

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for(;;){
            int choose=input.nextInt();
            if (choose==1){
                String type=input.next();
                Car c=new Car(666,type);
                int num= input.nextInt();
                c.calcRent(num);
                break;
            }
            else if(choose==2){
                String type=input.next();
                Car c=new Car(888,type);
                int num= input.nextInt();
                c.calcRent(num);
                break;
            }
            else{
                System.out.println("输入错误，请重新输入");
            }
        }
    }
}

class Car extends Subject20{
    String type;
    public Car(int number,String type){
        this.number=number;
        this.type=type;
    }
    @Override
    public void calcRent(int day){
        if(type.equals("别克")){
            System.out.println("租金是："+day*600+"元");
        }else if(type.equals("宝马")){
            System.out.println("租金是："+day*500+"元");
        }else{
            System.out.println("本公司无此车");
        }
    }
}

class Bus extends Subject20{
    int seatCount;
    public Bus(int number,int seatCount){
        this.number=number;
        this.seatCount=seatCount;
    }

    @Override
    public void calcRent(int day) {
        if(seatCount>16){
            System.out.println("租金是："+day*1500+"元");
        }else{
            System.out.println("租金是："+day*800+"元");
        }
    }
}