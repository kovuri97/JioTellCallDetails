package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CallDetails {
	@Id
	private int callId;
	private String callBy;
	private String callTo;
	private String callDuration;
	private String date;
	public int getCallId() {
		return callId;
	}
	public void setCallId(int callId) {
		this.callId = callId;
	}
	public String getCallBy() {
		return callBy;
	}
	public void setCallBy(String callBy) {
		this.callBy = callBy;
	}
	public String getCallTo() {
		return callTo;
	}
	public void setCallTo(String callTo) {
		this.callTo = callTo;
	}
	public String getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
