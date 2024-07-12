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

WebUI.click(findTestObject('7. Failed Login/Page_CURA/a_Make Appointment'))

userName = WebUI.getAttribute(findTestObject('Object Repository/7. Failed Login/Page_CURA/input_Username'), 
    'username')

passWord = WebUI.getAttribute(findTestObject('Object Repository/7. Failed Login/Page_CURA/input_Password'), 
    'password')

WebUI.click(findTestObject('Object Repository/7. Failed Login/Page_CURA/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/7. Failed Login/Page_CURA/input_Username'), 
    ' John Doe')

WebUI.setText(findTestObject('10. Login page/Page_CURA/input_Password'), 'This')

WebUI.click(findTestObject('Object Repository/7. Failed Login/Page_CURA/button_Login'))

if ((userName == 'John Doe') && (passWord == 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')) {
    WebUI.verifyElementVisible(findTestObject('Object Repository/7. Failed Login/Page_CURA/h2_Make Appointment'))
} else {
    WebUI.verifyElementVisible(findTestObject('Object Repository/7. Failed Login/Page_CURA/p_Login failed'))
}

