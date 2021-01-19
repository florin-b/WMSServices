package wms.beans;

public class TaskExtern {

	private String nume;
	private int cantitate;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	@Override
	public String toString() {
		return "TaskExtern [nume=" + nume + ", cantitate=" + cantitate + "]";
	}

}
