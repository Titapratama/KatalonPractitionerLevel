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

WebUI.callTestCase(findTestCase('Eklipse Test/Landing page/TC001 - Open browser'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Eklipse Landing Page/Page_Eklipse/Sign In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_username'), 'tita71@gmail.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_password'), 'tita123.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Sign In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.deleteAllCookies(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Eklipse Account Setting/Page_Eklipse/button_Skip for now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Skip for now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/i_See all_ic-user'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/span_Account Settings'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_Name_Name'), 'Thaitea', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_Email_Email'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/Save Changes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/Change Password'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_currentPassword'), 'tita123.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_newPassword'), 'Tita123.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_confirmPassword'), 'Tita123.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/Save Changes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/i_See all_ic-user'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/span_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_username'), 'tita71@gmail.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_password'), 'tita123.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/img_OR'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Sign In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/h2_Login Failed'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_password_1'), 'Tita123.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Sign In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/Generate Highlights'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

