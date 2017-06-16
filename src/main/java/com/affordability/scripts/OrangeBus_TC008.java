package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC008 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC008() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 002" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC008");
				clickNumOfApplicantsInput_1();
				clickYesApplicant1("TC008");
				setemployment_statusApplicant1("TC008");
				setGrossSalaryApplicant1("TC008");
				setGuaranteedBonusofApplicant1("TC008");
				clickDetailedOption_exp();
				setSecureMonthlyPaymentonCompletion("TC008");
				setCSAMaintenance("TC008");
				ClickDetailedOption_hh();
				setcouncil_tax("TC008");
				setBuildingsInsurance("TC008");
				clickDetailedOption_oth();
				setChildCare("tc008");
				setEssentialTravel("TC008");
				setMobilePhoneBroadband("tc008");
				setOtherOutgoings("TC008");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC008");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
