package com.affordability.scripts;


import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC009 extends OrangeBusBusinessFunctions
{	
	@Test
	public void OrangeBusTC009() throws Throwable 
	{
				child = extent.startTest("OrangeBus", "Verification");
				iterationReport(1, "OrangeBus Test Case 002" + " Started");	
				launchApplication(OrangeBusTestData.ORANGEBUSURL);
				setPropertyAndLoanValues("TC009");
				clickYesApplicant1("TC009");
				setemployment_statusApplicant1("TC009");
				setGrossSalaryApplicant1("TC009");
				setRegularBonusofApplicant1("TC009");
				setAllowancesofApplicant1("TC009");
				clickDetailedOption_exp();
				setcomittedExp_CC_Monthlypayment("TC009");
				setcommitted_Expenditure_Personal_loans_or_Hire_purchaseApp1("TC009");
				ClickDetailedOption_hh();
				setGroundRentOrService("TC009");
				clickDetailedOption_oth();
				setSchoolFees("TC009");
				setHouseKeeping("TC009");
				setOtherInsuranced("TC009");
			    clickCalculateResults();
			    verifyAmountAndLoanTerm("TC008");
				parent.appendChild(child);
				iterationReport(1,"Test Case Completed"); 
		
	}
	
	
	
}
