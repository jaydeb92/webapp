package com.xworkz.calamities.dto;

import java.io.Serializable;
import java.util.Date;

public class CalamitiesDTO implements Serializable {

	private Integer cid;

	private String place;

	private Date date;

	private String capturedBy;

	private String calamityType;

	private String area;

	private Long avgLoss;

	private Integer noOfDeaths;

	private Integer noOfInjured;

	public CalamitiesDTO() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

	public String getCalamityType() {
		return calamityType;
	}

	public void setCalamityType(String calamityType) {
		this.calamityType = calamityType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Long getAvgLoss() {
		return avgLoss;
	}

	public void setAvgLoss(Long avgLoss) {
		this.avgLoss = avgLoss;
	}

	public Integer getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(Integer noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

	public Integer getNoOfInjured() {
		return noOfInjured;
	}

	public void setNoOfInjured(Integer noOfInjured) {
		this.noOfInjured = noOfInjured;
	}

	@Override
	public String toString() {
		return "CalamitiesDTO [cid=" + cid + ", place=" + place + ", date=" + date + ", capturedBy=" + capturedBy
				+ ", calamityType=" + calamityType + ", area=" + area + ", avgLoss=" + avgLoss + ", noOfDeaths="
				+ noOfDeaths + ", noOfInjured=" + noOfInjured + "]";
	}

}