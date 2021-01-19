package wms.test;

import wms.beans.Articol;
import wms.beans.CantitateIncarcare;
import wms.beans.Client;
import wms.beans.IncarcarePalet;
import wms.beans.Valabilitate;

public class GenereazaIncarcare {

	public IncarcarePalet genereazaIncarcarePalet(String codUser, String codUtilaj){
		
		IncarcarePalet incarcare = new IncarcarePalet();
		
		incarcare.setId(123);
		Client client = new Client();
		client.setCod("4110016380");
		client.setNume("TANCRAD SRL GALATI");
		incarcare.setClient(client);
		
		incarcare.setSursa("74.501.6");
		incarcare.setDestinatie("GL-12-ARB (TRAP)");
		
		Articol articol = new Articol();
		articol.setCod("10700879");
		articol.setDenumire("CM9 ADEZIV CERESIT INT 25KG");
		incarcare.setArticol(articol);
		
		CantitateIncarcare cantitate = new CantitateIncarcare();
		cantitate.setCantUmBaza(48);
		cantitate.setUmBaza("SAC");
		cantitate.setCantPaleti(1);
		incarcare.setCantitate(cantitate);
		
		Valabilitate valabil = new Valabilitate();
		valabil.setDataProd("06.2020");
		valabil.setDataExp("03.2021");
		incarcare.setValabilitate(valabil);
		
		return incarcare;
	}
}
