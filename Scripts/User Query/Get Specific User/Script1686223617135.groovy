import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

response = WS.sendRequest(findTestObject('User Query/Get Specific User', [('user') : id]))

WS.verifyResponseStatusCode(response, 200, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'data.email', email)

WS.verifyElementPropertyValue(response, 'data.first_name', first_name)

WS.verifyElementPropertyValue(response, 'data.last_name', last_name)