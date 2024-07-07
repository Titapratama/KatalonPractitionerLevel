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

CustomKeywords.'eklipse_keywords.openBrowserEklipse.main'()

CustomKeywords.'eklipse_keywords.signInToEklipse.main'()

WebUI.click(findTestObject('Sign in page/Page_Eklipse/button_Sign Up'))

//The email has already ben taken
WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_name'), 'April')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_email'), 'titaapratama@gmail.com')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password'), 'Tita123.')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password_confirmation'), 'Tita123.')

WebUI.click(findTestObject('Sign up page/Page_Eklipse/button_Sign Up'))

WebUI.delay(3)

String result = ''

if (WebUI.verifyElementPresent(findTestObject('Sign up page/Page_Eklipse/div_The email has already been taken'), 0)) {
    result += '1. Passed: The email has already ben taken\n'
} else {
    result += '1. Failed: Expected Element \'The email has already been taken\' not found\n'
}

//Password confirm doesn't match
WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_name'), 'April')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_email'), 'titaapratama@gmail.com')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password'), 'Tita123.')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password_confirmation'), 'tita123.')

WebUI.click(findTestObject('Sign up page/Page_Eklipse/button_Sign Up'))

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Sign up page/Page_Eklipse/div_Password  Confirm Password does not match'), 
    0)) {
    result += '1. Passed: Password confirm Password does not match\n'
} else {
    result += '1. Failed: Expected Element \'Password confirm Password does not match\' not found\n'
}

//The password field must be at least 8 characters
WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_name'), 'April')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_email'), 'titaapratama@gmail.com')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password'), 'Tita12.')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password_confirmation'), 'Tita12.')

WebUI.click(findTestObject('Sign up page/Page_Eklipse/button_Sign Up'))

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Sign up page/Page_Eklipse/div_The password field must be at least 8 c_247518'), 
    0)) {
    result += '1. Passed: The password field must be at least 8 characters\n'
} else {
    result += '1. Failed: Expected Element \'The password field must be at least 8 charactersn\' not found\n'
}

//Please fill out this field warning
WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_name'), '')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_email'), '')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password'), '')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password_confirmation'), '')

WebUI.click(findTestObject('Sign up page/Page_Eklipse/button_Sign Up'))

WebUI.delay(3)

boolean isWarningDisplayed = WebUI.verifyElementPresent(findTestObject('Sign up page/Page_Eklipse/input_OR_name'), 10)

String warningText = WebUI.getAttribute(findTestObject('Sign up page/Page_Eklipse/input_OR_name'), 'validationMessage')

if (isWarningDisplayed && (warningText == 'Please fill out this field.')) {
    println('Test Passed: Warning text detected correctly.')
} else {
    println('Test Failed: Warning text not detected correctly or unexpected text.')
}

WebUI.closeBrowser()

