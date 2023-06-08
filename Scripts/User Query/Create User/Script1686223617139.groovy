import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

response = WS.sendRequest(findTestObject('User Query/Create User', [('name') : name, ('job') : job]))

WS.verifyResponseStatusCode(response, 201, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'name', name)

WS.verifyElementPropertyValue(response, 'job', job)