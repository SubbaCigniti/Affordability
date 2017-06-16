package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC007 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC007() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 002" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC007");
				clickNumOfApplicantsInput_2();
				clickYesApplicant1("TC007");
				setemployment_statusApplicant1("TC007");
				setGrossSalaryApplicant1("TC007");
				setemployment_statusApplicant2("TC007");
				setGrossSalaryApplicant2("TC007");
				clickDetailedOption_exp();
				setGuaranteedBonusofApplicant1("TC007");
				setRegularBonusofApplicant1("TC007");
				ClickDetailedOption_hh();
				setcouncil_tax("TC007");
				setUtilities("TC007");
				clickDetailedOption_oth();
				setSchoolFees("TC007");
				setHouseKeeping("TC007");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC007");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
