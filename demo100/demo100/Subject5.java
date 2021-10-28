package demo100;

import java.util.Scanner;

public class Subject5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入4家店的价格");
        int price[]=new int[4];
        for(int i=0;i<price.length;i++){
            System.out.println("第"+(i+1)+"家店的价格");
            price[i]=sc.nextInt();
        }
        int min=price[0];
        for (int i=0;i<price.length;i++){
            if(min>price[i]){
                min=price[i];
            }
        }
        System.out.println("最低价格是："+min);

    }
}
