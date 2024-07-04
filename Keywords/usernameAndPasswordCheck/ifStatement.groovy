package usernameAndPasswordCheck

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ifStatement {
	@Keyword
	public void main() {
		String userName = WebUI.getAttribute(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Username'),'username')

		String passWord = WebUI.getAttribute(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Password'),'password')

		if ((userName == 'John Doe') && (passWord == 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')) {
			WebUI.verifyElementVisible(findTestObject('Object Repository/7. Failed Login/Page_CURA Healthcare Service/h2_Make Appointment'))
		} else {
			WebUI.verifyElementVisible(findTestObject('Object Repository/7. Failed Login/Page_CURA Healthcare Service/p_Login failed Please ensure the username a_eb55b5'))
		}
	}
}