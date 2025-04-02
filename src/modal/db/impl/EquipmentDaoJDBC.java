package modal.db.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import entities.Equipment;
import modal.db.EquipmentDao;

public class EquipmentDaoJDBC implements EquipmentDao {
	
	private Connection conn;

	public EquipmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Equipment obj) {
		PreparedStatement st = null;
		try {
			
			st = conn.prepareStatement("insert into equipamento (tipo, cod_serial, modelo, data_saida, destino, status) values (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			st.setString(1, obj.getType());
			st.setInt(2, obj.getCod_serial());
			st.setString(3, obj.getModel());
			st.setString(4, obj.getDate_exit());
			st.setString(5, obj.getDestination());
			st.setString(6, obj.getStatus());
			
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Unexpected error! No rows affected!");
			}
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void update(Equipment obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Equipment findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Equipment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
