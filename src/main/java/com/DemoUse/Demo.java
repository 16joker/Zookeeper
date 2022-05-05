package com.DemoUse;

import java.util.HashSet;


//最长无重字符串
public class Demo {
    public static int StringFound(String s){
        HashSet<Object> hset = new HashSet<>();
        int n = s.length();
        int ans = 0;
        int rk = -1;
        for (int i = 0; i < n ; ++i){
            if (i != 0){
                hset.remove(s.charAt(i - 1));
            }
            while (rk+1<n && !hset.contains(s.charAt(rk+1))){
                hset.add(s.charAt(rk+1));
                ++rk;
            }
            ans = Math.max(ans, hset.size());
            //ans = Math.max(ans, rk-i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "abcdefghacbbcdddyunvcd";
        int result = StringFound(str);
        System.out.println("最长字符长度为："+result);
    }
}
