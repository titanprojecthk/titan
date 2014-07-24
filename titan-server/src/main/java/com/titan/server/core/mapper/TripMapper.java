package com.titan.server.core.mapper;

import java.util.ArrayList;
import java.util.List;

import com.titan.server.core.domain.Trip;
import com.titan.server.web.model.TripVo;

public class TripMapper extends BaseMapper {
	
	public static TripVo map(Trip trip) {
		TripVo tripVo = new TripVo();
		BaseMapper.map(trip, tripVo);
		return tripVo;
	}
	
	public static List<TripVo> map(List<Trip> trips) {
		List<TripVo> tripVos = new ArrayList<TripVo>();
		
		for (Trip trip : trips) {
			tripVos.add(TripMapper.map(trip));
		}
		
		return tripVos;
	}

}
