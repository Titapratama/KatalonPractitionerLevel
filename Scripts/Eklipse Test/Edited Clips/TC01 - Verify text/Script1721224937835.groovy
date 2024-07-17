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

WebUI.setText(findTestObject('Sign in page/Page_Eklipse/Username Eklipse'), 'tita71@gmail.com')

WebUI.click(findTestObject('Sign in page/Page_Eklipse/Password_Eklipse'))

WebUI.setText(findTestObject('Sign in page/Page_Eklipse/Password_Eklipse'), 'tita123.')

WebUI.click(findTestObject('Sign in page/Page_Eklipse/button_Sign In'))

WebUI.scrollToElement(findTestObject('Eklipse Edited Clips/Page_Eklipse/a_Edited Clips'), 0)

WebUI.click(findTestObject('Eklipse Edited Clips/Page_Eklipse/a_Edited Clips'))

WebUI.deleteAllCookies()

WebUI.verifyElementPresent(findTestObject('Eklipse Edited Clips/Page_Eklipse/h2_Edited Clips'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Edited Clips/Page_Eklipse/div_Create Montage'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Eklipse Edited Clips/Page_Eklipse/li_Convert to TikTok'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Eklipse Edited Clips/Page_Eklipse/div_Your AI-edited'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Edited Clips/Page_Eklipse/span_Sort by'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Edited Clips/Page_Eklipse/select_NEWEST TO OLDEST'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Eklipse Edited Clips/Page_Eklipse/select_ALLIN'), 0)

WebUI.scrollToElement(findTestObject('Eklipse Edited Clips/Page_Eklipse/span_No Edited Clip Yet'), 0)

WebUI.verifyElementPresent(findTestObject('Eklipse Edited Clips/Page_Eklipse/span_No Edited Clip Yet'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Edited Clips/Page_Eklipse/button_Convert to TikTok'))

WebUI.scrollToElement(findTestObject('Eklipse Edited Clips/Page_Eklipse/li_Extended  Trimmed Clip'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Edited Clips/Page_Eklipse/li_Extended  Trimmed Clip'))

WebUI.click(findTestObject('Eklipse Edited Clips/Page_Eklipse/li_Extended  Trimmed Clip'))

WebUI.scrollToElement(findTestObject('Eklipse Edited Clips/Page_Eklipse/div_Import Facebook Video'), 0)

WebUI.verifyElementClickable(findTestObject('Eklipse Edited Clips/Page_Eklipse/div_Import Facebook Video'))

WebUI.verifyElementClickable(findTestObject('Eklipse Edited Clips/Page_Eklipse/div_Import Twitch Video'))

WebUI.verifyElementClickable(findTestObject('Eklipse Edited Clips/Page_Eklipse/div_Import YouTube Video'))

WebUI.closeBrowser()

