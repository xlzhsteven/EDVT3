package com.xiaolong.dao;

import java.util.List;

import com.xiaolong.model.Chamber;

public interface ChamberDAO {
	public void addChamber(Chamber chamber);
	public void removeChamber(Chamber chamber);
	public List<Chamber> listAll();
}
