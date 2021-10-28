package demo100;

import java.util.Scanner;

public class Subject9 {

    Scanner input = new Scanner(System.in);

    public void loginMenu() { // 登录
        for (;;) {
            System.out.println("欢迎使用我行我素购物管理系统\n");
            System.out.println("\t1.登陆系统\n");
            System.out.println("\t2.退出\n");
            System.out.println("***************************");
            System.out.print("请选择,输入数字：");
            int choose = input.nextInt();

            if (choose == 1) {
                mainMenu();
                break;

            } else if (choose == 2) {
                System.out.println("谢谢使用");
                break;

            } else {
                System.out.println("输入错误,请重新输入!");
            }
        }
    }

    public void mainMenu() { // 主菜单
        for (;;) {
            System.out.println("我行我素购物管理系统主菜单\n");
            System.out.println("***************************\n");
            System.out.println("\t1.客户信息管理\n");
            System.out.println("\t2.真情回顾\n");
            System.out.println("***************************");
            System.out.print("请选择,输入数字或按0返回上一级菜单:");
            int choose = input.nextInt();

            if (choose == 1) {
                customerMenu();
                break;

            } else if (choose == 2) {
                sendCustMenu();
                break;

            } else if (choose == 0) {
                loginMenu();
                break;
            } else {
                System.out.println("输入错误,请重新输入!");
            }
        }
    }

    public void customerMenu() { // 客戶信息管理
        for (;;) {
            System.out.println("我行我素购物管理系统主菜单>客户信息管理");
            System.out.println("***************************\n");
            System.out.println("\t1.添加客户\n");
            System.out.println("\t2.修改客户\n");
            System.out.println("\t3.删除客户\n");
            System.out.println("***************************");
            System.out.print("请选择,输入数字或按0返回上一级菜单:");
            int choose = input.nextInt();

            if (choose == 1) {
                for (;;) {
                    System.out.println("执行添加客户");
                    System.out.print("输入数字0返回上一级菜单:");
                    int choose1 = input.nextInt();
                    if (choose1 == 0) {
                        customerMenu();
                        break;
                    } else {
                        System.out.println("输入错误，输入数字0返回上一级菜单！");
                    }
                }
                break;

            } else if (choose == 2) {
                for (;;) {
                    System.out.println("执行修改客户");
                    System.out.print("输入数字0返回上一级菜单:");
                    int choose1 = input.nextInt();
                    if (choose1 == 0) {
                        customerMenu();
                        break;
                    } else {
                        System.out.println("输入错误，输入数字0返回上一级菜单！");
                    }
                }
                break;

            } else if (choose == 3) {
                for (;;) {
                    System.out.println("执行删除客户");
                    System.out.print("输入数字0返回上一级菜单:");
                    int choose1 = input.nextInt();
                    if (choose1 == 0) {
                        customerMenu();
                        break;
                    } else {
                        System.out.println("输入错误，输入数字0返回上一级菜单！");
                    }
                }
                break;

            } else if (choose == 0) {
                mainMenu();
                break;

            } else {
                System.out.println("输入错误,请重新输入!");
            }
        }
    }

    public void sendCustMenu() { // 回饋顧客
        for (;;) {
            System.out.println("我行我素购物管理系统主菜单>");
            System.out.println("***************************\n");
            System.out.println("\t1.幸运大放送\n");
            System.out.println("\t2.幸运抽奖\n");
            System.out.println("\t3.生日问候\n");
            System.out.println("***************************");
            System.out.print("请选择,输入数字或按0返回上一级菜单:");
            int choose = input.nextInt();

            if (choose == 1) {
                for (;;) {
                    System.out.println("执行幸运大放送");
                    System.out.print("输入数字0返回上一级菜单:");
                    int choose1 = input.nextInt();
                    if (choose1 == 0) {
                        customerMenu();
                        break;
                    } else {
                        System.out.println("输入错误，输入数字0返回上一级菜单！");
                    }
                }
                break;

            } else if (choose == 2) {
                for (;;) {
                    System.out.println("执行幸运抽奖");
                    System.out.print("输入数字0返回上一级菜单:");
                    int choose1 = input.nextInt();
                    if (choose1 == 0) {
                        customerMenu();
                        break;
                    } else {
                        System.out.println("输入错误，输入数字0返回上一级菜单！");
                    }
                }
                break;

            } else if (choose == 3) {
                for (;;) {
                    System.out.println("执行生日问候");
                    System.out.print("输入数字0返回上一级菜单:");
                    int choose1 = input.nextInt();
                    if (choose1 == 0) {
                        customerMenu();
                        break;
                    } else {
                        System.out.println("输入错误，输入数字0返回上一级菜单！");
                    }
                }
                break;

            } else if (choose == 0) {
                mainMenu();

            } else {
                System.out.println("输入错误,请重新输入!");
            }
        }
    }

}

