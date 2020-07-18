package com.xworkz.calamities.service;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.calamities.dao.CalamitiesDAO;
import com.xworkz.calamities.dto.CalamitiesDTO;
import com.xworkz.calamities.entity.CalamitiesEntity;

@Component
public class CalamitiesServiceImpl implements CalamitiesService {

	@Autowired
	private CalamitiesDAO dao;

	public CalamitiesServiceImpl() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	public int createAndValidate(CalamitiesDTO dto) {
		System.out.println("invoked createAndValidate method in CalamitiesServiceImpl " + dto);
		/* for valid=0 & for invalid=1 */
		int valid = 1;
		try {
			if (Objects.nonNull(dto)) {
				System.out.println("CalamitiesDTO not null can save");
				if (dto.getPlace() != null) {
					System.out.println("CalamitiesDTO place not null can save");
					valid = 0;

				} else {
					System.out.println("CalamitiesDTO place is null can't save");
					valid = 1;
				}
				if (valid == 0 && dto.getDate() != null) {
					System.out.println("CalamitiesDTO date not null can save");
					valid = 0;

				} else {
					System.out.println("CalamitiesDTO date is null can't save");
					valid = 1;
				}
				if (valid == 0 && dto.getCalamityType() != null) {
					System.out.println("CalamitiesDTO CalamityType not null can save");
					valid = 0;

				} else {
					System.out.println("CalamitiesDTO CalamityType is null can't save");
					valid = 1;
				}
				if (valid == 0) {
					System.out.println("CalamitiesDTO is valid can save it..");
					System.out.println("creating CalamitiesEntity object");
					CalamitiesEntity entity = new CalamitiesEntity();
					System.out.println("copying data from CalamitiesDTO to CalamitiesEntity");
					BeanUtils.copyProperties(dto, entity);
					dao.create(entity);
					valid = 0;

				} else {
					System.out.println("CalamitiesDTO not valid can't save it..");
					valid = 1;
				}

			} else {
				System.out.println("CalamitiesDTO is null can't save");

			}
		} catch (Exception e) {
			System.err.println("Exception in createAndValidate in CalamitiesServiceImpl" + e.getMessage());
		}
		return 0;
	}

}
