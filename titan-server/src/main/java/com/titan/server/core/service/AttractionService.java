package com.titan.server.core.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.titan.server.common.util.AttractionType;
import com.titan.server.common.util.Status;
import com.titan.server.core.domain.Attraction;
import com.titan.server.core.domain.District;
import com.titan.server.core.domain.User;
import com.titan.server.core.repository.AttractionRepository;

@Component
public class AttractionService extends BaseService {

	@Autowired
	private AttractionRepository attractionRepository;

	public Attraction find(Integer id) {
		return attractionRepository.findOne(id);
	}
	
	public Page<Attraction> findAll(int pageNo, int pageSize) {
		PageRequest pageRequest = new PageRequest(pageNo, pageSize);
		Page<Attraction> attractionPage = attractionRepository.findAll(pageRequest);
		return attractionPage;
	}
	
	public Attraction save(Attraction attraction, User user) {
		Timestamp now = getCurrentTime();
		
		District district = getPositionDistrict(attraction.getLng(), attraction.getLng());
		
		attraction.setCreateBy(user.getId());
		attraction.setCreateTime(now);
		attraction.setUpdateBy(user.getId());
		attraction.setUpdateTime(now);
		attraction.setStatus(Status.ACTIVE);
		attraction.setType(AttractionType.CUSTOM);
		attraction.setDistrict(district);
		
		return attractionRepository.save(attraction);
	}
}
