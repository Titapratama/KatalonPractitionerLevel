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

/*Select Seoul CURA Healthcare Center in the Facility
Click Readmission
Click Medicaid
Set Visit date to 05/08/2024
Set Comment to I wanna reschedule to 06 August 2024
Click Book Appointment
Click Menu
Click Home
Click Make Appointment

 *  Select Seoul CURA Healthcare Center in the Facility
 *
 *  @param facilityName The name of the healthcare center to select
 */
// Select the Seoul CURA Healthcare Center in the Facility
WebUI.selectOptionByValue(findTestObject('1. CURA Object button/Facility'), 'Seoul CURA Healthcare Center', true)

/*
 *  Click Readmission
 */
// Click on the Readmission option
WebUI.click(findTestObject('1. CURA Object button/Hospital Readmission'))

/*
 *  Click Medicaid
 */
// Click on the Medicaid option
WebUI.click(findTestObject('1. CURA Object button/Medicare'))

/*
 *  Set Visit date to 05/08/2024
 *
 *  @param visitDate The date to set for the visit
 */
// Set the visit date to 05/08/2024
WebUI.setText(findTestObject('1. CURA Object button/Visit Date'), '05/08/2024')

/*
 *  Set Comment to I wanna reschedule to 06 August 2024
 *
 *  @param comment The comment to set for the appointment
 */
// Set the comment to "I wanna reschedule to 06 August 2024"
WebUI.setText(findTestObject('1. CURA Object button/Comment'), 'I wanna reschedule to 06 August 2024')

/*
 *  Click Book Appointment
 */
// Click on the Book Appointment button
WebUI.click(findTestObject('1. CURA Object button/Book Appointment'))

/*
 *  Click Menu
 */
// Click on the Menu button
WebUI.click(findTestObject('1. CURA Object button/Menu'))

/*
 *  Click Home
 */
// Click on the Home option in the menu
WebUI.click(findTestObject('1. CURA Object button/Home'))

/*
 *  Click Make Appointment
 */
// Click on the Make Appointment option in the menu
WebUI.click(findTestObject('1. CURA Object button/Make Appointment'))

