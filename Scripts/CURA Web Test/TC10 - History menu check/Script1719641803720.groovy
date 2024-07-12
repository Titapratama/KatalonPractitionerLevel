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

WebUI.callTestCase(findTestCase('CURA Web Test/Properties/TCP02 - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('1. CURA Object button/Facility'), 'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('1. CURA Object button/Hospital Readmission'))

WebUI.setText(findTestObject('1. CURA Object button/Visit Date'), '28/06/2024')

WebUI.setText(findTestObject('1. CURA Object button/Comment'), 'Let\'s meet at 9 AM')

WebUI.click(findTestObject('1. CURA Object button/Book Appointment'))

WebUI.verifyElementText(findTestObject('4. Appointment Hongkong/Page_CURA/h2_Appointment Confirmation'), 'Appointment Confirmation')

WebUI.click(findTestObject('1. CURA Object button/Menu'))

WebUI.click(findTestObject('1. CURA Object button/History'))

WebUI.takeScreenshotAsCheckpoint('History Hongkong Appointment')

WebUI.verifyElementText(findTestObject('8. History check/Page_CURA/h2_History'), 'History')

WebUI.verifyElementText(findTestObject('8. History check/Page_CURA/div_28062024'), '28/06/2024')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA/p_Hongkong'), 'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA/p_Yes'), 'Yes')

WebUI.verifyElementText(findTestObject('Object Repository/8. History check/Page_CURA/p_Medicare'), 'Medicare')

WebUI.verifyElementText(findTestObject('8. History check/Page_CURA/p_Lets meet at 9 AM'), 'Let\'s meet at 9 AM')

WebUI.click(findTestObject('1. CURA Object button/Go to Homepage'))

WebUI.verifyElementText(findTestObject('2. CURA Object Text/Healthcare Service'), 'CURA Healthcare Service')

