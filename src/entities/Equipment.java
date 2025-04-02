package entities;

import java.util.Objects;

public class Equipment {

	private Integer id;
	private String type;
	private String date_exit;
	private String destination;
	private String model;
	private String status;
	
	public Equipment() {
		// TODO Auto-generated constructor stub
	}
	
	public Equipment(Integer id, String type, String date_exit, String destination, String model, String status) {
		this.id = id;
		this.type = type;
		this.date_exit = date_exit;
		this.destination = destination;
		this.model = model;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDate_exit() {
		return date_exit;
	}


	public void setDate_exit(String date_exit) {
		this.date_exit = date_exit;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Equipment [id=" + id + ", type=" + type + ", date_exit=" + date_exit + ", destination=" + destination
				+ ", model=" + model + ", status=" + status + "]";
	}
	
	
	
}
