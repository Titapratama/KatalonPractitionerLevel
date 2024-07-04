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

/*Open browser 
Navigate to URL https://katalon-demo-cura.herokuapp.com/
Click Make appoitnment in the object repositories/1. CURA Test Object (Click, Set, Dropdown)
Set Username and Password based on the variables tab
Click Login in the object repositories/1. CURA Test Object (Click, Set, Dropdown)
Verify that Make Appointment label appears
*/
//Close(the).browser
/*
*  Open the browser and navigate to a specific URL
*
*  @param url The URL to navigate to
*/
WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Make Appointment'))

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Username'), username)

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Password'), password)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Login Button'))

WebUI.verifyElementText(findTestObject('2. CURA Test Object (Verify parameter)/Make Appointment Text'), 'Make Appointment')

