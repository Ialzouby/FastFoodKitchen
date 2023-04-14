package fastfoodkitchen;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issamalzouby
 */
public class FastFoodKitchen {
    
    private ArrayList <BurgerOrder> orderList  = new ArrayList(); 
    
    private static int nextOrderNum = 1;
    
    public int getnextOrderNum() 
    {
        return nextOrderNum;
    }   
    
    private static void incrementNextOrderNum() 
    {
        nextOrderNum = nextOrderNum + 1;
    }
    
    public FastFoodKitchen(){
        
        orderList.add(new BurgerOrder(3, 5, 4, 10, true, getnextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new BurgerOrder(0, 0, 3, 3, false, getnextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new BurgerOrder(1, 1, 0, 2, false, getnextOrderNum()));
        incrementNextOrderNum();
        
    
    }
    /**
     * Method that Creates a new burger order and adds it to the order list
     * @param ham amount of hamburgers 
     * @param cheese amount of cheeseburgers
     * @param veggie amount of veggieburgers
     * @param soda amount of sodas
     * @param toGo to go or not to go 
     * @return returns the order number of the new burger order
     */
    public int addOrder(int ham, int cheese, int veggie, int  soda, boolean toGo){

        orderList.add(new BurgerOrder(ham, cheese, veggie, soda, true, getnextOrderNum()));
        incrementNextOrderNum();
        return getnextOrderNum(); 

    } 
    /**
     * cancels the last order in the queue
     * @return true if removed and false if not
     */
    public boolean cancelLastOrder() 
    {
        if (!orderList.isEmpty())
        {
            orderList.remove(orderList.size()-1);
            nextOrderNum = nextOrderNum -1 ;  
            return true;
        }
        return false; 
        
    }
    /**
     * Gets the number of orders in the system
     * @return size of order list
     */
    public int getNumOrdersPending()
    {
        return orderList.size();
    }

    
    public String toString(){
        return "FastFood Kitchen{" + "OrderList="+ orderList +'}';
    }
    public boolean isOrderDone(int orderID){
    for(int i=0; i < orderList.size(); i++){
       if (orderList.get(i).getOrderNumber() == orderID){
          return false;
       }
    }
    return true;
    }
    public boolean cancelOrder(int orderID){
    for(int i=0; i<orderList.size(); i++){
       if (orderList.get(i).getOrderNumber() == orderID){
           orderList.remove(i);
       return true;
       }
      
    }
    return false;
    }
    
    
   public int findOrderSeq(int orderID){
        for (int i=0;i< orderList.size(); i++){
            if(orderList.get(i).getOrderNumber() == orderID){
            int pos = i;
            return pos;
            }
        }
         return 0;
    }
   
   
   public ArrayList<BurgerOrder> getOrderList(){

                     return orderList;
                    }
   
   
   
   
   
   public int findOrderBin(int orderID){
    int left = 0;
    int right = orderList.size() -1;
    while (left <= right){
       int middle = (left+right) /2 ;
       if (orderID < orderList.get(middle).getOrderNumber()){
           right = middle -1;
       }
       else if (orderID > orderList.get(middle).getOrderNumber()){
           left = middle +1;
       }
       else{
           return middle;
       }
    }
    return -1;
    }
   
   
   
    public void insertionSort(){

        for(int i=1;i<=orderList.size()-1;i++){

            BurgerOrder p=orderList.get(i);
            int j=i;
            while (j>0 && p.getBurgerTotal() <orderList.get(j-1).getBurgerTotal() ){
                orderList.set(j,orderList.get(j-1));
                j--;

                 }

                orderList.set(j,p);


            }



        }

    
     public void selectionSort(){

            for(int i=0;i<=orderList.size()-2;i++){

                int min=orderList.get(i).getBurgerTotal();
                int pos=i;

                for(int j=1;j<=orderList.size()-1;j++){
                    if(orderList.get(j).getBurgerTotal()<min)
                    {
                        min=orderList.get(j).getBurgerTotal();
                        pos=j;
                    }
                }

              

                BurgerOrder temp=orderList.get(i);
                orderList.set(i,orderList.get(pos));
                orderList.set(pos,temp);

            }
            
             
            
            

    }
    
}


    
    
    
   





