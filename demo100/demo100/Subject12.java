package demo100;

//import java.util.Random;
import java.util.Scanner;
class Random{
    public int getRandom(int a,int b){
        int ran=(int)(Math.random()*(b-a+1)+a);
        return ran;
    }
}
public class Subject12 {
    public static void main(String[] args) {
        Random num=new Random();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a=input.nextInt();
        System.out.println("请输入第二个整数：");
        int b=input.nextInt();
        System.out.println(num.getRandom(a,b));
    }
}

