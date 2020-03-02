package com.staxrt.tutorial.dao;

import com.staxrt.tutorial.model.Tag;

public class TagServiceDao {
	public static Tag getTagDetails(Tag tag1) {
		String str="select * from tag";
		 Tag tag = new Tag();
		  tag.setRegistrationNumber(tag1.getRegistrationNumber());
		  tag.setTagid(tag1.getTagid());
		  tag.setVehicleClass(tag1.getVehicleClass());
		  tag.setWim(tag1.getWim());
		  return tag;
		
	}
}
