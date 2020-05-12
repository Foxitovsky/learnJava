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
public class forApp {
    public static void main(String[] args) {
        //for, while, do while
        //for (initialization, termination, increment)
        int i = 0;
        do {
            System.out.println(i);
            i++;
      }while (i < 32);
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
