package Aula4E3;

public class Request {
	private String date;
	private String status;
	private String paymentType;
	private boolean isDelivery;
	private String customerName;
	
	public Request(String date, String status, String paymentType, boolean isDelivery, String customerName) {
		this.date = date;
		this.status = status;
		this.paymentType = paymentType;
		this.isDelivery = isDelivery;
		this.customerName = customerName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public boolean isDelivery() {
		return isDelivery;
	}

	public void setDelivery(boolean isDelivery) {
		this.isDelivery = isDelivery;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
