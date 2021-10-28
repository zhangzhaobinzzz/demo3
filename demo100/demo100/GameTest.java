package demo100;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Subject10 sub=new Subject10();
        Scanner input=new Scanner(System.in);
        System.out.println("********猜拳游戏********");
        System.out.println("请输入你的角色名");
        String name=input.next();
        System.out.println("请选择你的对手：1.孙悟空 2.孙悟饭 3.孙悟天");
        for(;;){
            int person =input.nextInt();
            if (person==1){
                System.out.println("********"+name+"vs"+"孙悟空**********");
                break;
            }
            if (person==2){
                System.out.println("********"+name+"vs"+"孙悟饭**********");
                break;
            }
            if (person==3){
                System.out.println("********"+name+"vs"+"孙悟天**********");
                break;
            }
            else{
                System.out.println("没有此角色，重新输入");
            }
        }
        sub.compare();

    }
}
