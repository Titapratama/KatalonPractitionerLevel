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

emailSignIn = WebUI.getAttribute(findTestObject('Sign in page/Page_Eklipse/input_OR_username'), email)

passwordSignIn = WebUI.getAttribute(findTestObject('Sign in page/Page_Eklipse/input_OR_password'), password)

WebUI.setText(findTestObject('Sign in page/Page_Eklipse/input_OR_username'), email)

WebUI.setText(findTestObject('Sign in page/Page_Eklipse/input_OR_password'), password)

WebUI.click(findTestObject('Sign in page/Page_Eklipse/button_Sign In'))

WebUI.delay(3)

boolean isWarningDisplayed = WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/input_OR_username'), 10)
String warningText = WebUI.getAttribute(findTestObject('Sign in page/Page_Eklipse/input_OR_username'), 'validationMessage')

if ((emailSignIn = !('tita71@gmail')) && (passwordSignIn != 'Tita123.')) {
    WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/h2_Login Failed'), 0)

    WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/div_Your account or password is incorrect. _aee608'), 
        0)

    WebUI.click(findTestObject('Sign in page/Page_Eklipse/button_Continue'))
} 


else if (isWarningDisplayed && (warningText == 'Please fill out this field.')) 
	{
		println('Test Passed: Warning test detected correctly')
	} 

else if (isWarningDisplayed && (warningText == 'Please fill out this field.'))
	{
		println('Test Failed: Warning test NOT detected correctly')
	}

else {
    WebUI.verifyElementPresent(findTestObject('Sign up page/Page_Eklipse/How can Eklipse help Text'), 0)
}

WebUI.closeBrowser()

