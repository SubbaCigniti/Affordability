package com.affordability.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.affordability.workflows.OrangeBusBusinessFunctions;
import com.pageobject.OrangePO;
import com.testdata.MSODMTestData;
import com.testdata.OrangeBusTestData;

public class OrangeBus_TC061 extends OrangeBusBusinessFunctions {
	@Test
	public void OrangeBusTC061() throws Throwable {
		child = extent.startTest("OrangeBus", "Verification");
		iterationReport(1, "OrangeBus Test Case 061" + " Started");
		launchApplication(OrangeBusTestData.ORANGEBUSURL);
		setPropertyAndLoanValues("TC061");
		
		clickYesApplicant1("TC061");
		setemployment_statusApplicant1("TC061");
		setAnnualIncomeofApplicant1("TC061");	
		setDayRate_1("TC061");
	
		clickAddIncomeApplicant1();
		setemploymentStatusApp12ndJob("TC061");
		setEmploymentSalary1App12ndJob("TC061");		
		
		
		ClickDetailedOption_hh();
		setproperty_expenditure("TC061");
		
		clickDetailedOption_oth();
		setMobilePhoneBroadband("TC061");
		
		clickCalculateResults();
		verifyAmountAndLoanTerm("TC061");
		parent.appendChild(child);
		// This will mark end of the one row in data sheet
		iterationReport(1, "Test Case Completed");
	}
}
