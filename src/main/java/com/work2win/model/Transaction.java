package com.work2win.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {
	
	@Id
	@GeneratedValue
	private int id;
	private int accountnum;	
	private int amount;
	private Date transdate;
	private String notes;
	
	private Transaction() {}
	
	

	public Transaction(int id, int accountnum, int amount, Date transdate, String notes) {
		super();
		this.id = id;
		this.accountnum = accountnum;
		this.amount = amount;
		this.transdate = transdate;
		this.notes = notes;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getTransdate() {
		return transdate;
	}

	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}



	@Override
	public String toString() {
		return "Transaction [id=" + id + ", accountnum=" + accountnum + ", amount=" + amount + ", transdate="
				+ transdate + ", notes=" + notes + "]";
	}
	
		

}
