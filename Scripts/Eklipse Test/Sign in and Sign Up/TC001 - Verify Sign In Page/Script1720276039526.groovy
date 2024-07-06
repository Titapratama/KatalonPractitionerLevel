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

WebUI.takeFullPageScreenshot()

WebUI.verifyImagePresent(findTestObject('Sign in page/Page_Eklipse/Eklipse gg image_Left'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyImagePresent(findTestObject('Sign in page/Page_Eklipse/Eklipse gg image_Right'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/Easily get highlights, edits, and share Text'), 0)

WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/Automate highlights from Twitch, YouTub Text'), 0)

WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/Edit highlights into shareable clips Text'), 0)

WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/Publish everything at once and boost Text'), 0)

WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/Welcome back Text'), 0)

WebUI.verifyElementPresent(findTestObject('Sign in page/Page_Eklipse/Continue with Label'), 0)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/Continue with twitch button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/Continue with_bg-white'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/Continue with_btn-google nic-google'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/Continue with_kep-login-facebook metro'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/button_Forgot your password'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/button_Sign In'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/button_Reject'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/button_Accept'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/Privacy Policy'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Sign in page/Page_Eklipse/Close cookie'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

