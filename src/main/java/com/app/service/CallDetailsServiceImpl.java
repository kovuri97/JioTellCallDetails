package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.CallDetails;
import com.app.repo.CallDetailsRepository;

@Service
public class CallDetailsServiceImpl implements  CallDetailsService {
	@Autowired
	private CallDetailsRepository callDetailsRepo;
	@Override
	public List<CallDetails> getCallInfo() {
		// TODO Auto-generated method stub
		return callDetailsRepo.findAll();
	}

}
