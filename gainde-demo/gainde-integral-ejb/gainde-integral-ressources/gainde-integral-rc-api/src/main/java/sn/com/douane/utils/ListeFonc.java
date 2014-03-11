package sn.com.douane.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ListeFonc implements Serializable{

	private static final long serialVersionUID = -6066781859228386792L;

	private List listFoncInitial = new ArrayList();
	
	private List listFoncFinal = new ArrayList();
	
	public ListeFonc() {
		super();
	}

	public List getListFoncInitial() {
		return listFoncInitial;
	}

	public void setListFoncInitial(List listFoncInitial) {
		this.listFoncInitial = listFoncInitial;
	}

	public List getListFoncFinal() {
		return listFoncFinal;
	}

	public void setListFoncFinal(List listFoncFinal) {
		this.listFoncFinal = listFoncFinal;
	}
}
