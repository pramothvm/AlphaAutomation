package Utility;//package Utility;
//
//import java.util.Base64;
//import java.util.Scanner;
//
//public class Base64Encoder {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("PLease enter your Username");
//        String username = input.next();
//        System.out.println("PLease enter your Password");
//        String password = input.next();
//
//
//        System.out.println("Your encoded Base64 Username is :- ");
//        System.out.println(encodedBase64String(username).trim());
//
//        System.out.println("Your encoded Base64 Username is :- ");
//        System.out.println(encodedBase64String(password).trim());
//
//    }
//
//
//public static String encodedBase64String(String str){
//
//        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
//        return encodedString;
//    }
//
//
//
//}
