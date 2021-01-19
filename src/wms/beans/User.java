package wms.beans;

public class User {
	private String nume;
	private String cod;
	private String tipAngajat;
	private boolean loginSucces;
	private TaskUser taskUser;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getTipAngajat() {
		return tipAngajat;
	}

	public void setTipAngajat(String tipAngajat) {
		this.tipAngajat = tipAngajat;
	}

	public boolean isLoginSucces() {
		return loginSucces;
	}

	public void setLoginSucces(boolean loginSucces) {
		this.loginSucces = loginSucces;
	}
	
	

	public TaskUser getTaskUser() {
		return taskUser;
	}

	public void setTaskUser(TaskUser taskUser) {
		this.taskUser = taskUser;
	}

	@Override
	public String toString() {
		return "User [nume=" + nume + ", cod=" + cod + ", tipAngajat=" + tipAngajat + ", loginSucces=" + loginSucces
				+ "]";
	}

}
