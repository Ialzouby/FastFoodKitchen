package fastfoodkitchen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issamalzouby
 */
public class BurgerOrder {
    
    private int numHamburgers = 0;
        private int numCheeseburgers = 0;
            private int numVeggieburgers = 0; 
                private int numSodas = 0; 
                    private boolean orderToGo = false; 
                        private int orderNumber = 21;

    
   
    public int getNumHamburgers(){
        return numHamburgers;
    }
    
    public void setNumHamburgers(int NH){
        if(NH<0){
            System.out.println("Cannot be less than 0");
        }else {
            this.numHamburgers = NH;
        }
    }
    
    public int getNumCheeseburgers(){
        return numCheeseburgers;
    }
    
    public void setNumCheeseburgers(int CB){
        if(CB < 0){
            System.out.println("Cannot be less than 0");
        }else {
            this.numCheeseburgers = CB;
        }
    }
    
    
     
    
    public int getNumVeggieburgers() {
        return numVeggieburgers; 
    }
    
    public void setNumVeggieburgers(int VB){
        if(VB < 0){
            System.out.println("Cannot be less than 0");
        }else { 
            this.numVeggieburgers = VB; 
        }
    }
    
    public int getNumSodas() {
        return numSodas; 
    }
    
    public void setNumSodas(int NS){
        if(NS < 0){
            System.out.println("Cannot be less than 0");
        }else { 
            this.numSodas = NS; 
        }
    }
    
    public boolean getOrderToGo(){
        return orderToGo; 
    }
    
    public void setOrderToGo(boolean TG){
        this.orderToGo = TG; 
    }
    
    public int getOrderNumber(){
        return orderNumber;
    }
    
    public void setOrderNumber(int ON){
        this.orderNumber = ON; 
    }
    
    public BurgerOrder(int hamBurgers, int cheeseBurgers, int veggieBurgers, int sodas, boolean toGo, int order){
        this.numHamburgers = hamBurgers;
        this.numCheeseburgers = cheeseBurgers;
        this.numVeggieburgers = veggieBurgers; 
        this.numSodas = sodas; 
        this.orderToGo = toGo; 
        this.orderNumber = order; 
    }
    
    
    
    
    public int getBurgerTotal(){

        return getNumHamburgers()+getNumCheeseburgers()+getNumVeggieburgers();
    }
    
    
}
