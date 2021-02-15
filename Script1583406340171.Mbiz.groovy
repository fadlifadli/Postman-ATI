import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

'call endpoint'
def list_po = WS.sendRequest(findTestObject("Object Repository/Quasi Retail/API/Transaction/Purchase Order/list", [('apiUrl') : GlobalVariable.apiUrl,
	('apiVersion') : GlobalVariable.apiVersion, ('odooUsernameHeader') : GlobalVariable.odooUsernameHeader, ('odooUsernameHeaderValue') : GlobalVariable.odooUsernameHeaderValue,
	('odooPasswordHeader') : GlobalVariable.odooPasswordHeader, ('odooPasswordHeaderValue') : GlobalVariable.odooPasswordHeaderValue]))

'verify response code'
WS.verifyResponseStatusCode(list_po, 200)

'get response data'
def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText(list_po.getResponseText())
Map data = [:]
data.put('id', object.data.result.id[0])
data.put('name', object.data.result.name[0])
return data