package com.mastek.eshop.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "orders")
public class Orders {
	@Id
	private int orderid;
	private LocalDate orderdate;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
			name="ordereditems",
			joinColumns = @JoinColumn(name="orderid"),
			inverseJoinColumns = @JoinColumn(name="itemId")
		)
	
	private List<OrderItem> items;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderid, LocalDate orderdate, List<OrderItem> items) {
		super();
		this.orderid = orderid;
		this.orderdate = orderdate;
		this.items = items;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		if (orderid != other.orderid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", orderdate=" + orderdate + ", items=" + items + "]";
	}

}
