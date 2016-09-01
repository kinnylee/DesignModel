package com.kinnylee.designmodel.simplefactory;

/**
 * Created by lijl-c on 2016/8/5.
 */
public class SimpleFactory {

    public static IFruit createFruit(String fruitName){
        if("apple".equals(fruitName)){
            return new Apple();
        }
        else if("grape".equals(fruitName)){
            return new Grape();
        }
        else if("strawberry".equals(fruitName)){
            return new Strawberry();
        }
        else{
            try {
                throw new BadFruitException("Bad fruit request");
            } catch (BadFruitException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
