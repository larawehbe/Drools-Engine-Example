package model;

public class Prepaid extends Card {
	private float minQty; // min quantity accepted
	private float maxQty;// max quantity accepted
	public float getMinQty() {
		return minQty;
	}
	public void setMinQty(float minQty) {
		this.minQty = minQty;
	}
	public float getMaxQty() {
		return maxQty;
	}
	public void setMaxQty(float maxQty) {
		this.maxQty = maxQty;
	}
	
	public Prepaid() {};
	
	public Prepaid newPrepaid (User user)
	{
		Prepaid p = new Prepaid();
		p.setUser(user);
	
		return p;
	}

}
