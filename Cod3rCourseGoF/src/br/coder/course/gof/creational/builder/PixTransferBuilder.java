package br.coder.course.gof.creational.builder;

public class PixTransferBuilder {

	private PixTransfer pixTransfer;
	
	public PixTransferBuilder() {
	   this.pixTransfer = new PixTransfer();	
	}
	
	public PixTransferBuilder payerName(String payerName) {
		this.pixTransfer.setPayerName(payerName);
		return this;
	}
	
	public PixTransferBuilder documentNumber(String documentNumber) {
		this.pixTransfer.setDocumentNumber(documentNumber);
		return this;
	}
	
	public PixTransferBuilder receiverName(String receiverName) {
		this.pixTransfer.setReceiverName(receiverName);
		return this;
	}
	
	public PixTransferBuilder pixKey(String pixKey) {
		this.pixTransfer.setPixKey(pixKey);
		return this;
	}
	
	public PixTransferBuilder bank(String bank) {
		this.pixTransfer.setBank(bank);
		return this;
	}
	
	public PixTransferBuilder bankBranch(String bankBranch) {
		this.pixTransfer.setBankBranch(bankBranch);
		return this;
	}
	
	public PixTransferBuilder bankAccount(String bankAccount) {
		this.pixTransfer.setBankAccount(bankAccount);
		return this;
	}
	
	public PixTransferBuilder bankAccountDigit(String bankAccountDigit) {
		this.pixTransfer.setBankAccountDigit(bankAccountDigit);
		return this;
	}
	
	public PixTransferBuilder principalValue(double principalValue) {
		this.pixTransfer.setPrincipalValue(principalValue);
		return this;
	}
	
	public PixTransfer build() {
		return new PixTransfer(this.pixTransfer);
	}
	
}
