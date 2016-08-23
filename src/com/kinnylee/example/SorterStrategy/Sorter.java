package com.kinnylee.example.SorterStrategy;

/**
 * Created by lijl-c on 2016/8/23.
 */
public class Sorter {

    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public void sort(){
        sortStrategy.sort();
    }
}
