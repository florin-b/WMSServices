package wms.test;

import wms.beans.Articol;
import wms.beans.CantitateReceptie;
import wms.beans.Receptie;
import wms.beans.SursaReceptie;

public class GenereazaReceptie {

	public Receptie genereazaReceptie(String codUser, String codUtilaj) {

		Receptie receptie = new Receptie();

		receptie.setId(123);

		SursaReceptie sursa = new SursaReceptie();
		sursa.setNrAuto("GL-12-ARB (TRAP)");
		sursa.setFurnizor("Henkel Romania");
		receptie.setSursa(sursa);

		return receptie;
	}

	public Receptie genereazeReceptieMaterial(String idReceptie, String codBare) {

		Receptie receptie = new Receptie();

		if (codBare.equals("111")) {
			receptie.setId(123);
			receptie.setDestinatie("74.510.1");

			CantitateReceptie cantitate = new CantitateReceptie();
			cantitate.setCantUmBaza(48);
			cantitate.setUmBaza("SAC");
			cantitate.setCantPaleti(1);
			receptie.setCantitate(cantitate);

			Articol articol = new Articol();
			articol.setCod("10700879");
			articol.setDenumire("CM9 ADEZIV CERESIT INT 25KG");
			receptie.setArticol(articol);
		} else if (codBare.equals("222")) {

			receptie.setId(123);
			receptie.setDestinatie("74.425.9");

			CantitateReceptie cantitate = new CantitateReceptie();
			cantitate.setCantUmBaza(48);
			cantitate.setUmBaza("SAC");
			cantitate.setCantPaleti(1);
			receptie.setCantitate(cantitate);

			Articol articol = new Articol();
			articol.setCod("10700877");
			articol.setDenumire("CM16 ADEZIV CERESIT FLEXIBIL INT/EXT25KG");
			receptie.setArticol(articol);
		}
		else
			return null;

		return receptie;

	}

}
