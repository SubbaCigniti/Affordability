package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC004 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC004() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 002" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC004");
				clickNumOfApplicantsInput_2();
				clickYesApplicant1("TC004");
				setemployment_statusApplicant1("TC004");
				setGrossSalaryApplicant1("TC004");
				setemployment_statusApplicant2("TC004");
				setGrossSalaryApplicant2("TC004");
		        clickDetailedOption_exp();
				setcomittedExp_CC_Monthlypayment("TC004");
				ClickDetailedOption_hh();
				setGroundRentOrService("TC004");
				setUtilities("TC004");
				clickDetailedOption_oth();
				setChildCare("tc004");
				setHouseKeeping("TC004");
				setMobilePhoneBroadband("tc004");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC004");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
