package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC010 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC010() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 002" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC010");
				clickYesApplicant1("TC010");
				setemployment_statusApplicant1("TC010");
				setPensionAnnuity_1("TC010");
				clickDetailedOption_exp();
				setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC010");
				ClickDetailedOption_hh();
				setproperty_expenditure("TC010");
				clickDetailedOption_oth();
				setSchoolFees("TC010");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC008");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
