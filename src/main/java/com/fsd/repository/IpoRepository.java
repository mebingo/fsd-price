package com.fsd.repository;

import com.fsd.entity.IPODetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IpoRepository extends JpaRepository<IPODetailEntity, Integer> {

	@Query(name = "findIPOByExchange", nativeQuery = true,
			value = "SELECT * from ipodetails  where stockexchange = :stockexchange")
	IPODetailEntity findIPOByExchange(String stockexchange);

	@Query(name = "findIPOByExchange", nativeQuery = true,
			value = "SELECT * from ipodetails  where companyname = :companyname")
	IPODetailEntity findIPOByCompanyName(String companyname);
}

