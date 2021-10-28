package demo100;

import java.util.Scanner;

public class Subject10 {
    int computer;
    int self;

    public int selfGuss(){
        Scanner input=new Scanner(System.in);
        System.out.println("请您开始出拳：1.石头、2.剪刀、3.布");
        int self=input.nextInt();
        for(;;){
            if(self==1){
                System.out.println("选择石头");
                break;
            }else if(self==2){
                System.out.println("选择剪刀");
                break;
            }else if (self==3){
                System.out.println("选择布");
            }
        }
        return self;
    }
    public int computerGuss(){
        int computer=(int)(Math.random()*3+1);
        for(;;){
            if (computer==1){
                System.out.println("电脑选择出拳：石头");
                break;
            }
            else if(computer==2){
                System.out.println("电脑选择出拳：剪刀");
                break;
            }
            else if (computer==3){
                System.out.println("电脑选择出拳：布");
            }
        }
        return computer;
    }
    public void compare(){
        self=selfGuss();
        computer=computerGuss();
        if (computer==1&&self==2 || computer==2&&self==3 || computer==3&&self==1){
            System.out.println("电脑赢");
        }else if(computer==self){
            System.out.println("平手");
        }else{
            System.out.println("恭喜，你赢了");
        }
    }

}
