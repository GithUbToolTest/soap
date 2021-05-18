package in.airtel.recharge.services;

import java.util.UUID;

import javax.jws.WebService;

import in.airtel.recharge.types.Error;
import in.airtel.recharge.types.Receipt;
import in.airtel.recharge.types.RechargeInfo;

@WebService(endpointInterface = "in.airtel.recharge.services.AirtelRechargeService")
public class AirtelRechargeServiceImpl {

	public Receipt recharge(RechargeInfo in) throws InvailidMobileNumberFaultException, PlanNotFoundFaultException {
		Error error = null;
		Receipt receipt = null;
		
		if (in.getMobileNo() == null || in.getMobileNo().length() < 10 || in.getMobileNo().length() >= 13) {
			error = new Error();
			error.setErrorCode("ERROR : E2685");
			error.setReason("Mobile number is not valid please provide valid Mobile Number");
			throw new InvailidMobileNumberFaultException("Invalid Mobile Number", error);
		}
		if (in.getPlanAmount() == null || in.getPlanAmount().length() < 2) {
			error = new Error();
			error.setErrorCode("ERROR : E8956");
			error.setReason("Please select valid plan.. plan should not be empty");
			throw new PlanNotFoundFaultException("provide valid plan", error);
		}
		receipt = new Receipt();
		receipt.setReferenceNo(UUID.randomUUID().toString());
		receipt.setStatus("Success");

		return receipt;
	}
}
