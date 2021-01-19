package wms.model;

import wms.beans.Receptie;
import wms.test.GenereazaReceptie;

public class OperatiiReceptie {

	
	
	public Receptie getReceptieUser(String codUser, String codUtilaj){
		return new GenereazaReceptie().genereazaReceptie(codUser, codUtilaj);
		
	}
	
	public Receptie getReceptieMaterial(String idReceptie, String codBare){
		return null;
	}
	
	public boolean saveMaterialReceptie(String idReceptie, String codArticol, int cantitate, String cobBareDest, String codUser){
		
		
		
		return true;
		
		
	}
}
