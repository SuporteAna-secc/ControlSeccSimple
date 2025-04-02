package application;

import entities.Equipment;
import modal.db.DaoFatory;
import modal.db.EquipmentDao;

public class Main {

	public static void main(String[] args) {


		EquipmentDao equipmentDao = DaoFatory.createEquipmentDao();
		
		Equipment newEquipment =  new Equipment(null, 986547, "Monitor", "25/03/2025", "P30", "i8", "Nova");
		equipmentDao.insert(newEquipment);
		System.out.println("Inserido! Novo id = " + newEquipment.getId());
		

	}

}
