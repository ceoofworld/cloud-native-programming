package com.ibksplatform.cloudstudy.stockcafe.service.stock.repository;

import com.ibksplatform.cloudstudy.stockcafe.service.stock.model.Stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StockRepository {

    private Map<String, Stock> stocks = new HashMap<>();

    public Stock add(Stock stock) {
        stock.setId(stock.getCode() + stock.getDateString());
        stocks.put(stock.getId(), stock);
        return stock;
    }

    public Stock update(Stock stock) {
        stocks.put(stock.getId(), stock);
        return stock;
    }

    public Stock findById(String id) {
        return stocks.get(id);
    }

    public void delete(String id) {
        stocks.remove(id);
    }

    public List<Stock> find(List<String> ids) {
        List<Stock> stockList = new ArrayList<>(stocks.values());
        return stockList.stream().filter(a -> ids.contains(a.getId())).collect(Collectors.toList());
    }

    public List<Stock> findAll() {
        List<Stock> stockList = new ArrayList<>(stocks.values());
        return stockList;
    }
}
