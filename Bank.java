package mypackage;

public class Bank {//class1
private long account_num;//instance variable
private String name,e_mail;
private float amount;
public long getAccount_num() {//getter means only read the data
	return account_num;
}
public void setAccount_num(long account_num) {
	this.account_num = account_num;
}
public String getName() {
	return name;
}
public void setName(String name) {//setter for set the value
	this.name = name;
}
public String getE_mail() {
	return e_mail;
}
public void setE_mail(String e_mail) {
	this.e_mail = e_mail;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}
