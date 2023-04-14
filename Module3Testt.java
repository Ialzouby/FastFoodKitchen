/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fastfoodkitchen;

import java.util.ArrayList;

/**
 *
 * @author issamalzouby
 */
public class Module3Testt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastFoodKitchen kitchen = new FastFoodKitchen();
    
        //Part A
        int orderPosition = kitchen.findOrderSeq(2);
        System.out.println("Using sequential search >> order position is "
        +orderPosition);
        
        //Part B
        
        ArrayList<BurgerOrder> sortedOrders=kitchen.getOrderList();
                int orderSize=0;

                for(BurgerOrder order:sortedOrders){


                        orderSize=order.getNumCheeseburgers()+order.getNumVeggieburgers()+order.getNumHamburgers();

                        System.out.println(order.getOrderNumber() + " has " + orderSize + " burgers");

                } 
                
        //Part C
        kitchen.insertionSort();
        
        
         //Part D
                orderPosition=kitchen.findOrderBin(2);

                System.out.println("Using binary search >> Order position is " + orderPosition);


    
    }
    
}
