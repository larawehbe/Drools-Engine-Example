package model;

public class Credit extends Card  {
private float minQty; // min quantity accepted
private float maxQty;
private float monthlyFees;
public float getMonthlyFees() {
	return monthlyFees;
}
public void setMonthlyFees(float monthlyFees) {
	this.monthlyFees = monthlyFees;
}
public Credit() {}
public Credit newCredit (User u) {
	Credit c = new Credit();
	c.setUser(u);
	return c;
}
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
}
