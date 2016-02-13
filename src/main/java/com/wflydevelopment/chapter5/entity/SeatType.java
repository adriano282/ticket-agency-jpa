package com.wflydevelopment.chapter5.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="seat_type")
public class SeatType implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//bi-directional many-to-many association to Seat
	@OneToMany(mappedBy="seatType", fetch=FetchType.EAGER)
	private List<Seat> seats;
	
	@NotNull
	@Size(min = 1, max = 25, message = "You need to enter a Seat")
	@Pattern(regexp = "[A-Za-z ]*", message = "Description must contain only letters and spaces")
	private String description;
	
	@NotNull
	private int price;
	
	@NotNull
	private int quantity;
	
	private SeatPosition position;
	
	public SeatPosition getPosition() {
		return position;
	}
	
	public void setPosition(SeatPosition position) {
		this.position = position;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
}
