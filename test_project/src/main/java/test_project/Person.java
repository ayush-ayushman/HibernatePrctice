package test_project;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private long pnone;
	private int age;
	@JoinColumn(name="pancard_id")
	@OneToOne(cascade=CascadeType.ALL)
	private PanCard card;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPnone() {
		return pnone;
	}
	public void setPnone(long pnone) {
		this.pnone = pnone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PanCard getCard() {
		return card;
	}
	public void setCard(PanCard card) {
		this.card = card;
	}
	
	
	

}
