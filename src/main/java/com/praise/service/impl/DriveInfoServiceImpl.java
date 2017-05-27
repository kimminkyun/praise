package com.praise.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praise.dto.DriveInfoDto;
import com.praise.mapper.DriveInfoMapper;

@Service("driveInfoService")
public class DriveInfoServiceImpl  {

	@Autowired(required = false)
	DriveInfoMapper driveInfoMapper;
	
	public ArrayList<DriveInfoDto> selectDriveInfoList() {
		
		return driveInfoMapper.selectDriveInfoList();
	}

	public DriveInfoDto selectDriveInfo(int id) {
		return driveInfoMapper.selectDriveInfo(id);
	}
	
	public int createDriveInfo(DriveInfoDto driveInfo) {
		return driveInfoMapper.createDriveInfo(driveInfo);
	}

	public int updateDriveInfo(DriveInfoDto driveInfo) {
		return driveInfoMapper.updateDriveInfo(driveInfo);
	}
	
	public int deleteDriveInfo(int id) {
		return driveInfoMapper.deleteDriveInfo(id);
	}
}
