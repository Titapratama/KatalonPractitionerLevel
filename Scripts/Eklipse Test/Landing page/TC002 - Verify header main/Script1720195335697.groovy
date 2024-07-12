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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://eklipse.gg/')

WebUI.maximizeWindow()

WebUI.verifyImagePresent(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/img_Features_logo-desktop'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisibleInViewport(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/FEATURES landing page'), 
    0)

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/FEATURES landing page'))

WebUI.verifyElementVisibleInViewport(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Use Case                                                                                                                                                    COD Streamers'), 
    0)

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Use Case                                                                                                                                                    COD Streamers'))

WebUI.verifyElementVisibleInViewport(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Discovery'), 
    0)

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Discovery'))

WebUI.verifyElementVisibleInViewport(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Premium'), 
    0)

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Premium'))

WebUI.verifyElementVisibleInViewport(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Sign In'), 
    0)

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Sign In'))

WebUI.verifyElementVisibleInViewport(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Start for Free'), 
    0)

WebUI.verifyElementClickable(findTestObject('Eklipse Landing Page/Page_Eklipse - Convert Twitch Clip To TikTok, Reels,  Shorts For Free/Start for Free'))

WebUI.closeBrowser()

