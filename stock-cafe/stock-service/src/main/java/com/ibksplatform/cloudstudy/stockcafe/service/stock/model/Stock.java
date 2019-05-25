package com.ibksplatform.cloudstudy.stockcafe.service.stock.model;

import com.ibksplatform.cloudstudy.stockcafe.service.stock.util.DateUtil;

import java.math.BigDecimal;

public class Stock {

    private String id; //날짜 + 종목코드

    // 종가
    private BigDecimal price;

    // 종목명
    private String name;

    private String dateString;

    private String code; //종목코드

    // 시가총액
    // 컨센서스
    // 괴리율
    // PER
    // PBR
    // 과거52주 최고가
    // 최고가대비등락폭
    // 과거52주 최저가
    // 최저가대비등락폭
    // 배당수익률
    // 외국인보유률

    public Stock() {

    }

    public Stock(String id) {
        this.id = id;
    }

    public Stock(String code, String name, BigDecimal price) {
        this.dateString = DateUtil.getCurrentDate();
        this.code = code;
        this.id = getCode() + getDateString();
        this.price = price;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String stockId) {
        this.id = stockId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateString() {
        return dateString;
    }

    public String getCode() {
        return code;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

