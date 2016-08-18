package com.kinnylee.designmodel.proxy;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class RealSearcher implements ISearcher {

    public RealSearcher(){

    }

    @Override
    public String doSearch(String userId, String searchType) {
        return "result set";
    }
}
