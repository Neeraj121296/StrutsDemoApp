package com.joshi.Actions;

public class WelcomeAction {
private String message;
public String userid;
public String pass;
public String checkLogin(){
	if(userid.equals(pass)){
		message="welcome"+userid;
		return "success";
		
	}
	else{
		message="invalid userid or password";
		return "error";
	}
	
	
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String sayWelcome(){
	message="welcome user";
	return "success";
	
}
	public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
