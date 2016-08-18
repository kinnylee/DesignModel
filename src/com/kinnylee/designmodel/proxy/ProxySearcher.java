package com.kinnylee.designmodel.proxy;

/**
 * Created by lijl-c on 2016/8/18.
 */
public class ProxySearcher implements ISearcher {

    private RealSearcher realSearcher;
    private UsageLogger usageLogger;
    private AccessVaidator accessValidator;

    public ProxySearcher(){
        realSearcher = new RealSearcher();
    }

    @Override
    public String doSearch(String userId, String searchType) {
        if(checkAccess(userId)) {
            realSearcher.doSearch(userId, searchType);
            logUser(userId);
            System.out.println("accessing ok......");
            return "ok";
        }else{
            System.out.println("accessing error......");
            return null;
        }
    }

    public boolean checkAccess(String userId){
        accessValidator = new AccessVaidator();
        return accessValidator.vaidateUser(userId);
    }

    public void logUser(String userId){
        usageLogger = new UsageLogger();
        usageLogger.setUserId(userId);
        usageLogger.save();
    }
}
