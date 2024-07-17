import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Eklipse Test/Landing page/TC001 - Open browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Eklipse Test/Sign in and Sign Up/TC000 - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.deleteAllCookies()

WebUI.scrollToElement(findTestObject('Eklipse Pro Edits/Page_Eklipse/a_Pro Edits'), 0)

WebUI.click(findTestObject('Eklipse Pro Edits/Page_Eklipse/a_Pro Edits'))

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/h3_Professionally Edited'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Let our professional'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Sort by'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Pro Edits/Page_Eklipse/select_NEWEST TO OLDES'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Filter Status'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Pro Edits/Page_Eklipse/select_AllRequestedCompleted'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/h4_Give a Pro-Quality'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/p_Show off your content'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Pro Edits/Page_Eklipse/a_Check Sample Videos'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Eklipse Pro Edits/Page_Eklipse/button_Request Edit Now'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Eklipse Pro Edits/Page_Eklipse/button_Request Edit Now'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/div_Request Pro Edits'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/div_Total duration'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/div_Your Video Preference'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/label_Output Format'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Landscape_checkmark'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/label_Portrait'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/div_Best for long video'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/div_Best for shorts format'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/label_Epic'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/label_Funny'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Effect Options'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Zoom'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Sound Effect'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Subtitles'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Meme'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Detailed information'), 0)

WebUI.verifyElementNotChecked(findTestObject('Eklipse Pro Edits/Page_Eklipse/span_Allow Eklipse to feature'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Pro Edits/Page_Eklipse/button_Purchase Pro Edits'))

WebUI.closeBrowser()

