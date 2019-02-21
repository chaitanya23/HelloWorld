import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_crea'), 'harindra1967@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/label_Mr.'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'sai')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'chaitanya')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'Q8TwuC9x88h6/IgFSBLPaA==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-1234567891011121314151'), '15', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAp'), '6', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-2019201820172016201520'), '2006', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), '18,t nagar,chennai')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'chennai')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaAr'), '51', 
    true)

WebUI.setText(findTestObject('Page_Login - My Store/input__postcode'), '60009')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '9502752579')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

