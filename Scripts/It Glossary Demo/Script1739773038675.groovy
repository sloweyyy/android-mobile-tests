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

Mobile.startApplication('/Users/phuc.truong/Downloads/IT Glossary_1.5_Apkpure.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - TermsDefinitions (1)'), 0)

Mobile.swipe(0, 2000, 0, 700)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.TextView - Apple'), 0)

Mobile.scrollToText('Call')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Capturing'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.TextView - Capturing (1)'), 0)

Mobile.pressBack()

Mobile.tapAtPosition(433, 147)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Search (1)'), 'Alpha test', 0)

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Alpha test'), 0)

Mobile.closeApplication()

