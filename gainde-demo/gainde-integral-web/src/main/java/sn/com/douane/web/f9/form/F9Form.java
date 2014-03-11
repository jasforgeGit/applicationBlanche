package sn.com.douane.web.f9.form;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class F9Form implements Serializable{


	  private static final long serialVersionUID = 1L;
	  private String pk = null;
	  private String lib1;
	  private String lib2;
	  private String lib3;
	  private String lib4;
	  private String lib5;
	  private String lib6;
	  private String lib7;
	  private String lib8;
	  private String lib9;
	  private String lib10;
	  private String titre1;
	  private static String libm1;
	  private static String libm2;
	  private static String libm3;
	  private static String libm4;
	  private static String libm5;
	  private static String libm6;
	  private static String libm7;
	  private static String libm8;
	  private static String libm9;
	  private static String libm10;
	  private String finder;
	  private String TableName;
	  private String f9forward;
	  private String where;
	  private List VFieldTyp;
	  private List vf9 = new ArrayList();
	  private List<?> listF9Grid;
	  
		/**
		 * variables du Grid 
		 */
		private Integer rows ;
		private Integer page ;
		private String  sord;
		private String  sidx;
		private Integer total;
		private Integer records;
		private String index;
	  
	  public void reset()
	  {
	    finder = null;
	  }

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getLib1() {
		return lib1;
	}

	public void setLib1(String lib1) {
		this.lib1 = lib1;
	}

	public String getLib2() {
		return lib2;
	}

	public void setLib2(String lib2) {
		this.lib2 = lib2;
	}

	public String getLib3() {
		return lib3;
	}

	public void setLib3(String lib3) {
		this.lib3 = lib3;
	}

	public String getLib4() {
		return lib4;
	}

	public void setLib4(String lib4) {
		this.lib4 = lib4;
	}

	public String getLib5() {
		return lib5;
	}

	public void setLib5(String lib5) {
		this.lib5 = lib5;
	}

	public String getLib6() {
		return lib6;
	}

	public void setLib6(String lib6) {
		this.lib6 = lib6;
	}

	public String getLib7() {
		return lib7;
	}

	public void setLib7(String lib7) {
		this.lib7 = lib7;
	}

	public String getLib8() {
		return lib8;
	}

	public void setLib8(String lib8) {
		this.lib8 = lib8;
	}

	public String getLib9() {
		return lib9;
	}

	public void setLib9(String lib9) {
		this.lib9 = lib9;
	}

	public String getLib10() {
		return lib10;
	}

	public void setLib10(String lib10) {
		this.lib10 = lib10;
	}

	public String getTitre1() {
		return titre1;
	}

	public void setTitre1(String titre1) {
		this.titre1 = titre1;
	}

	public static String getLibm1() {
		return libm1;
	}

	public static void setLibm1(String libm1) {
		F9Form.libm1 = libm1;
	}

	public static String getLibm2() {
		return libm2;
	}

	public static void setLibm2(String libm2) {
		F9Form.libm2 = libm2;
	}

	public static String getLibm3() {
		return libm3;
	}

	public static void setLibm3(String libm3) {
		F9Form.libm3 = libm3;
	}

	public static String getLibm4() {
		return libm4;
	}

	public static void setLibm4(String libm4) {
		F9Form.libm4 = libm4;
	}

	public static String getLibm5() {
		return libm5;
	}

	public static void setLibm5(String libm5) {
		F9Form.libm5 = libm5;
	}

	public static String getLibm6() {
		return libm6;
	}

	public static void setLibm6(String libm6) {
		F9Form.libm6 = libm6;
	}

	public static String getLibm7() {
		return libm7;
	}

	public static void setLibm7(String libm7) {
		F9Form.libm7 = libm7;
	}

	public static String getLibm8() {
		return libm8;
	}

	public static void setLibm8(String libm8) {
		F9Form.libm8 = libm8;
	}

	public static String getLibm9() {
		return libm9;
	}

	public static void setLibm9(String libm9) {
		F9Form.libm9 = libm9;
	}

	public static String getLibm10() {
		return libm10;
	}

	public static void setLibm10(String libm10) {
		F9Form.libm10 = libm10;
	}

	public String getFinder() {
		return finder;
	}

	public void setFinder(String finder) {
		this.finder = finder;
	}

	public String getTableName() {
		return TableName;
	}

	public void setTableName(String tableName) {
		TableName = tableName;
	}

	public String getF9forward() {
		return f9forward;
	}

	public void setF9forward(String f9forward) {
		this.f9forward = f9forward;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public List getVFieldTyp() {
		return VFieldTyp;
	}

	public void setVFieldTyp(List vFieldTyp) {
		this.VFieldTyp = vFieldTyp;
	}

	public List getVf9() {
		return vf9;
	}

	public void setVf9(List vf9) {
		this.vf9 = vf9;
	}

	public List<?> getListF9Grid() {
		return listF9Grid;
	}

	public void setListF9Grid(List<?> listF9Grid) {
		this.listF9Grid = listF9Grid;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

}
