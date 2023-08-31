package com.company;

public class Main {

    public static void main(String[] args) {
   // Khai bao bien
        int aInt = 1;
        byte aByte = 2;
        float aFloat = 1.1f;
        double aDouble = 2.2d;
        boolean aBoolean = true; //false
        String testchuoi = "Hello word";
        long aLong = 3;
        short aShort = 4;

        // Cac cach in du lieu
        // Print : in khong xuong dong
        System.out.print(aInt);
        System.out.print(testchuoi);
        System.out.println();
        // Println : in xuong dong
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aBoolean);
        System.out.println(aLong);
        System.out.println(aShort);
        System.out.println(aByte);
        System.out.println(testchuoi);
        /* Printf : in co dinh dang ket qua */
        System.out.printf("%S",testchuoi);
    }
}
