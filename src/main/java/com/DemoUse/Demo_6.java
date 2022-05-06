package com.DemoUse;

public class Demo_6 {
    //寻找字符串最长前缀
    //***************横向搜索***************
    public String HorizontalSearch(String[] strs){
        if (strs == null && strs.length == 0){
            return " ";
        }

        String first = strs[0];
        for (int i=1; i < strs.length;i++){
            first = ChoseMin(first, strs[i]);
            if (first.length() == 0) {
                break;
            }
        }
        return first;
    }

    public String ChoseMin(String first, String str) {
        int length = first.length();
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (first.charAt(i) == str.charAt(i)) {
                index++;
            }
        }
        return first.substring(0, index);
    }

    //*********************纵向搜索******************************8
    public String VerticalSearch(String[] strs){
        if (strs == null && strs.length == 0){
            return " ";
        }
        String first = strs[0];
        int length = strs[0].length();
        for(int i =0; i< length; i++){
            char firstTarget = first.charAt(i);
            for (int j =1 ;j<strs.length;j++){
                String comp = strs[j];
                if (comp.charAt(i) != firstTarget){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }

    public static void main(String[] args) {
        Demo_6 demo_6 = new Demo_6();
        String[] strings = {"leet", "leetcode", "leecode"};
        String result = demo_6.VerticalSearch(strings);
        System.out.println("最长前缀为：" + result);
    }
}
