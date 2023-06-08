import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

response = WS.sendRequest(findTestObject('User Query/Get User'))

WS.verifyResponseStatusCode(response, 200, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(response, 'per_page', 6)

WS.verifyElementPropertyValue(response, 'total', 12)

WS.verifyElementPropertyValue(response, 'total_pages', 2)

total_data_per_page = WS.getElementPropertyValue(response, 'per_page')

WS.verifyElementsCount(response, 'data', total_data_per_page)