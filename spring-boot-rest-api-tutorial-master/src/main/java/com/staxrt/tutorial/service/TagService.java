package com.staxrt.tutorial.service;

import com.staxrt.tutorial.dao.TagServiceDao;
import com.staxrt.tutorial.model.Tag;

public class TagService {
	public static Tag getTagDetails(Tag tag1) {
		Tag tag = TagServiceDao.getTagDetails(tag1);
		return tag;
	}
}
