package com.wflydevelopment.chapter5.control;

import javax.ejb.Stateless;

import com.wflydevelopment.chapter5.entity.SeatType;

@Stateless
public class SeatTypeDao extends AbstractDao<SeatType> { 
	private static final long serialVersionUID = 1L;

	public SeatTypeDao() {
		super(SeatType.class);
	}
}
