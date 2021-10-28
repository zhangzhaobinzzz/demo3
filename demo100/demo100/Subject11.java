package demo100;


import java.util.Scanner;

class BankCard{
    String name;
    int passWord;
    int balance;
}
public class Subject11 {
    BankCard card=new BankCard();
    Scanner input=new Scanner(System.in);
    public void login(){
        System.out.println("******中国建设银行******");
        System.out.println("1.登录");
        System.out.println("2.退出");
        System.out.println("请选择");
        for(;;){
            int choose=input.nextInt();
            if(choose==1){
                money();
            }else if(choose==2){
                System.out.println("谢谢使用");
                break;
            }else{
                System.out.println("输入错误，重新选择");
            }
        }
    }
    public void money(){
        card.name="张三";
        card.passWord=123456;
        System.out.println("请输入用户名：");
        String name=input.next();
        System.out.println("请输入密码：");
        int passWord=input.nextInt();
        if (name.equals("张三")&&card.passWord==passWord){
            System.out.println("******中国建设银行*******");
            System.out.println("1.显示余额");
            System.out.println("2.开始存钱");
            System.out.println("3.开始取钱");
            System.out.println("请选择");
            for(;;){
                int choose=input.nextInt();
                if(choose==1){
                    card.balance=2000;
                    System.out.println("余额为："+card.balance);
                    return;
                }else if(choose==2){
                    addMoney();
                    return;
                }else if(choose==3){
                    subMoney();
                    return;
                }else if (choose==0){
                    System.out.println("按0返回上级菜单");
                    login();
                }else{
                    System.out.println("选择错误，请重新输入");
                }
            }
        }else{
            System.out.println("用户名或者密码错误");
        }
    }
    public int addMoney(){
        System.out.println("请输入存钱的钱数：");
        int money=input.nextInt();
        System.out.println("您存入的钱数为："+money);
        return money;
    }
    public int subMoney(){
        System.out.println("请输入要取钱的钱数：");
        int money=input.nextInt();
        System.out.println("您要取的钱为："+money);
        return money;
    }

    public static void main(String[] args) {
        Subject11 sub=new Subject11();
        sub.login();
    }
}
