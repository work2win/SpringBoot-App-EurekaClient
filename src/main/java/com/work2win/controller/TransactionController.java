package com.work2win.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work2win.model.Transaction;
import com.work2win.repository.TransactionRepository;


@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@GetMapping("/all")
	public List<Transaction> getTransaction(){
		return transactionRepository.findAll();
	}
	
	@GetMapping("/id")
	public String getTransactionbyId(){
		return transactionRepository.findById(1).toString();
	}

}
