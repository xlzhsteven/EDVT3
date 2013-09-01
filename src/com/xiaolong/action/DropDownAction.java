package com.xiaolong.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.xiaolong.model.Chamber;
import com.xiaolong.svc.ChamberSvc;

public class DropDownAction extends ActionSupport implements Preparable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7437213162296847865L;
	
//	Chamber list
	private List<Chamber> listChamber = new ArrayList<>();

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
		return "success";
	}

	@Override
	public void prepare() throws Exception {
		listChamber = chamberSvc.listAll();
	}

}
