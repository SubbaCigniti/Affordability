package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC060 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC060() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 060" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC060");
		
		clickYesApplicant1("TC060");
		setemployment_statusApplicant1("TC060");
		setAnnualIncomeofApplicant1("TC060");	
		setDayRate_1("TC060");
	
		clickYesApplicant2("TC060");
		setemployment_statusApplicant2("TC060");
		setAnnualIncomeofApplicant2("TC060");	
		setDayRate_2("TC060");
		
//		setLastFullTradingYearsNetProfitofApplicant1Job2("TC060");
//		setPreviousFullTradingYearsNetProfitofApplicant1Job2("TC060");
	
		clickAddIncomeApplicant2();
		setemploymentStatusApp12ndJob("TC060");
		setEmploymentSalary1App22ndJob("TC060");
	
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC060");
		
		clickDetailedOption_oth();
		setOtherInsuranced("TC060");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC060");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
