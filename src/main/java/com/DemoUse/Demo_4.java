package com.DemoUse;

import java.util.HashMap;

public class Demo_4 {

    // 罗马数字转整数
    public int transNum(String str){
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int n = str.length();
        int result = 0;
        for (int i =0; i < n; i++){
            int value = hmap.get(str.charAt(i));
            if (i < n-1 && value < hmap.get(str.charAt(i+1))){
                result -= value;
            }else{
                result += value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Demo_4 alt = new Demo_4();
        int ans = alt.transNum("MCMXCIV");
        System.out.println("罗马数字对应的整数为：" + ans);
    }
}
