package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC059 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC059() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 059" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC059");
		
		clickYesApplicant1("TC059");
		setemployment_statusApplicant1("TC059");
		setAnnualIncomeofApplicant1("TC059");	
		setDayRate_1("TC059");
		
		clickYesApplicant2("TC059");
		setemployment_statusApplicant2("TC059");
//		setAnnualIncomeofApplicant2("TC059");	
//		setDayRate_2("TC059");
		setLastFullTradingYearsNetProfit_2("TC059");
	    setPreviousFullTradingYearsNetProfit_2("TC059");
		
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC059");
		setLastFullTradingYearsNetProfitofApplicant1Job2("TC059");
		setPreviousFullTradingYearsNetProfitofApplicant1Job2("TC059");
		
		clickDetailedOption_exp();
		setcomittedExp_CC_Monthlypayment("TC059");
		
		ClickDetailedOption_hh();
		setcouncil_tax("TC059");
		
		clickDetailedOption_oth();
		setHouseKeeping("TC059");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC059");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
