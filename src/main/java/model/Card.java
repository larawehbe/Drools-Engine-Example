package model;


public abstract class Card {
private int id;
private String cvv2; // validation code 3-4 digits
private User user;
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCvv2() {
	return cvv2;
}
public void setCvv2(String cvv2) {
	this.cvv2 = cvv2;
}


}
