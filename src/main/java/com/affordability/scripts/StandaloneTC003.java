package com.affordability.scripts;

import org.testng.annotations.Test;

import com.affordability.workflows.StandaloneBusinessFunctions;

public class StandaloneTC003 extends StandaloneBusinessFunctions
{		
	@Test
	public void standaloneTC002 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 002" );	
		runAPITestCase("StandAlone_TC002");
		verifyAffordableAmountAndLoanTermForAPI("TC002");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	
	@Test
	public void standaloneTC003 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 003" );	
		runAPITestCase("StandAlone_TC003");
		verifyAffordableAmountAndLoanTermForAPI("TC003");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	
	@Test
	public void standaloneTC004 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 004" );	
		runAPITestCase("StandAlone_TC004");
		verifyAffordableAmountAndLoanTermForAPI("TC004");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC005 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 005" );	
		runAPITestCase("StandAlone_TC005");
		verifyAffordableAmountAndLoanTermForAPI("TC005");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC006 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 006" );	
		runAPITestCase("StandAlone_TC006");
		verifyAffordableAmountAndLoanTermForAPI("TC006");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC007 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 007" );	
		runAPITestCase("StandAlone_TC007");
		verifyAffordableAmountAndLoanTermForAPI("TC007");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC008 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 008" );	
		runAPITestCase("StandAlone_TC008");
		verifyAffordableAmountAndLoanTermForAPI("TC008");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC009 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 009" );	
		runAPITestCase("StandAlone_TC009");
		verifyAffordableAmountAndLoanTermForAPI("TC009");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
	@Test
	public void standaloneTC010 () throws Throwable{
		
		child = extent.startTest("StandAlone", "Verification");
		iterationReport(1, "StandAlone Test Case 010" );	
		runAPITestCase("StandAlone_TC010");
		verifyAffordableAmountAndLoanTermForAPI("TC010");
		parent.appendChild(child);
		iterationReport(1,"Test Case Completed"); 	
	}
}
