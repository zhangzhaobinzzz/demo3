package demo100;

import java.util.Scanner;

public class Subject23 {
    String brand;
    String num;
    public void info(){
        System.out.println("品牌是："+brand+"车牌是："+num);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Bus1 test=new Bus1();
        System.out.println("请输入所需客车的座位数：");
        test.seatNum=input.nextInt();
        System.out.println("请输入租车的天数：");
        int num=input.nextInt();
        System.out.println(test.getMoney(num)+"元");

        System.out.println("##################");
        Truckload t=new Truckload();
        System.out.println("请输入所需货车的座位数：");
        t.weight=input.nextInt();
        System.out.println("请输入租车天数");
        int day=input.nextInt();
        System.out.println(t.getMoney(day)+"元");
    }
}

class Bus1 extends Subject23 implements Rental{
    int seatNum;
    @Override
    public double getMoney(int day) {
        double money=day*500;
        return money;
    }
}
class Truckload extends Subject23 implements Rental{
    int weight;
    @Override
    public double getMoney(int day){
        double money=day*1000;
        return money;
    }
}
