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
public class ifApp {
    public static void main(String[] args) {
        //if, else, else if, switch
        
        int hour = 21;
        boolean isWorkTime = hour >= 9 && hour < 21;

        if (isWorkTime) {
            System.out.println("Hello");
        } 
        else if(hour == 21){
                System.out.println("Have a good nigth!");
            }
        else {
            System.out.println("Bye!");
        }
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
