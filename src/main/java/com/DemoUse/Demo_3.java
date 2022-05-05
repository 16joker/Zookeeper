package com.DemoUse;


//最长回文子串
public class Demo_3 {
    public static String  findPalindrome(String str){
        int n = str.length();
        if (n < 2){
            return str;
        }
        //判定左右边界是否相等
        boolean[][] dp = new boolean[n][n];
        for(int i =0; i < n; i++){
            dp[i][i] = true;
        }
        //放入字符数组
        char[] charAte = str.toCharArray();
        //循环长度判定
        int maxLen = 1;
        int begin = 0;
        for(int L=2; L <= n; L++) {             //L = j-i+1
           for (int i =0; i < n; i++){
               int j = L+i-1;
               if (j>=n){
                   break;
               }
               if (charAte[i] != charAte[j]){
                   dp[i][j] = false;
               }else {
                   if (j-i == 1){
                       dp[i][j] = true;
                   }else{
                       dp[i][j] = dp[i+1][j];
                   }
               }
               if (dp[i][j] && j-i+1>maxLen){
                   maxLen = j-i+1;
                   begin = i;
               }
           }
        }

        return str.substring(begin, begin+maxLen);
    }

    public static void main(String[] args) {
        String s= "abbacdd";
        String result = findPalindrome(s);
        System.out.println("最长回文子串："+ result);
    }
}
