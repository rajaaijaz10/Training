package day12Strings;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringsDemo {
    public static void main(String[] args) {
        String s1="hello zworld";
        String s2="hello World";
        String s3=new String("hello");
        String s4 = new String("hello");
//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        System.out.println(s3==s4);
//        byte[] b=s1.getBytes(StandardCharsets.UTF_8); //gives byte array of a string
//        for (byte bb:b)
//            System.out.println((char) bb);
//        byte[] b1=s1.getBytes();
//        for (byte bb:b1)
//            System.out.println((char)bb);
        System.out.println(s1.charAt(7));  //returns a char at given index
        System.out.println(s1.codePointAt(6)); //returns byte equanent of a char at goven index
        System.out.println(s1.codePointBefore(7));
        System.out.println(s1.codePointCount(0,s1.length())); // length of a substring
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.split(" ")[0]);
        char[] ary=s1.toCharArray();
        System.out.println(reverse(s2));
        System.out.println(ispal("Madam"));


    }
    static boolean ispal(String s){
        s=s.toLowerCase();
        boolean flag=false;
        if(s.equals(reverse(s)))
            flag=true;
        return flag;

    }
    static String reverse(String s){

        int tail=0;
        char[] str=s.toCharArray();
        int head=str.length-1;
        char tmp;
        while (!(head-tail < 2) ){
            tmp=str[head];
            str[head]=str[tail];
            str[tail]=tmp;
            head--;
            tail++;

        }
       String rev= new String(str);

        return rev;
    }
}
