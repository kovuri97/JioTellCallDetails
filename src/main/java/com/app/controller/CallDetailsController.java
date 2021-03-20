package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.CallDetails;
import com.app.service.CallDetailsService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/CallDetails")
public class CallDetailsController {
	private static final String List = null;
	@Autowired
	private CallDetailsService callDetailsService;

	@GetMapping("/info/{name}")
	public ResponseEntity<?> getCallDetails(@PathVariable String name){
		List<CallDetails> callDetailsList = callDetailsService.getCallInfo();
		List<CallDetails> callDetailsOfoneCustomer = new ArrayList<>();
		for(CallDetails value: callDetailsList) {
			if(value.getCallBy().equalsIgnoreCase(name)||value.getCallTo().equalsIgnoreCase(name)){
				callDetailsOfoneCustomer.add(value);
			}
		}
		if(callDetailsOfoneCustomer.size()==0) {
			return ResponseEntity.ok().body("No call details for the selected user");
		}
		else {
			return ResponseEntity.ok().body(callDetailsOfoneCustomer);
		}
	}
}
