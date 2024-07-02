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

WebUI.verifyElementPresent(findTestObject('9. Homepage of CURA/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 0)

WebUI.click(findTestObject('6. CURA menu/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('11. Login menu check/Page_CURA Healthcare Service/a_Home'))

WebUI.verifyElementPresent(findTestObject('11. Login menu check/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 0)

WebUI.click(findTestObject('11. Login menu check/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('8. History check/Page_CURA Healthcare Service/a_History'))

WebUI.click(findTestObject('8. History check/Page_CURA Healthcare Service/a_Go to Homepage'))
