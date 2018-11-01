package vicinity.adapter.VCNT_CERTHDoor_Adapter;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Measurement {
	@JsonProperty("ID")
	private String ID;
	@JsonProperty("event")
	private Integer event;
	@JsonProperty("battery")
	private String battery;
	@JsonProperty("timestamp")
	private String timestamp;

	/**
	* No args constructor for use in serialization
	* 
	*/
	public Measurement() {
	}

	/**
	* 
	* @param timestamp
	* @param event
	* @param battery
	* @param ID
	*/
	public Measurement(String ID, Integer event, String battery, String timestamp) {
	super();
	this.ID = ID;
	this.event = event;
	this.battery = battery;
	this.timestamp = timestamp;
	}

	
	public String getID() {
	return ID;
	}

	
	public void setID(String ID) {
	this.ID = ID;
	}

	
	public Integer getEvent() {
	return event;
	}

	
	public void setEvent(Integer event) {
	this.event = event;
	}

	
	public String getBattery() {
	return battery;
	}

	
	public void setBattery(String battery) {
	this.battery = battery;
	}

	
	public String getTimestamp() {
	return timestamp;
	}

	
	public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
	}
	@Override
	public String toString() {
	return new ToStringBuilder(this).append("ID", ID).append("event", event).append("battery", battery).append("timestamp", timestamp).toString();
	}
}
