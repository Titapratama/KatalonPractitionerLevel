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

WebUI.verifyElementText(findTestObject('Object Repository/11. Login menu check/Page_CURA/h1_CURA Service'), 
    'CURA Healthcare Service')

WebUI.click(findTestObject('Object Repository/11. Login menu check/Page_CURA/a_Make Appointment'))

WebUI.takeScreenshotAsCheckpoint('Login page')

WebUI.verifyElementText(findTestObject('Object Repository/11. Login menu check/Page_CURA/h2_Login'), 
    'Login')

WebUI.click(findTestObject('Object Repository/11. Login menu check/Page_CURA/a_CURA menu'))

WebUI.click(findTestObject('Object Repository/11. Login menu check/Page_CURA/a_Login'))

WebUI.takeScreenshotAsCheckpoint('Login page')

WebUI.verifyElementText(findTestObject('Object Repository/11. Login menu check/Page_CURA/h2_Login'), 
    'Login')

WebUI.click(findTestObject('Object Repository/11. Login menu check/Page_CURA/i_CURA fa fa-bars'))

WebUI.click(findTestObject('Object Repository/11. Login menu check/Page_CURA/a_Home'))

WebUI.verifyElementText(findTestObject('Object Repository/11. Login menu check/Page_CURA/h1_CURA Service'), 
    'CURA Healthcare Service')

WebUI.click(findTestObject('Object Repository/11. Login menu check/Page_CURA/i_CURA fa fa-bars'))

WebUI.click(findTestObject('Object Repository/11. Login menu check/Page_CURA/a_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/11. Login menu check/Page_CURA/h2_Login'), 
    'Login')

