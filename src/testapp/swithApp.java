/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author Dmitry
 */
public class swithApp {
    public static void main(String[] args) {
        int count = 4;
        
        switch(count){
            case 1:
                System.out.println("0%");
                break;
            case 2:
                System.out.println("10%");
                break;
            case 3:
                System.out.println("20%");
                break;
            case 4:
                System.out.println("40%");
                break;
            default:
                System.out.println("50%");
        }
//        if(count == 1){
//            System.out.println("0%");
//        } else if (count == 2){
//            System.out.println("2%");
//        }
    }
    private static void printBinary(long value, int size) {
        for(int i = size - 1; i >= 0; i--){
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
        
        //System.out.println(Long.toBinaryString(value));
    }
}
