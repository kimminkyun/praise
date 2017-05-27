package com.praise.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.praise.dto.DriveInfoDto;
import com.praise.service.impl.DriveInfoServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DriveInfoController {

    @Autowired(required = false)
    DriveInfoServiceImpl driveInfoService;

    @RequestMapping(value = "/driveInfo", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<DriveInfoDto>> getDriveInfoList(Locale locale, Model model) {
    	
    	
    	ArrayList<DriveInfoDto> list = driveInfoService.selectDriveInfoList();
    	
    	HttpHeaders headers = new HttpHeaders();

    	headers.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<ArrayList<DriveInfoDto>>(list, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/driveInfo/{id}", method = RequestMethod.GET)
    public ResponseEntity<DriveInfoDto> getDriveInfo(@PathVariable int id, Locale locale, Model model) {
    	
    	
    	DriveInfoDto driveInfo = driveInfoService.selectDriveInfo(id);
    	
    	HttpHeaders headers = new HttpHeaders();

    	headers.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<DriveInfoDto>(driveInfo, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/driveInfo", method = RequestMethod.POST)
    public ResponseEntity<String> createDriveInfo(@RequestBody DriveInfoDto driveInfo, Locale locale, Model model) {
    	
    	int result = driveInfoService.createDriveInfo(driveInfo);
    	
    	HttpHeaders headers = new HttpHeaders();

    	headers.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<String>(String.valueOf(result), headers, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/driveInfo", method = RequestMethod.PUT)
    public ResponseEntity<String> updateDriveInfo(@RequestBody DriveInfoDto driveInfo, Locale locale, Model model) {
    	
    	int result = driveInfoService.updateDriveInfo(driveInfo);
    	
    	HttpHeaders headers = new HttpHeaders();

    	headers.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<String>(String.valueOf(result), headers, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/driveInfo/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> deleteDriveInfo(@PathVariable int id, Locale locale, Model model) {
    	
    	int result = driveInfoService.deleteDriveInfo(id);
    	
    	HttpHeaders headers = new HttpHeaders();

    	headers.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<String>(String.valueOf(result), headers, HttpStatus.OK);
    }
}
