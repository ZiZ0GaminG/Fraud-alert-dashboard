package com.milos.fraudalertdashboard.vo;

import com.milos.fraudalertdashboard.dao.entity.FraudAlertData;

import java.io.Serializable;
import java.util.List;


public class Response implements Serializable {
	private List<FraudAlertData> fraudAlert;
	
	public List<FraudAlertData> getFraudAlert() {
		return fraudAlert;
	}
	public void setFraudAlert(List<FraudAlertData> fraudAlert) {
		this.fraudAlert = fraudAlert;
	}

}
