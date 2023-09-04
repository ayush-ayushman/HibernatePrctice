package sfoodorder;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String item;
	private double cost;
	@CreationTimestamp
	private LocalDate orderTime;
	@UpdateTimestamp
	private LocalDate deltime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDate getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(LocalDate orderTime) {
		this.orderTime = orderTime;
	}
	public LocalDate getDeltime() {
		return deltime;
	}
	public void setDeltime(LocalDate deltime) {
		this.deltime = deltime;
	}
	
	
	
	

}
