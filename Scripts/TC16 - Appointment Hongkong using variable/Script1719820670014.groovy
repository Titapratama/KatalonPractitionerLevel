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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

String commentPage = 'Comment'

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Make Appointment'))

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Username'), 'John Doe')

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Login Button'))

WebUI.selectOptionByValue(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Hongkong CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Apply for Hospital Readmission'))

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Medicaid'))

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Visit Date'))

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Comment'), Comment4)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Book Appointment'))

