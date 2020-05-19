package com.fsd.service;

import com.fsd.entity.StockExchangeEntity;
import com.fsd.repository.ExchangeRepository;
import com.fsd.utils.CommonResult;
import com.fsd.utils.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExchangeService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ExchangeRepository exchangeRepository;

	public CommonResult findByExchange(String exchange) {
		try {
			StockExchangeEntity stockExchange = exchangeRepository.findByExchange(exchange);
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!", stockExchange);
		} catch (Exception e) {
			logger.error("Fail to query exchange data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}


	public CommonResult findById(int id) {
		try {
			StockExchangeEntity stockExchange = exchangeRepository.findById(id).get();
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!", stockExchange);
		} catch (Exception e) {
			logger.error("Fail to query exchange data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}

}
