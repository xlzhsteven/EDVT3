package com.xiaolong.svc;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.xiaolong.dao.ChamberDAO;
import com.xiaolong.model.Chamber;

public class ChamberSvcImpl implements ChamberSvc {
	private ChamberDAO chamberDAO;
	
	public ChamberDAO getChamberDAO() {
		return chamberDAO;
	}

	public void setChamberDAO(ChamberDAO chamberDAO) {
		this.chamberDAO = chamberDAO;
	}

	@Override
	@Transactional
	public void addChamber(Chamber chamber) {
		chamberDAO.addChamber(chamber);
	}

	@Override
	public void removeChamber(Chamber chamber) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<Chamber> listAll() {
		return chamberDAO.listAll();
	}

}
