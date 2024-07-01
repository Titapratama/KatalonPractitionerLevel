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

WebUI.takeScreenshotAsCheckpoint('CURA Homepage')

WebUI.verifyElementText(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 
    'CURA Healthcare Service')

WebUI.verifyElementText(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/h3_We Care About Your Health'), 
    'We Care About Your Health')

WebUI.verifyElementText(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/strong_CURA Healthcare Service'), 
    'CURA Healthcare Service')

String ExpectedValue = 'Atlanta 550 Pharr Road NE Suite 525\nAtlanta, GA 30305'

WebUI.verifyElementText(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/p_Atlanta 550 Pharr Road NE Suite 525Atlant_8f4c85'), 
    ExpectedValue)

WebUI.verifyElementText(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/li_(678) 813-1KMS'), 
    '(678) 813-1KMS')

WebUI.verifyElementText(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/li_infokatalon.com'), 
    'info@katalon.com')

WebUI.verifyElementClickable(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-facebook fa-fw fa-3x'))

WebUI.verifyElementClickable(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-twitter fa-fw fa-3x'))

WebUI.verifyElementClickable(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-dribbble fa-fw fa-3x'))

WebUI.verifyElementText(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2024'), 
    'Copyright © CURA Healthcare Service 2024')

WebUI.verifyElementClickable(findTestObject('Object Repository/9. Homepage of CURA/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.closeBrowser()

