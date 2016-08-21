package com.kinnylee.example.Coffee;

/**
 * Created by 95 on 2016/8/21.
 */
public class Flavor extends Order{

    private String flavor;

    public Flavor(String flavor){
        this.flavor = flavor;
    }

    @Override
    public void server(Table table) {
        System.out.println("Serving table: " + table.getNumber() + ", with flavor: " + flavor   );
    }

    @Override
    public String getFlavor() {
        return flavor;
    }
}
