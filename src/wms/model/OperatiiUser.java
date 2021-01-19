package wms.model;

import wms.beans.IncarcarePalet;
import wms.beans.Pregatire;
import wms.beans.Receptie;
import wms.beans.TaskPropriu;
import wms.beans.TaskUser;
import wms.enums.EnumTipTask;
import wms.test.GenereazaIncarcare;
import wms.test.GenereazaPregatire;
import wms.test.GenereazaReceptie;
import wms.test.TaskuriExterne;

public class OperatiiUser {

	public TaskUser getTaskUser(String codUser, String codUtilaj) {

		TaskUser taskUser = new TaskUser();

		if (codUser.equals("000")) {
			taskUser.setTaskPropriu(null);
			taskUser.setAlteTaskuri(TaskuriExterne.getTaskuriExterne());
		} else if (codUser.equals("111")) {
			TaskPropriu task = new TaskPropriu();
			task.setTipTask(EnumTipTask.RECEPTIE);
			task.setReceptie(getTaskReceptie(codUser, codUtilaj));
			taskUser.setTaskPropriu(task);
		}else if (codUser.equals("222")) {
			TaskPropriu task = new TaskPropriu();
			task.setTipTask(EnumTipTask.PREGATIRE);
			task.setPregatire(getTaskPregatire(codUser, codUtilaj));
			taskUser.setTaskPropriu(task);
		}else if (codUser.equals("333")) {
			TaskPropriu task = new TaskPropriu();
			task.setTipTask(EnumTipTask.INCARCARE_PALET);
			task.setIncarcarePalet(genereazaTaskIncarcarePalet(codUser, codUtilaj));
			taskUser.setTaskPropriu(task);
		}

		return taskUser;

	}

	private Receptie getTaskReceptie(String codUser, String codUtilaj) {
		return new GenereazaReceptie().genereazaReceptie(codUser, codUtilaj);

	}
	
	private Pregatire getTaskPregatire(String codUser, String codUtilaj){
		return new GenereazaPregatire().genereazaPregatire(codUser, codUtilaj);
	}

	private IncarcarePalet genereazaTaskIncarcarePalet(String codUser, String codUtilaj){
		return new GenereazaIncarcare().genereazaIncarcarePalet(codUser, codUtilaj);
	}
	
}
