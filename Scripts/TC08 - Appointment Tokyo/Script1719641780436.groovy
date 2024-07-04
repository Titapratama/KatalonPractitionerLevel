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

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Make Appointment'))

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Login Button'))

WebUI.selectOptionByValue(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Facility'), 'Hongkong CURA Healthcare Center', 
    true)

WebUI.selectOptionByValue(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Facility'), 'Tokyo CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Apply for Hospital Readmission'))

WebUI.uncheck(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Apply for Hospital Readmission'))

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/None'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Medicare'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Medicaid'))

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Medicare'))

WebUI.setText(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Visit Date'), '30/06/2024')

WebUI.click(findTestObject('1. CURA Test Object (Click, Set, Dropdown)/Book Appointment'))

WebUI.takeScreenshotAsCheckpoint('Tokyo Appointment Confirmation')

WebUI.verifyElementText(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    'Appointment Confirmation')

WebUI.verifyElementText(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/p_Please be informed that your appointment _11813a'), 
    'Please be informed that your appointment has been booked as following:')

WebUI.verifyElementText(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/p_Tokyo CURA Healthcare Center'), 
    'Tokyo CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/p_Yes'), 'No')

WebUI.verifyElementText(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/p_Medicare'), 
    'Medicare')

WebUI.verifyElementText(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/p_30062024'), 
    '30/06/2024')

WebUI.verifyElementText(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/div_Comment_col-xs-8'), 
    '')

WebUI.click(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.verifyElementText(findTestObject('Object Repository/5. Appointment Tokyo/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 
    'CURA Healthcare Service')

WebUI.closeBrowser()

