/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author abhilash
 */
public class Switch {
    
    public static void main(String[] args) {
        String dayOfWeek = "Sunday";
        
        switch(dayOfWeek.toLowerCase()){
            case "monday": 
                System.out.println("today is Monday");
                break;
            case "tuesday":
                System.out.println("today is Tuesday");
                break;
            case "wednesday":
                System.out.println("today is Wednesday");
                break;
            case "thursday":
                System.out.println("today is Thursday");
                break;
            default:
                    System.out.println("day not available");
            
        }
    }
    
}
