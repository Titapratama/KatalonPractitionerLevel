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

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/input_Username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/input_Password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/select_Tokyo'), 
    'Seoul CURA Healthcare Center', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/select_Tokyo'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/input_readmission'))

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/input_None_programs'))

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/input_Medicare_programs'))

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/span_Visit Date'))

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/td_1'))

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/input_Visit Date'))

WebUI.setText(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/textarea_Comment'), 
    'Lets meet at 8 PM')

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/button_Book Appointment'))

WebUI.takeScreenshotAsCheckpoint('Hongkong Appointment Confirmation')

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/h2_Appointment Confirmation'))

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/p_ your appointment'))

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/p_Hongkong'))

WebUI.verifyElementPresent(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/p_Yes'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/p_Medicare'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/p_01072024'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/p_Lets meet at 8 PM'), 
    0)

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/Go Homepage'))

WebUI.click(findTestObject('Object Repository/4. Appointment Hongkong/Page_CURA/h1_CURA Service'))

WebUI.closeBrowser()

