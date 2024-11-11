package com.tis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Train {
	@Id
	private int trainNumber;
	private String trainName;
	private String src;
	private String dst;
	private int noOfSeats;
	
	public Train() {
		super();
	}

	public Train(int trainNumber, String trainName, String src, String dst, int noOfSeats) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.src = src;
		this.dst = dst;
		this.noOfSeats = noOfSeats;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Train [trainNumber=" + trainNumber + ", trainName=" + trainName + ", src=" + src + ", dst=" + dst
				+ ", noOfSeats=" + noOfSeats + "]";
	}
	

}
