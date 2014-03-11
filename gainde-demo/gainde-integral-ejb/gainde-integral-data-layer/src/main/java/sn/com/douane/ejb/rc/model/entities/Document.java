package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOCUMENT")
public class Document implements Serializable{

	private static final long serialVersionUID = 4006127547449814978L;

	@Id
	@Column(name="RCCODEDOCUMENT", nullable=false, columnDefinition="CHAR(1)")
	private String rcCodeDocument;
	
	@Column(name="RBLIBELLEDOC", length=50, nullable=false)
    private String rcLibelleDoc;

	public Document() {
	}

	public Document(String rcCodeDocument, String rcLibelleDoc) {
		super();
		this.rcCodeDocument = rcCodeDocument;
		this.rcLibelleDoc = rcLibelleDoc;
	}

	public String getRcCodeDocument() {
		return rcCodeDocument;
	}

	public void setRcCodeDocument(String rcCodeDocument) {
		this.rcCodeDocument = rcCodeDocument;
	}

	public String getRcLibelleDoc() {
		return rcLibelleDoc;
	}

	public void setRcLibelleDoc(String rcLibelleDoc) {
		this.rcLibelleDoc = rcLibelleDoc;
	}
}
