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

/*Verify Make Appointment element text
Select value in the Facility then select Hongkong CURA Healthcare Center
Click Readmission
Click None
Set Visit date to 02/07/2025
Write Comment to Meet dr. Alexandra Abraham
Click Book Appointment button
/*
 *  Verify Make Appointment element text
 *
 */
WebUI.verifyElementText(findTestObject('2. CURA Object Text/Make Appointment'), 'Make Appointment')

/*
 *  Select value in the Facility then select Hongkong CURA Healthcare Center
 *
 */
WebUI.selectOptionByValue(findTestObject('1. CURA Object button/Facility'), 'Hongkong CURA Healthcare Center', true)

/*
 *  Click Readmission
 *
 */
WebUI.click(findTestObject('1. CURA Object button/Hospital Readmission'))

/*
 *  Click None
 *
 */
WebUI.click(findTestObject('1. CURA Object button/None'))

/*
 *  Set Visit date to 02/07/2025
 *
 */
WebUI.setText(findTestObject('1. CURA Object button/Visit Date'), '02/07/2025')

/*
 *  Write Comment to Meet dr. Alexandra Abraham
 *
 */
WebUI.setText(findTestObject('1. CURA Object button/Comment'), 'Meet dr. Alexandra Abraham')

/*
 *  Click Book Appointment button
 *
 */
WebUI.click(findTestObject('1. CURA Object button/Book Appointment'))

/*Click Menu
Click Home
Click Make Appointment
 *  Click Menu
 *
 */
WebUI.click(findTestObject('1. CURA Object button/Menu'))

/*
 *  Click Home
 *
 */
WebUI.click(findTestObject('1. CURA Object button/Home'))

/*
 *  Click Make Appointment
 *
 */
WebUI.click(findTestObject('1. CURA Object button/Make Appointment'))

