package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC002 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC002() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 002" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC002");
				enterDOBAndRetirementAge("TC002", "1");
				clickYesApplicant1("TC002");
				clickNumOfApplicantsInput_1();
				setGrossSalaryApplicant1("TC002");
			    clickDetailedOption_exp();
			    setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC002");
			    ClickDetailedOption_hh();
			    setproperty_expenditure("TC002");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC002");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
