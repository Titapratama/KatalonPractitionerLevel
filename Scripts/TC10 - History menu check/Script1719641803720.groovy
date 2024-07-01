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

WebUI.click(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/td_28'))

WebUI.setText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Let\'s meet at 9 AM')

WebUI.click(findTestObject('4. Appointment Hongkong/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('4. Appointment Hongkong/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    'Appointment Confirmation')

WebUI.click(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/a_History'))

WebUI.takeScreenshotAsCheckpoint('History Hongkong Appointment')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/h2_History'), 'History')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/div_28062024'), '28/06/2024')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/p_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/p_Medicare'), 'Medicare')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/p_Lets meet at 9 AM'), 
    'Let\'s meet at 9 AM')

WebUI.click(findTestObject('Object Repository/8. History check/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.verifyElementText(findTestObject('9. Homepage of CURA/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 'CURA Healthcare Service')

