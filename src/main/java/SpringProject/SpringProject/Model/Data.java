package SpringProject.SpringProject.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "data")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int data_id;
private String name;
private String email;
@OneToMany(mappedBy = "data",cascade = CascadeType.ALL)
@JsonIgnoreProperties("data")
private Set<Record>record;
public Data() {
	super();
	// TODO Auto-generated constructor stub
}

public Data(int id, String name, String email, Set<Record> record) {
	super();
	this.data_id = id;
	this.name = name;
	this.email = email;
	this.record = record;
}
public int getdata_id() {
	return data_id;
}
public void setdata_id(int data_id) {
	this.data_id = data_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Set<Record> getRecord() {
	return record;
}
public void setRecord(Set<Record> record) {
	this.record = record;
}
}
