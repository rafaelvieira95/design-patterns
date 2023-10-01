package br.coder.course.gof.creational.builder;

public class PixTransfer {

	protected PixTransfer() {}
	
	protected PixTransfer(PixTransfer pixTransfer) {
		this.payerName = pixTransfer.payerName;
		this.documentNumber = pixTransfer.documentNumber;
		this.ReceiverName = pixTransfer.ReceiverName;
		this.pixKey = pixTransfer.pixKey;
		this.bank = pixTransfer.bank;
		this.bankBranch = pixTransfer.bankBranch;
		this.bankAccount = pixTransfer.bankAccount;
		this.bankAccountDigit = pixTransfer.bankAccountDigit;
		this.principalValue = pixTransfer.principalValue;
	}
	
	private String payerName;
	private String documentNumber;
	private String ReceiverName;
	private String pixKey;
	private String bank;
	private String bankBranch;
	private String bankAccount;
	private String bankAccountDigit;
	private double principalValue;
	
	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getReceiverName() {
		return ReceiverName;
	}

	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}

	public String getPixKey() {
		return pixKey;
	}

	public void setPixKey(String pixKey) {
		this.pixKey = pixKey;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankAccountDigit() {
		return bankAccountDigit;
	}

	public void setBankAccountDigit(String bankAccountDigit) {
		this.bankAccountDigit = bankAccountDigit;
	}

	public double getPrincipalValue() {
		return principalValue;
	}

	public void setPrincipalValue(double principalValue) {
		this.principalValue = principalValue;
	}
	
}
