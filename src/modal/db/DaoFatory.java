package modal.db;

import db.DB;
import modal.db.impl.EquipmentDaoJDBC;



public class DaoFatory {

	public static EquipmentDao createEquipmentDao() {
		return new EquipmentDaoJDBC(DB.getConnection());
	}
}
