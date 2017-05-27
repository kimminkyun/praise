package com.praise.mapper;

import java.util.ArrayList;

import com.praise.dto.DriveInfoDto;

public interface DriveInfoMapper {

	public ArrayList<DriveInfoDto> selectDriveInfoList();

	public DriveInfoDto selectDriveInfo(int id);

	public int createDriveInfo(DriveInfoDto driveInfo);
	
	public int updateDriveInfo(DriveInfoDto driveInfo);
	
	public int deleteDriveInfo(int id);
}
