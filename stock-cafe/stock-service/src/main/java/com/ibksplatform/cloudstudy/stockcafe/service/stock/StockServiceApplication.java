package com.ibksplatform.cloudstudy.stockcafe.service.stock;

import com.ibksplatform.cloudstudy.stockcafe.service.stock.model.Stock;
import com.ibksplatform.cloudstudy.stockcafe.service.stock.repository.StockRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import java.math.BigDecimal;

@SpringBootApplication
@EnableDiscoveryClient
public class StockServiceApplication {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludePayload(true);
        loggingFilter.setIncludeHeaders(true);
        loggingFilter.setMaxPayloadLength(1000);
        loggingFilter.setAfterMessagePrefix("REQ:");
        return loggingFilter;
    }

    @Bean
    StockRepository repository() {
        StockRepository repository = new StockRepository();
        repository.add(new Stock("024110", "기업은행", new BigDecimal(13900)));
        repository.add(new Stock("000660", "하아닉스", new BigDecimal(67600)));
        repository.add(new Stock("005930", "삼성전자", new BigDecimal(42700)));
        repository.add(new Stock("066570", "LG전자", new BigDecimal(76300)));
        repository.add(new Stock("000720", "현대건설", new BigDecimal(49400)));
        repository.add(new Stock("068270", "셀트리온", new BigDecimal(181000)));
        repository.add(new Stock("006800", "미래에셋대우", new BigDecimal(7440)));
        repository.add(new Stock("035720", "카카오", new BigDecimal(124000)));
        repository.add(new Stock("035420", "네이버", new BigDecimal(113500)));
        return repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(StockServiceApplication.class, args);
    }

}
