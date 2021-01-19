package wms.test;

import java.util.ArrayList;
import java.util.List;

import wms.beans.Articol;
import wms.beans.ArticolPregatire;
import wms.beans.CantitatePregatire;
import wms.beans.Client;
import wms.beans.Pregatire;


public class GenereazaPregatire {
	
	public Pregatire genereazaPregatire(String codUser, String codBare){
		
		List<ArticolPregatire> listArt = new ArrayList<>();
		
		Pregatire pregatire = new Pregatire();
		
		pregatire.setId(123);
		
		Client client = new Client();
		client.setNume("TANCRAD SRL GALATI");
		client.setCod("41134582");
		pregatire.setClient(client);
		pregatire.setBoxaPregatire("85.652.4");
		
		ArticolPregatire art = new ArticolPregatire();
		art.setSursa("72.521.3");
		art.setCodBare("111");
		Articol a = new Articol();
		a.setCod("10704449");
		a.setDenumire("CE33 CERESIT ALB 2KG");
		art.setArticol(a);
		CantitatePregatire cant = new CantitatePregatire();
		cant.setCantitate(15);
		cant.setUm("SAC");
		art.setCantitate(cant);
		art.setDataProd("072020");
		art.setDataExp("042021");
		listArt.add(art);
		
		art = new ArticolPregatire();
		art.setSursa("74.501.9");
		art.setCodBare("222");
		a = new Articol();
		a.setCod("10700879");
		a.setDenumire("CM9 ADEZIV CERESIT INT 25KG");
		art.setArticol(a);
		cant = new CantitatePregatire();
		cant.setCantitate(5);
		cant.setUm("SAC");
		art.setCantitate(cant);
		art.setDataProd("032020");
		art.setDataExp("052021");
		listArt.add(art);
		
		
		art = new ArticolPregatire();
		art.setSursa("72.265.1");
		art.setCodBare("333");
		a = new Articol();
		a.setCod("10703461");
		a.setDenumire("CT29 TINCI CERESIT 25KG");
		art.setArticol(a);
		cant = new CantitatePregatire();
		cant.setCantitate(3);
		cant.setUm("SAC");
		art.setCantitate(cant);
		art.setDataProd("082020");
		art.setDataExp("012021");
		listArt.add(art);		
		
		
		art = new ArticolPregatire();
		art.setSursa("71.052.2");
		art.setCodBare("444");
		a = new Articol();
		a.setCod("10603242");
		a.setDenumire("CERESIT THERMO UNIVERSAL 25KG");
		art.setArticol(a);
		cant = new CantitatePregatire();
		cant.setCantitate(4);
		cant.setUm("SAC");
		art.setCantitate(cant);
		art.setDataProd("022020");
		art.setDataExp("022021");
		listArt.add(art);	
		
		art = new ArticolPregatire();
		art.setSursa("42.111.4");
		art.setCodBare("555");
		a = new Articol();
		a.setCod("10702045");
		a.setDenumire("CERESIT P 625 8KG ADEZIV POLIURETANIC");
		art.setArticol(a);
		cant = new CantitatePregatire();
		cant.setCantitate(5);
		cant.setUm("SAC");
		art.setCantitate(cant);
		art.setDataProd("092020");
		art.setDataExp("032021");
		listArt.add(art);
		
		art = new ArticolPregatire();
		art.setSursa("71.587.3");
		art.setCodBare("666");
		a = new Articol();
		a.setCod("10702048");
		a.setDenumire("CERESIT CT710 TENC. JAMAICA BROWN 20KG");
		art.setArticol(a);
		cant = new CantitatePregatire();
		cant.setCantitate(1);
		cant.setUm("SAC");
		art.setCantitate(cant);
		art.setDataProd("022020");
		art.setDataExp("072021");
		listArt.add(art);
		
		pregatire.setListArticole(listArt);
		
		return pregatire;
		
	}
	
	
	

}
