package com.action.Controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.action.Bean.EmpRegBean;
import com.action.DAO.EmployeeDao;

public class EmpRegController extends DispatchAction{
	
	@Override
		public ActionForward execute(ActionMapping arg0, ActionForm arg1, ServletRequest arg2, ServletResponse arg3)
				throws Exception {
			// TODO Auto-generated method stub
			return super.execute(arg0, arg1, arg2, arg3);
		}
	
//add
	public ActionForward Add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//type-1  - Read through request parameters
//		int id = Integer.parseInt(request.getParameter("id"));
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		float salary = Float.parseFloat( request.getParameter("salary"));
//		long phone = Long.parseLong(request.getParameter("phone"));
		
		//type-1 - Read data from FormBeam
		//1.type our form into our Empregistrationform bean
		EmpRegBean erform = (EmpRegBean) form;
		int id =erform.getId();
		String name = erform.getName();
		String email = erform.getEmail();
		float salary = erform.getSalary();
		long phone = erform.getPhone();
		
		EmployeeDao emp = new EmployeeDao();
		
		int i = emp.save(id, name, email, salary, phone);
		
		if(i!=0) {
			return mapping.findForward("success");
		}else {
			return mapping.findForward("failure");
		}
		
		
	}
	
	//update

	//Update method
	public ActionForward Update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//type-1  - Read through request parameters
//		int id = Integer.parseInt(request.getParameter("id"));
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		float salary = Float.parseFloat( request.getParameter("salary"));
//		long phone = Long.parseLong(request.getParameter("phone"));
		
		//type-1 - Read data from FormBeam
		//1.type our form into our Empregistrationform bean
		EmpRegBean erform = (EmpRegBean) form;
		int id =erform.getId();
		String name = erform.getName();
		String email = erform.getEmail();
		float salary = erform.getSalary();
		long phone = erform.getPhone();
		
		EmployeeDao emp = new EmployeeDao();
		
		int i = emp.update(id, name, email, salary, phone);
		
		if(i!=0) {
			return mapping.findForward("success");
		}else {
			return mapping.findForward("failure");
		}
		
		
	}
	
}
