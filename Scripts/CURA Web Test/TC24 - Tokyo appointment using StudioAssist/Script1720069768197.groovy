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

/*Select the Facility
Click Medicaid
Click Vist date
Set text in the Visit date to 09/09/2024
Set Comment to Meet dr. Setiadi at 09:00 AM
Click Book appoinment
 *  Set the Visit date and Comment for booking an appointment
 *
 *  @param visitDate The date for the appointment in the format MM/dd/yyyy
 *  @param comment The comment for the appointment
 */
// Select the Facility
WebUI.selectOptionByValue(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Facility'), 'Tokyo CURA Healthcare Center', 
    true)

// Click Medicaid
WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Medicaid'))

// Click Visit date
WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Visit Date'))

// Set text in the Visit date to 09/09/2024
WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Visit Date'), '09/09/2024')

// Set Comment to Meet dr. Setiadi at 09:00 AM
WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Comment'), 'Meet dr. Setiadi at 09:00 AM')

// Click Book appointment
WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Book Appointment'))

