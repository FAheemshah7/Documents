package flightreservation.documents.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Documents {
	
	@Id
	private int id;
	private String name;
	@Lob
	private byte[] data;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public byte[] getData() {
		return data;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
