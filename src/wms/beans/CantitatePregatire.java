package wms.beans;

public class CantitatePregatire {

	private int cantitate;
	private String um;

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	@Override
	public String toString() {
		return "CantitatePregatire [cantitate=" + cantitate + ", um=" + um + "]";
	}

}
