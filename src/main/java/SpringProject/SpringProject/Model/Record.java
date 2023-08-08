package SpringProject.SpringProject.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "record")
public class Record {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int record_id;
private String status;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "data_id",nullable = false)
private Data data;
public Record() {
	super();
	// TODO Auto-generated constructor stub
}
public Record(int record_id, String status, Data data) {
	super();
	this.record_id = record_id;
	this.status = status;
	this.data = data;
}
public Record(int i, String status2, int getdata_Id, String name, String email) {
	// TODO Auto-generated constructor stub
}
public int getRecord_id() {
	return record_id;
}
public void setRecord_id(int record_id) {
	this.record_id = record_id;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Data getData() {
	return data;
}
public void setData(Data data) {
	this.data = data;
}
}
