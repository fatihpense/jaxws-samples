package de.uniba.dsg.jaxws;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Cancellor")
@XmlType(propOrder = { "name", "party", "from", "to" }, namespace="http://uniba.de/dsg/jaxws/")
public class Cancellor {
	private String name;
	private String party;
	private Date from;
	private Date to;
	
	public Cancellor() {}
	
	public Cancellor(String name, String party, Date from, Date to) {
		this.name = name;
		this.party = party;
		this.from = from;
		this.to = to;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getParty() {
		return this.party;
	}
	
	public Date getFrom() {
		return this.from;
	}
	
	public Date getTo() {
		return this.to;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setParty(String party) {
		this.party = party;
	}
	
	public void setFrom(Date from) {
		this.from = from;
	}
	
	public void setTo(Date to) {
		this.to = to;
	}
}