package create_account;

public class Dto {
private int seq;
private String id;
private String password;
private int age;
private int registNum;
private String email;
private int phoneNum;
private String interest;
private String sns;

public int getSeq() {
	return seq;
}
public void setSeq(int seq) {
	this.seq = seq;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getRegistNum() {
	return registNum;
}
public void setRegistNum(int registNum) {
	this.registNum = registNum;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(int phoneNum) {
	this.phoneNum = phoneNum;
}
public String getInterest() {
	return interest;
}
public void setInterest(String interest) {
	this.interest = interest;
}
public String getSns() {
	return sns;
}
public void setSns(String sns) {
	this.sns = sns;
}

@Override
public String toString() {
	return "Dto[seq" + seq + ", id=" + id + ", password=" + password +
			", age=" + age + ", registNum" + registNum
			+ ", email=" + email + ", phoneNum=" + phoneNum + ", interest=" + interest +
			", sns=" + sns + "]";
	}
}
