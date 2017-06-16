package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC005 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC005() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 005" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC005");
				clickYesApplicant1("TC005");
				setemployment_statusApplicant1("TC005");
				setGrossSalaryApplicant1("TC005");
			    clickDetailedOption_exp();
			    setCSAMaintenance("TC005");
			    clickDetailedOption_oth();
			    setSchoolFees("TC005");
			    setChildCare("TC005");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC005");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
