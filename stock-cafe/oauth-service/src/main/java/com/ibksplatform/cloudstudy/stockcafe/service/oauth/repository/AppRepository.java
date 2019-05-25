package com.ibksplatform.cloudstudy.stockcafe.service.oauth.repository;

import com.ibksplatform.cloudstudy.stockcafe.service.oauth.model.App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppRepository {
    private Map<String, App> apps = new HashMap<>();

    public App add(App app) {
        apps.put(app.getAppKey(), app);
        return app;
    }

    public App update(App app) {
        apps.put(app.getAppKey(), app);
        return app;
    }

    public App findById(String appKey) {
        return apps.get(appKey);
    }

    public void delete(String id) {
        apps.remove(id);
    }

    public List<App> find(List<String> appKeys) {
        List<App> appList = new ArrayList<>(apps.values());
        return appList.stream().filter(a -> appKeys.contains(a.getAppKey())).collect(Collectors.toList());
    }

    public List<App> findAll() {
        List<App> appList = new ArrayList<>(apps.values());
        return appList;
    }
}
