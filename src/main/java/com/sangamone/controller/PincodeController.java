package com.sangamone.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sangamone.dao.PincodeDao;
import com.sangamone.entity.Pincode;
@Controller
public class PincodeController {
	@Autowired
	PincodeDao pincodedao;
	@RequestMapping("/")
	public String Home() {
		return "index.jsp";
}
	@RequestMapping(value = "/test")
	@ResponseBody
	public List<Pincode> getdata(@RequestParam String pincode) {
		List<Pincode> list = null;
		list = pincodedao.get(pincode);
		return list;
	}
	
	@RequestMapping(value = "/setPincode")
	public String setData(Pincode pincode) {
		pincodedao.save(pincode);
		return "sucess.jsp";
	}
	@RequestMapping("/adminlogin")

	public String Adminlogin(@RequestParam String username, @RequestParam String password ) {
	//String name=req.getParameter("username");  
 	      // String pass=req.getParameter("password");
 		
		if(username.equals("ritesh") && password.equals("riteshkr"))
        {
            System.out.println("Authentication Successful");
        }
        else
        {
            System.out.println("Authentication Failed");
        }
		return "setpincode.jsp";
		}

		
	
}