package com.fsd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ipodetails")
public class IPODetailEntity extends AuditEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ipoid;

	@Column(name = "companyname")
	private String companyName;

	@Column(name = "stockexchange")
	private String stockExchange;

	@Column(name = "pricepershare")
	private String pricePerShare;

	@Column(name = "totalnumber")
	private int totalNumber;

	@Column(name = "opendatetime")
	private String openDateTime;

	@Column(name = "iporemarks")
	private String ipoRemarks;

	public IPODetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIpoid() {
		return ipoid;
	}

	public void setIpoid(Integer ipoid) {
		this.ipoid = ipoid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(String pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public String getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}

	public String getIpoRemarks() {
		return ipoRemarks;
	}

	public void setIpoRemarks(String ipoRemarks) {
		this.ipoRemarks = ipoRemarks;
	}
}
