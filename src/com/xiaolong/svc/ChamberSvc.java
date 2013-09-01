package com.xiaolong.svc;

import java.util.List;

import com.xiaolong.model.Chamber;

public interface ChamberSvc {
	public void addChamber(Chamber chamber);
	public void removeChamber(Chamber chamber);
	public List<Chamber> listAll();
}
