package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "EXCEPTIONS")	
	public class Exceptions implements Serializable {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 8183786758658347505L;
		
		@Id
		@Column(name = "RCCODEEXCEPTION",length = 4,nullable = false)
		private String rcCodeException;
		
		
		@Column(name = "RCLIBELLEEXCEPTION",length = 200,nullable = false)
	    private String rcLibelleException;
	    
		@javax.persistence.OneToMany(mappedBy = "exception", targetEntity = ExceptionsTaxes.class)
	    private List<ExceptionsTaxes> exceptionstaxes = new ArrayList<ExceptionsTaxes>();

	  
		public Exceptions() {
			 
		}
		 
		public Exceptions(String rccodeexception, String rcLibelleException) {
			super(); 
			this.rcCodeException = rccodeexception;		
			this.rcLibelleException = rcLibelleException; 
		}
		
		
		public List<ExceptionsTaxes> getExceptionstaxes() {
			return exceptionstaxes;
		}

		public void setExceptionstaxes(List<ExceptionsTaxes> exceptionstaxes) {
			this.exceptionstaxes = exceptionstaxes;
		}
	
	    
	    public String getRcCodeException() {
			return rcCodeException;
		}


		public void setRcCodeException(String rcCodeException) {
			this.rcCodeException = rcCodeException;
		}


		public String getRcLibelleException() {
			return rcLibelleException;
		}


		public void setRcLibelleException(String rcLibelleException) {
			this.rcLibelleException = rcLibelleException;
		}

	}
