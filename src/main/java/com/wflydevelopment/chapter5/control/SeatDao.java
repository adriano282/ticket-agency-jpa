package com.wflydevelopment.chapter5.control;

import javax.ejb.Stateless;

import com.wflydevelopment.chapter5.entity.Seat;

@Stateless
public class SeatDao extends AbstractDao<Seat> {
	private static final long serialVersionUID = 1L;

	public SeatDao() {
		super(Seat.class);
	}
}
