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

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/1 AI HIGHLIGHTS'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/a_Contact Us'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/a_Eklipse Premium'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/a_Help'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/a_Our Affiliates'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/a_Privacy'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/a_Refund Policy'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/a_Terms'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/a_Try Now'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/AI Sport'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/AI-Edit beta'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Basic info'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/benefits of Eklipse.gg'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Blog'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Content Planner'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Content Publisher'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Eklipse Studio'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Features button_under'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Gaming Stream Highlights'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Help'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/How can get highlights'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/How Clip Automatically'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/How does Eklipse work'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/How Eklipse studio work'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/How Twitch YouTube'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/How YouTube Highlights Work'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Howconvert clips to Reels'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Is YouTube Highlights free'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Kick Clip downloader'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Kick Support'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn more_AI -Edit'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn more_content publisher'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn more_Gaming highlight'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn more_Mobile app'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn more_under'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn more_under2'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn more_under3'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn more_under4'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Learn Premium'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Mobile App'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Need supportJoin Discord'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Premium'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Premium Features (1)'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Pro Edits'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/share highlights vid'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Sign In'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Sign Up For Free'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Start for Free'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Studio'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Twitch Clip'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Voice Command'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/What are highlights'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/What is Eklipse explanation'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/What is Eklipse Studio'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/What is Eklipse_Discovery'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/What YouTube Highlights'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Where should I start'))

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse/Youtube Highligths'))

WebUI.closeBrowser()

