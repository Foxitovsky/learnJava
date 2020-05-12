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
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // & - и, | - или, ^ - ксор
        //byte (1), short (2), int (4), long (8)
        //boolean (1), char (2), float (4), double (8)
        // <<, >>, >>>, ~
        // &&, ||, !
        // ==, !=, >, <, <=, >=
        
        int a = 12;
        int b = 11;
        
        int c = a+b;
        
        
        System.out.println(a);
        
        //long a = Long.MAX_VALUE;
        //float a = 22.22f;
       //int a = 9;
        //float s = a;
        //System.out.println("a = " + s);
       //printBinary(a, 4);
//       int b = 5;
//       printBinary(b, 4);
//       printBinary(a ^ b, 4);
//       a = a^b;
//       b = a^b;
//       a = a^b;
//       
//        System.out.println(a);
//        System.out.println(b);

//          int a = 1;
//          printBinary(a, 32);
//          
//          int b = ~a;
//          printBinary(b, 32);
//          
//          System.out.println(b);
//            int value = 8;
//            int i = 3;
//            
//            long mask = 1L << i;
//            printBinary(mask, 32);
//            printBinary(value, 32);
//            printBinary(mask & value, 32);
//            
//            long result = (mask & value) >> i;
//            
//            printBinary(result, 32);
//            System.out.print(result);
    }
    
    private static void printBinary(long value, int size) {
        for(int i = size - 1; i >= 0; i--){
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }
    
    
}
