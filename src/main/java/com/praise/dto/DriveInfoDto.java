package com.praise.dto;

/*
 * DriveInfoDto
 */
public class DriveInfoDto {

	private int id;
	private int point;
	private String startDate;
	private String endDate;
	private String driveDistance;
	private String maxSpeed;
	private String startLat;
	private String startLon;
	private String endLat;
	private String endLon;
	private int memberId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDriveDistance() {
		return driveDistance;
	}
	public void setDriveDistance(String driveDistance) {
		this.driveDistance = driveDistance;
	}
	public String getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getStartLat() {
		return startLat;
	}
	public void setStartLat(String startLat) {
		this.startLat = startLat;
	}
	public String getStartLon() {
		return startLon;
	}
	public void setStartLon(String startLon) {
		this.startLon = startLon;
	}
	public String getEndLat() {
		return endLat;
	}
	public void setEndLat(String endLat) {
		this.endLat = endLat;
	}
	public String getEndLon() {
		return endLon;
	}
	public void setEndLon(String endLon) {
		this.endLon = endLon;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

}
