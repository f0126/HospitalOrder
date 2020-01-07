package com.woniu.service;

import java.util.List;

import com.woniu.domain.Sourcenumber;

public interface SourcenumberService {
	void save(Sourcenumber s);
	void delete(Integer id);
	void update(Sourcenumber s);
	Sourcenumber findOne(Integer id);
	List<Sourcenumber> find();
	Sourcenumber selectConnectProject(Integer id);
	List<Sourcenumber> selectAll();
}
