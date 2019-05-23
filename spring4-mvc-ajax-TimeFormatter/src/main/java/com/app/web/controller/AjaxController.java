package com.app.web.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.web.jsonview.Views;
import com.app.web.model.AjaxResponseBody;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class AjaxController {
	AjaxResponseBody result;
	Date date = new Date();
	SimpleDateFormat simpleDateFormat;
	SimpleDateFormat utcsimpleDateFormat;

	@JsonView(Views.Public.class)
	@RequestMapping(value = "/search/api/getAggdate")
	public AjaxResponseBody getAggDateViaAjax() {

		result = new AjaxResponseBody();
		long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		//System.out.println("Current Time Stamp: " + ts.toString());
		AjaxResponseBody utc=getUTCDateViaAjax();
		AjaxResponseBody iso=getISODateViaAjax();
		
		result.setCode("400");
		result.setMsg("Aggregator Response");
		result.setResult(" The Current Date is: " +ts.toString() + utc.getResult() +iso.getResult());
		return result;
	}

	@JsonView(Views.Public.class)
	@RequestMapping(value = "/search/api/getUTCDate")
	public AjaxResponseBody getUTCDateViaAjax() {
		result = new AjaxResponseBody();

		String utcDatePattern = "dd-MM-yyyy HH:mm:ss z'('Z')'";
		utcsimpleDateFormat = new SimpleDateFormat(utcDatePattern);
		utcsimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		String dateFormateInUTC = utcsimpleDateFormat.format(date);

		// System.out.println(" The Date in the UTC format: " + dateFormateInUTC);
		result.setCode("400");
		result.setMsg("UTC Format Response");
		result.setResult(" The Date in the UTC format: " + dateFormateInUTC);
		return result;
	}

	@JsonView(Views.Public.class)
	@RequestMapping(value = "/search/api/getISOdate")
	public AjaxResponseBody getISODateViaAjax() {
		result = new AjaxResponseBody();

		String isoDatePattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";
		simpleDateFormat = new SimpleDateFormat(isoDatePattern);
		String formattedDate = simpleDateFormat.format(date);
		//System.out.println(" The Date in the ISO format: " + formattedDate);
		result.setCode("400");
		result.setMsg("ISO Format Response");
		result.setResult(" The Date in the ISO format: " + formattedDate);
		return result;
	}

}
