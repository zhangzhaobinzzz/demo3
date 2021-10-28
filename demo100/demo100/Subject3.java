package demo100;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;
import java.util.Scanner;

public class Subject3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入五位同学的成绩：");
        int[] student=new int[5];
        for(int i=0;i<student.length;i++){
            System.out.println("请输入第"+(i+1)+"位同学的成绩");
            student[i]=sc.nextInt();
        }
        Arrays.sort(student);
        System.out.println("学员的成绩按升序排列：");
        for(int i=0;i<student.length;i++){
            System.out.println(student[i]+" ");
        }
    }
}
