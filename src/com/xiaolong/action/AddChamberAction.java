package com.xiaolong.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaolong.model.Chamber;
import com.xiaolong.svc.ChamberSvc;

public class AddChamberAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4627316644527096038L;

//	Chamber
	Chamber chamber = new Chamber();
	
	public Chamber getChamber() {
		return chamber;
	}

	public void setChamber(Chamber chamber) {
		this.chamber = chamber;
	}
	
//	Chamber List
	List<Chamber> listChamber;
	
	public List<Chamber> getListChamber() {
		return listChamber;
	}

	public void setListChamber(List<Chamber> listChamber) {
		this.listChamber = listChamber;
	}

//	Chamber Service
	private ChamberSvc chamberSvc;
	
	public ChamberSvc getChamberSvc() {
		return chamberSvc;
	}

	public void setChamberSvc(ChamberSvc chamberSvc) {
		this.chamberSvc = chamberSvc;
	}

	@Override
	public String execute() throws Exception {
		listChamber = new ArrayList<>();
		chamberSvc.addChamber(chamber);
		listChamber = chamberSvc.listAll();
		return "success";
	}
}
