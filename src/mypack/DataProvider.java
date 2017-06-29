package mypack;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo="user_info")
@XmlRootElement(name="dataprovider")
@XmlType(propOrder={"user_id","user_name","user_address"})
public class DataProvider {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
 private int user_id;

@Column(name="name")
 private String user_name;

@Column(name="address")
 private String user_address;

@XmlElement
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
@XmlElement
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
@XmlElement
public String getUser_address() {
	return user_address;
}
public void setUser_address(String user_address) {
	this.user_address = user_address;
}
}
