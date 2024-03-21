package Recheck;
import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String b = "";

        for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                b += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                b += Character.toUpperCase(c);
            }
        }
        System.out.print(b);
    }
}
