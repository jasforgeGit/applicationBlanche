package sn.com.douane.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ListeGroupe implements Serializable {

	private static final long serialVersionUID = 1L;

	private List listGroupeInitial = new ArrayList();

	private List listGroupeFinal = new ArrayList();

	public ListeGroupe() {
		super();
	}

	public List getListGroupeInitial() {
		return listGroupeInitial;
	}

	public void setListGroupeInitial(List listGroupeInitial) {
		this.listGroupeInitial = listGroupeInitial;
	}

	public List getListGroupeFinal() {
		return listGroupeFinal;
	}

	public void setListGroupeFinal(List listGroupeFinal) {
		this.listGroupeFinal = listGroupeFinal;
	}
}