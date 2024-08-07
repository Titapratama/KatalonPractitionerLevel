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

WebUI.verifyElementClickable(findTestObject('10. Login page/Page_CURA/a_Make Appointment'))

WebUI.click(findTestObject('10. Login page/Page_CURA/a_Make Appointment'))

WebUI.setText(findTestObject('10. Login page/Page_CURA/input_Username'), 'John Doe')

WebUI.setText(findTestObject('10. Login page/Page_CURA/input_Password'), 'ThisIsNotAPassword')

WebUI.verifyElementClickable(findTestObject('10. Login page/Page_CURA/button_Login'))

WebUI.click(findTestObject('10. Login page/Page_CURA/button_Login'))

WebUI.verifyElementClickable(findTestObject('3. Appointment/Page_CURA/button_Book Appointment'))

WebUI.verifyElementClickable(findTestObject('8. History check/Page_CURA/i_CURA_fa fa-bars'))

