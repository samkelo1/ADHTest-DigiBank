package model;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "employee")
@SessionScoped
public class Digibank {
	
    private Long TransactionCode;
	private String name;
	private String SourcePassport;
	private String DestinationBank;
	private String DestationCountry;
	private String AccountNumber;
	private Double Amount;
	
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
	
	public DigibankEntity getEntity()
	{
		DigibankEntity employeeentity = new DigibankEntity();
		employeeentity.setName(name);
		employeeentity.setSourcePassport(SourcePassport);
		employeeentity.setDestinationBank(DestinationBank);
		employeeentity.setAccountNumber(AccountNumber);
		employeeentity.setAmount(Amount);
		employeeentity.setTransactionCode(TransactionCode);
		return employeeentity;
	}
}
