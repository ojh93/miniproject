package test01;

public class CustomerAddr extends Addr {
	private String clientName;
	private String transacItem;
	private String clientPosition;
	
	public CustomerAddr(String name, String phone, String email, String address, String group, String clientName, String transacItem, String clientPosition) {
		super(name, phone, email, address, group);
		this.clientName = clientName;
		this.transacItem = transacItem;
		this. clientPosition =  clientPosition;
	}
	
	public String getClientName(){
		return clientName;
		}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getTransacItem(){
		return transacItem;
		}
	public void setTransacItem(String transacItem) {
		this.transacItem = transacItem;
	}

	public String getClientPosition(){
		return clientPosition;
		}
	public void setClientPosition(String clientPosition) {
		this.clientPosition = clientPosition;
	}
	@Override
	public void printinfo() {
	    super.printinfo();  
	    System.out.println("거래처: " + clientName);
	    System.out.println("거래 품목: " + transacItem);
	    System.out.println("직급: " + clientPosition);
	}



}
