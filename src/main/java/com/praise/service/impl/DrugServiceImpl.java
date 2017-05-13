package com.praise.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praise.dto.DrugDto;
import com.praise.mapper.DrugMapper;

@Service("drugService")
public class DrugServiceImpl  {

	@Autowired(required = false)
	DrugMapper drugMapper;

	public ArrayList<DrugDto> selectDrug() {

		//ArrayList<DrugDto> drugResult = drugMapper.selectDrugInfo();
		
		return null;

	}

}
