package com.qianzhui.jishulink.domain.model.trade.model;

public class PaymentCallback {

	private String txCode;
	private String institutionId;
	private String tradeId;
	private String amount;
	private String status;
	private String bankNotificationTime;

	public PaymentCallback() {
		// TODO Auto-generated constructor stub
	}

	public String getTxCode() {
		return txCode;
	}

	public void setTxCode(String txCode) {
		this.txCode = txCode;
	}

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBankNotificationTime() {
		return bankNotificationTime;
	}

	public void setBankNotificationTime(String bankNotificationTime) {
		this.bankNotificationTime = bankNotificationTime;
	}

	@Override
	public String toString() {
		return "PaymentCallback [txCode=" + txCode + ", institutionId=" + institutionId + ", tradeId=" + tradeId
				+ ", amount=" + amount + ", status=" + status + ", bankNotificationTime=" + bankNotificationTime + "]";
	}

}
