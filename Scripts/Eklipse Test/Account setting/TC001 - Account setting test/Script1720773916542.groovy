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

WebUI.callTestCase(findTestCase('Eklipse Test/Landing page/TC001 - Open browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Eklipse Landing Page/Page_Eklipse/Sign In'))

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_username'), 'tita71@gmail.com')

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_password'), 'tita123.')

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Sign In'))

WebUI.deleteAllCookies()

WebUI.waitForElementClickable(findTestObject('Eklipse Account Setting/Page_Eklipse/button_Skip for now'), 0)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Skip for now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/i_See all_ic-user'))

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/span_Account Settings'))

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_Name_Name'), 'Thaitea')

WebUI.verifyElementClickable(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_Email_Email'))

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Continue'))

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Change Password'))

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_Current password_currentPassword'), 
    'tita123.')

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_New password_newPassword'), 'Tita123.')

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_Confirm password_confirmPassword'), 
    'Tita123.')

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Continue'))

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/i_See all_ic-user'))

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_username'), 'tita71@gmail.com')

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_password'), 'tita123.')

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/img_OR_view-password cursor-pointer'))

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/h2_Login Failed'), 0)

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/input_OR_password_1'), 'Tita123.')

WebUI.click(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/button_Sign In'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Eklipse Account Setting/Page_Eklipse/h1_Generate Your Stream Highlights'), 
    0)

WebUI.closeBrowser()

