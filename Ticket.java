public class Ticket {
	
	private Integer cost;
	private boolean isVIP;
	

	public Ticket() {}
	public Ticket(Integer cost, boolean isVIP) {
		this.cost = cost;
		this.isVIP = isVIP;
	}
	
	
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
	public boolean getIsVIP() {
		return isVIP;
	}
	public void setIsVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}

}