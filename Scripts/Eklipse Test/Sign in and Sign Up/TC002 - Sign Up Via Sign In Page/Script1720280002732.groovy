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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Sign In'))

WebUI.deleteAllCookies()

WebUI.click(findTestObject('Sign in page/Page_Eklipse/button_Sign Up'))

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_name'), 'Pratama')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_email'), 'tta123@yahoo.com')

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password'), 'tita123.')

WebUI.click(findTestObject('Sign up page/Page_Eklipse/img_OR_view-password cursor-pointer'))

WebUI.setText(findTestObject('Sign up page/Page_Eklipse/input_OR_password_confirmation'), 'tita123.')

WebUI.click(findTestObject('Sign up page/Page_Eklipse/img_OR_view-password cursor-pointer'))

WebUI.click(findTestObject('Sign up page/Page_Eklipse/button_Sign Up'))

WebUI.verifyElementPresent(findTestObject('Sign up page/Page_Eklipse/How can Eklipse help Text'), 0)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mail.google.com/mail/u/0/#inbox')

