package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC035 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC035() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 035" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC035");
		
		clickYesApplicant1("TC035");
		setemployment_statusApplicant1("TC035");
		setLastFullTradingYearsNetProfit_1("TC035");
		setPreviousFullTradingYearsNetProfit_1("TC035");
		
		clickYesApplicant2("TC035");
		setemployment_statusApplicant2("TC035");
		setGrossSalaryApplicant2("TC035");	
		
		//clickYesApplicant2("TC035");
		clickAddIncomeApplicant1();

		setemploymentStatusApp12ndJob("TC035");
		setLastFullTradingYearsNetProfitofApplicant1Job2("TC035");
		setPreviousFullTradingYearsNetProfitofApplicant1Job2("TC035");
			
		
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC035");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
