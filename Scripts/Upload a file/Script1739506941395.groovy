import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

String filePath = new File((RunConfiguration.getProjectDir() + '/') + 'Data Files/thumbnail.png').getCanonicalPath()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd')

CustomKeywords.'com.katalon.testcloud.FileExecutor.uploadFileToWeb'(findTestObject('Page_File Upload Sample - West Wind Web Connection/input_Select images_upload'), 
    filePath)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_File Upload Sample - West Wind Web Connection/div_1 file(s)thumbnail.png'), 
    0)

WebUI.closeBrowser()

