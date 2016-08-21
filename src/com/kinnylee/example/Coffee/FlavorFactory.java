package com.kinnylee.example.Coffee;

/**
 * Created by 95 on 2016/8/21.
 */
public class FlavorFactory {

    private  Order[] orders = new Order[10];
    private int ordersMade = 0;
    private int totalFlavors = 0;

    public Order getOrder(String flavor){
        if(ordersMade > 0){
            for(int i = 0; i < totalFlavors; ++i){
                if(orders[i].getFlavor() == flavor){
                    return orders[i];
                }
            }
        }

        orders[ordersMade] = new Flavor(flavor);
        totalFlavors++;
        return orders[ordersMade++];
    }

    public int getTotalFlavors(){
        return totalFlavors;
    }
}
