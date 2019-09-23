package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.transaction.TransactionScoped;


@Entity(name="employee_tbt")
public class DigibankEntity {
	
	@TransactionScoped @GeneratedValue long TransactionCode;
	@GeneratedValue(strategy=GenerationType.AUTO)
		
	private String name;
	private String SourcePassport;
	private String DestinationBank;
	private String DestationCountry;
	private String AccountNumber;
	private Double Amount;
	//private Long TransactionCode;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String sourcepassport) {
		this.SourcePassport = sourcepassport;
	}
	public String DestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.DestinationBank = destinationBank;
	}
	
	public String getDestationCountry() {
		return DestationCountry;
	}
	public void setDestationCountry(String destationcountry) {
		this.SourcePassport = destationcountry;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountnumber) {
		this.AccountNumber = accountnumber;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		this.Amount = amount;
	}
	
	public Long TransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(Long transactionCode) {
		this.TransactionCode = transactionCode;
	}
	

}
