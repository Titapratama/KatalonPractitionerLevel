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

CustomKeywords.'propertiesPage.openBrowser.main'()
CustomKeywords.'propertiesPage.loginMenu.main'()

WebUI.selectOptionByValue(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Facility'), facility, true)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Medicare'))

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Visit Date'))

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Visit Date'), datevisit)

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Comment'), commentbook)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Book Appointment'))

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Menu'))

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Home'))

WebUI.verifyElementPresent(findTestObject('2. CURA Test Object (Verify parameter)/CURA Healthcare Service Label'), 0)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Make Appointment'))

