package com.staxrt.tutorial.model;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.NotFound;

import io.micrometer.core.lang.NonNull;

@XmlRootElement
public class Tag {
	@Size(max=2,message="Tag id size exceeded")
	private String tagid;
	@NonNull
	private String registrationNumber;
	@NonNull
	private String vehicleClass;
	@NonNull
	private String wim;
	
	
	public String getTagid() {
		return tagid;
	}
	public void setTagid(String tagid) {
		this.tagid = tagid;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	public String getWim() {
		return wim;
	}
	public void setWim(String wim) {
		this.wim = wim;
	}
	
}
