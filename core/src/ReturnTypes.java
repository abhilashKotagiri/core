/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author abhilash
 */
public class ReturnTypes {
    
    private int addNum;
    
    public static void main(String[] args) {
        System.out.println("the given num is" + printNum(10));
        System.out.println("the sum is" + addNum(10, 20));
        
    }
    
    public static int printNum(int a) {
         return a;
    }
    
     public static int addNum(int num1, int num2 ) {
         int addNum = num1 + num2;
         return addNum;
        
    }
            
    
}
