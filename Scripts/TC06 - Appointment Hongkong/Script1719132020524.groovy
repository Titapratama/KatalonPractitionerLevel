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

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/input_Username_username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/input_None_programs'))

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/input_Medicare_programs'))

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/td_1'))

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.setText(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'Lets meet at 8 PM')

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.takeScreenshotAsCheckpoint('Hongkong Appointment Confirmation')

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/p_Please be informed that your appointment _11813a'))

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/p_Yes'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/p_Medicare'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/p_01072024'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/p_Lets meet at 8 PM'), 
    0)

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/Appointment Hongkong/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.closeBrowser()

