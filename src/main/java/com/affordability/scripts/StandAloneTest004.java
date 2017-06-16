package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;

public class StandAloneTest004 extends StandaloneBusinessFunctions
{
	@Test
	public void standaloneTC011 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 011" );	
		runAPITestCase("StandAlone_TC011");
		verifyAffordableAmountAndLoanTermForAPI("TC011");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC012 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 012" );	
		runAPITestCase("StandAlone_TC012");
		verifyAffordableAmountAndLoanTermForAPI("TC012");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC013 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 013" );	
		runAPITestCase("StandAlone_TC013");
		verifyAffordableAmountAndLoanTermForAPI("TC013");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC014 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 014" );	
		runAPITestCase("StandAlone_TC014");
		verifyAffordableAmountAndLoanTermForAPI("TC014");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC015 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 015" );	
		runAPITestCase("StandAlone_TC015");
		verifyAffordableAmountAndLoanTermForAPI("TC015");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC016 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 016" );	
		runAPITestCase("StandAlone_TC016");
		verifyAffordableAmountAndLoanTermForAPI("TC016");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC017 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 017" );	
		runAPITestCase("StandAlone_TC017");
		verifyAffordableAmountAndLoanTermForAPI("TC017");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC018 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 018" );	
		runAPITestCase("StandAlone_TC018");
		verifyAffordableAmountAndLoanTermForAPI("TC018");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC019 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 019" );	
		runAPITestCase("StandAlone_TC019");
		verifyAffordableAmountAndLoanTermForAPI("TC019");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC20 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 020" );	
		runAPITestCase("StandAlone_TC020");
		verifyAffordableAmountAndLoanTermForAPI("TC020");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
}
