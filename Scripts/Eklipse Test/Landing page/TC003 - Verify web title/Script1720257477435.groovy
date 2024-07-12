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

not_run: WebUI.waitForImagePresent(findTestObject('Eklipse Landing Page/Page_Eklipse/img_Features_logo-desktop'), 
    3)

not_run: WebUI.takeFullPageScreenshot()

String title1 = WebUI.getWindowTitle()

String title2 = 'Eklipse - Convert Twitch Clip To TikTok, Reels, & Shorts For Free'

WebUI.verifyEqual(title1, title2)

if (title1.equals(title2)) {
    WebUI.comment('PAGE TITLE MATCHED')

    WebUI.executeJavaScript('alert(\'PAGE TITLE MATCHED\')', null)
} else {
    WebUI.executeJavaScript('alert(\'PAGE TITLE NOT MATCHED\')', null)
}

WebUI.closeBrowser()

