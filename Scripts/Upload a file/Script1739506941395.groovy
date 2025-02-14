import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.katalon.testcloud.FileExecutor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd')

//WebUI.uploadFile(findTestObject('Object Repository/Page_File Upload Sample - West Wind Web Connection/input_Select images_upload'), 
//    System.getProperty("user.dir") + "/thumbnail.png")
FileExecutor.uploadFileToWeb(findTestObject('Object Repository/Page_File Upload Sample - West Wind Web Connection/input_Select images_upload'),
	System.getProperty("user.dir") + "/thumbnail.png")

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_File Upload Sample - West Wind Web Connection/div_1 file(s)thumbnail.png'), 
    0)


WebUI.closeBrowser()

