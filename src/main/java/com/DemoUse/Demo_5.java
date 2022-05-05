package com.DemoUse;

public class Demo_5 {
    // 整数转罗马数字
    //num =1994  MCMXCIV
    public String toTransform(int num){
        int[] a = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] b= {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuffer sb = new StringBuffer();

        for(int i=a.length-1; i >= 0; i--) {
            int value = a[i];
            String valueStr = b[i];
            while (num >= value) {
                num -= value;
                sb.append(valueStr);
            }
            if (num == 0){
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Demo_5 demo_5 = new Demo_5();
        String result = demo_5.toTransform(1994);
        System.out.println("整数转罗马数字为：" + result);
    }

}
