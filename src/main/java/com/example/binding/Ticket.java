package com.example.binding;

public class Ticket {
	
	private Integer ticketId;
	private String name;
	private String email;
	private String doj;
	private String from;
	private String  to;
	private String trainNum;
	private String status;
	
	
	public Integer getTicketId() {
		return ticketId;
	}


	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDoj() {
		return doj;
	}


	public void setDoj(String doj) {
		this.doj = doj;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getTrainNum() {
		return trainNum;
	}


	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + ticketId + ", name=" + name + ", email=" + email + ", doj=" + doj + ", from=" + from + ", to="
				+ to + ", trainNum=" + trainNum + ", status=" + status + "]";
	}
}