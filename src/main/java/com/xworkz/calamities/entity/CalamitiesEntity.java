package com.xworkz.calamities.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calamities_details_table")
public class CalamitiesEntity implements Serializable {
	@Id
	@Column(name = "C_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	@Column(name = "PLACE")
	private String place;
	@Column(name = "DATE")
	private Date date;
	@Column(name = "CAPTURED_BY")
	private String capturedBy;
	@Column(name = "CALAMITY_TYPE")
	private String calamityType;
	@Column(name = "AREA")
	private String area;
	@Column(name = "AVG_LOSS")
	private Long avgLoss;
	@Column(name = "NO_OF_DEATHS")
	private Integer noOfDeaths;
	@Column(name = "NO_OF_INJURED")
	private Integer noOfInjured;

	public CalamitiesEntity() {
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
		return "CalamitiesEntity [cid=" + cid + ", place=" + place + ", date=" + date + ", capturedBy=" + capturedBy
				+ ", calamityType=" + calamityType + ", area=" + area + ", avgLoss=" + avgLoss + ", noOfDeaths="
				+ noOfDeaths + ", noOfInjured=" + noOfInjured + "]";
	}

}
