package demo100;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class Subject13 {
    public static int getindex(String[] arr, String name){
        for (int i=0;i<arr.length;i++){
            if (name.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] name=new String[]{"jack","lilly","tom","benz"};
        for (String i:name){
            System.out.println(i+" ");
        }
        System.out.println("\n");
        System.out.println("请输入你要查找的名字");
        String person=input.next();
        int index1=getindex(name,person);
        if (index1>=0){
            System.out.println("恭喜找到了");
        }else{
            System.out.println("没找到");
        }

    }
}
