/*
 * Nick Dernovsek
 * carpet.java      
 * This program calculates the cost of a carpet
 */

package carpet;

import java.text.DecimalFormat;

/**
 *
 * @author nider6687
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length = 8.5;
        double width = 6.0;
        double costPerSquare = 19.95;
        double cost = 0.0;
        
        DecimalFormat x = new DecimalFormat("###.##");
        //changes that amount of deimals for cost to only 2
        
        cost = length*width*costPerSquare;
        System.out.println ("The cost of this carpet is " + x.format(cost)  + "$");
    }
    
}
