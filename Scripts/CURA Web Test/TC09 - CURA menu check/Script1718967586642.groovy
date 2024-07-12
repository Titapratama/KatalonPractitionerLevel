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
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
WebUI.verifyElementClickable(findTestObject('6. CURA menu/Page_CURA/a_CURA menu'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_CURA menu'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_Home'))
WebUI.verifyElementText(findTestObject('Object Repository/6. CURA menu/Page_CURA/h1_CURA Service'),'CURA Healthcare Service')
WebUI.verifyElementClickable(findTestObject('6. CURA menu/Page_CURA/i_CURA_fa fa-bars'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/i_CURA_fa fa-bars'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_Login'))
WebUI.verifyElementText(findTestObject('Object Repository/6. CURA menu/Page_CURA/h2_Login'), 'Login')
WebUI.setText(findTestObject('Object Repository/6. CURA menu/Page_CURA/input_Username'), 'John Doe')
WebUI.setEncryptedText(findTestObject('Object Repository/6. CURA menu/Page_CURA/input_Password'),'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/button_Login'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_CURA menu'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_Home'))
WebUI.verifyElementText(findTestObject('Object Repository/6. CURA menu/Page_CURA/h1_CURA Service'),'CURA Healthcare Service')
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_CURA menu'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_History'))
WebUI.verifyElementText(findTestObject('Object Repository/6. CURA menu/Page_CURA/h2_History'), 'History')
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_CURA menu'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_Profile'))
WebUI.verifyElementText(findTestObject('Object Repository/6. CURA menu/Page_CURA/h2_Profile'), 'Profile')
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/i_CURA_fa fa-bars'))
WebUI.click(findTestObject('Object Repository/6. CURA menu/Page_CURA/a_Logout'))
WebUI.verifyElementText(findTestObject('Object Repository/6. CURA menu/Page_CURA/h1_CURA Service'),'CURA Healthcare Service')
WebUI.closeBrowser()

