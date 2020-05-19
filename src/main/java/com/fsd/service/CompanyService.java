package com.fsd.service;

import com.fsd.entity.CompanyEntity;
import com.fsd.repository.CompanyRepository;
import com.fsd.utils.CommonResult;
import com.fsd.utils.ResponseCode;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CompanyRepository companyRepository;

	public CommonResult findAll() {
		try {
			List<CompanyEntity> company = companyRepository.findAll();
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!", company);
		} catch (Exception e) {
			logger.error("Fail to query company data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}

	public CommonResult findByCode(String companyCode) {
		try {
			CompanyEntity company = companyRepository.findByCompanyCode(companyCode);
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!", company);
		} catch (Exception e) {
			logger.error("Fail to query company data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}

	public CommonResult findByName(String companyName) {
		try {
			CompanyEntity company = companyRepository.findByName(companyName);
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!", company);
		} catch (Exception e) {
			logger.error("Fail to query company data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}

	public List<CompanyEntity> findComBySector(String sector){
		try{
			List<CompanyEntity> companyEntities=companyRepository.findAllBySectorName(sector);
			return companyEntities;
		}catch (Exception e){
			logger.error("Fail to query company data:", e);
			return null;
		}
	}

	public CommonResult findByCompanyid(Integer id) {
		try {
			CompanyEntity company = companyRepository.findById(id).get();
			return CommonResult.build(ResponseCode.SUCCESS, "SUCCESS!", company);
		} catch (Exception e) {
			logger.error("Fail to query company data:", e);
			return CommonResult.build(ResponseCode.ERROR_ACCESS_DB, "DB ERROR!");
		}
	}
}
