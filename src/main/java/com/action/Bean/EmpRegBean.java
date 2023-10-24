package com.action.Bean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class EmpRegBean extends ActionForm {

	private int id;
	private String name;
	private String email;
	private float salary;
	private long phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	//validate;
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	
		ActionErrors  ae = new ActionErrors();
		
		if(id<99 && id>1000 ) {
			ae.add("name_e",new ActionMessage("idmsg"));
		}
		if(name.equals("")) {
			ae.add("name_e",new ActionMessage("namemsg"));
		}
		if(email.equals("")) {
			ae.add("email_e",new ActionMessage("emailmsg"));
		}
		
		return ae;
	}
	
}
