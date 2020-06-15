package model;

public class User {
	private int id;
	private String name;
	private int age;
	private boolean type ; // 0 for prepaid card , 1 for credit card
	private float balance;
	
	public User(int id, String name, int age, boolean type, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = type;
		this.balance = balance;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public User() {}
	public User(int id, String name, int age, boolean type) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	

}
