package demo100;

import java.util.Arrays;

public class Subject4 {
    public static void main(String[] args) {
        char[] cha={'a','c','u','b','e','p','f','z'};
        System.out.println("原字符的顺序为：");
        for(int i=0;i<cha.length;i++){
            System.out.println(cha[i]+" ");
        }
        System.out.println("\t升序排序后：");
        Arrays.sort(cha);
        for(int i=0;i<cha.length;i++){
            System.out.println(cha[i]+" ");
        }

        System.out.println("\t降序排序后：");
        for (int i=0;i<cha.length;i++){
            for(int j=cha.length-1;j>=i+1;j--){
                if(cha[j]>cha[j-1]){
                    int tmp=cha[j-1];
                    cha[j-1]=cha[j];
                    cha[j]=(char) tmp;
                }
            }
        }
        for(int i=0;i<cha.length;i++){
            System.out.println(cha[i]+" ");
        }
    }
}
