package com.policybazar.test;

import com.bajajalianz.insurance.services.Insurance;
import com.bajajalianz.insurance.services.InsuranceImplService;
import com.bajajalianz.insurance.types.Member;
import com.bajajalianz.insurance.types.Plan;
import com.bajajalianz.insurance.types.Policy;

public class PolicyBazarTest {

	public static void main(String[] args) {
		Policy policy=null;
		InsuranceImplService service=new InsuranceImplService();
		Insurance insurance=service.getInsuranceImplPort();
		
		Plan plan=new Plan();
		plan.setPlanNo(1202);
		plan.setPlanName("JiwanAnand");
		plan.setTenure(5);
		plan.setInsuredAmount(56000);
		
		Member member=new Member();
		member.setFullName("Hariom");
		member.setGender("Male");
		member.setAge(26);
		member.setEmailAddress("Null@gmail.com");
		
		policy=insurance.enroll(plan, member);
		System.out.println(policy);
	}

}
