package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入幾秒");
        int ss = sc.nextInt();
        int mm = ss/60;
        int hr = 0;
        if(mm>=60){
            hr =  mm/60;
            mm = mm -60*hr;
            ss =ss-60*60*hr-60*mm;
            System.out.println("時"+hr+ "分"+mm+"秒"+ss);
        }

        else{
            ss = ss-mm*60;
            System.out.println("時"+hr+ "分"+mm+"秒"+ss);
        }

    }

}
