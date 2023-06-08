import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

response = WS.sendRequest(findTestObject('Register', [('email') : email, ('password') : password]))

WS.verifyResponseStatusCode(response, 200, FailureHandling.STOP_ON_FAILURE)

WS.containsString(response, 'token', false)