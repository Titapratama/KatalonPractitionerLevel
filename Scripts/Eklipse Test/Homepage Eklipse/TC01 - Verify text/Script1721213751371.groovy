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

WebUI.setText(findTestObject('Sign in page/Page_Eklipse/Username Eklipse'), 'tita71@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sign in page/Page_Eklipse/Password_Eklipse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Sign in page/Page_Eklipse/Password_Eklipse'), 'tita123.', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sign in page/Page_Eklipse/button_Sign In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Homepage Eklipse/Page_Eklipse/button_Skip for now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/Generate Highlights'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/VOD link 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/Connect Ultimate'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/Generate fromExternal'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/Find your vods'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_stream URL'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Upload TikTok'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Upload from local'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/Get clips'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/E-Sports World Cup'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Homepage Eklipse/Page_Eklipse/li_YouTube Highlights'))

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/h4_Clip a YouTube'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/li_Live Stream'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/li_YouTube Highlights'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/p_New to Eklipse'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Commentaries'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Educational'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Get highlighted'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_instant highlights'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Product Reviews'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Self-improvement'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Tip We support'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage Eklipse/Page_Eklipse/span_Video Podcasts'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

