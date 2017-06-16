package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC003 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC003() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 002" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC003");
				enterDOBAndRetirementAge("TC003", "1");
				clickYesApplicant1("TC003");
				setemployment_statusApplicant1("TC003");
				setGrossSalaryApplicant1("TC003");
			    clickDetailedOption_exp();
			    setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC003");
			    ClickDetailedOption_hh();
			    setproperty_expenditure("TC002");
			    setcouncil_tax("TC002");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC003");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
