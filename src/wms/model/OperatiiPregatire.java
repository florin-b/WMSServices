package wms.model;

import java.net.URLDecoder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import wms.beans.CantitatePregatire;
import wms.beans.Status;
import wms.beans.TaskSalveazaPregatire;

public class OperatiiPregatire {

	public Status salveazaTaskPregatire(String strTask) {

		Status status = new Status();
		status.setSucces(true);

		TaskSalveazaPregatire taskPregatire = deserializeTaskPregatire(strTask);
		return status;
	}

	public TaskSalveazaPregatire deserializeTaskPregatire(String strTask) {

		TaskSalveazaPregatire taskPregatire = new TaskSalveazaPregatire();

		try {

			JSONObject jsonObject = (JSONObject) new JSONParser().parse(strTask);

			taskPregatire.setId(Integer.parseInt(jsonObject.get("id").toString()));
			taskPregatire.setCodClient(jsonObject.get("codClient").toString());
			taskPregatire.setCodArticol(jsonObject.get("codArticol").toString());
			taskPregatire.setCodSursa(jsonObject.get("codSursa").toString());
			taskPregatire.setCodDestinatie(jsonObject.get("codDestinatie").toString());

			JSONObject jsonCant = (JSONObject) new JSONParser().parse(jsonObject.get("cantitate").toString());
			CantitatePregatire cant = new CantitatePregatire();
			cant.setCantitate(Integer.parseInt(jsonCant.get("cantitate").toString()));
			cant.setUm(jsonCant.get("um").toString());
			taskPregatire.setCantitate(cant);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return taskPregatire;

	}

}
