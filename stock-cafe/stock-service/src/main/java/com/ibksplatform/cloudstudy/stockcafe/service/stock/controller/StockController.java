package com.ibksplatform.cloudstudy.stockcafe.service.stock.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibksplatform.cloudstudy.stockcafe.service.stock.model.Stock;
import com.ibksplatform.cloudstudy.stockcafe.service.stock.repository.StockRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StockController.class);
    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    StockRepository repository;

    @PostMapping
    public Stock add(@RequestBody Stock stock) throws JsonProcessingException {
        LOGGER.info("stock add: {}", mapper.writeValueAsString(stock));
        return repository.add(stock);
    }

    @GetMapping("/{id}")
    public Stock findById(@PathVariable("id") String id) {
        return repository.findById(id);
    }

    @GetMapping("/stocks")
    public List<Stock> getStockList() {
        return repository.findAll();
    }
}
