package com.bajajalianz.insurance.services;

import javax.jws.WebService;

import com.bajajalianz.insurance.types.Member;
import com.bajajalianz.insurance.types.Plan;
import com.bajajalianz.insurance.types.Policy;

@WebService(endpointInterface = "com.bajajalianz.insurance.services.Insurance")
public class InsuranceImpl{

	
	public Policy enroll(Plan plan, Member member) {
		Policy policy=new Policy();
		
		policy.setPolicyNo(plan.getPlanNo());
		policy.setPolicyName(plan.getPlanName());
		policy.setTenure(plan.getTenure());
		policy.setInsuredAmount(plan.getInsuredAmount());
		policy.setInsuredPolicyMember(member.getFullName());
		
		return policy;
	}

}
