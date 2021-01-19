package wms.beans;

public class ArticolPregatire {

	private CantitatePregatire cantitate;
	private String sursa;
	private Articol articol;
	private String dataProd;
	private String dataExp;
	private String codBare;

	public CantitatePregatire getCantitate() {
		return cantitate;
	}

	public void setCantitate(CantitatePregatire cantitate) {
		this.cantitate = cantitate;
	}

	public String getSursa() {
		return sursa;
	}

	public void setSursa(String sursa) {
		this.sursa = sursa;
	}

	public Articol getArticol() {
		return articol;
	}

	public void setArticol(Articol articol) {
		this.articol = articol;
	}

	public String getDataProd() {
		return dataProd;
	}

	public void setDataProd(String dataProd) {
		this.dataProd = dataProd;
	}

	public String getDataExp() {
		return dataExp;
	}

	public void setDataExp(String dataExp) {
		this.dataExp = dataExp;
	}

	public String getCodBare() {
		return codBare;
	}

	public void setCodBare(String codBare) {
		this.codBare = codBare;
	}
	
	

}
