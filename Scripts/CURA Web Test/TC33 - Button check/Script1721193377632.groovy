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

WebUI.callTestCase(findTestCase('CURA Web Test/Properties/TCP01 - Open browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Make Appointment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/facebook'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/twitter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/dribble'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1. CURA Object button/Make Appointment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Login Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1. CURA Object button/Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Home'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('CURA Web Test/Properties/TCP02 - Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Facility'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementNotChecked(findTestObject('1. CURA Object button/Hospital Readmission'), 0)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Hospital Readmission'))

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Medicaid'))

WebUI.verifyElementChecked(findTestObject('1. CURA Object button/Medicare'), 0)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Medicare'))

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/None'))

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Calendar Visit Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Comment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Book Appointment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1. CURA Object button/Menu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Home'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/History'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('1. CURA Object button/Logout'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()
