# API-KATALON


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
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import groovy.json.JsonSlurper as JsonSlurper
import groovy.json.JsonOutput as JsonOutput
import com.kazurayam.materials.MaterialRepository as MaterialRepository
import java.nio.file.Path as Path

def response1 = WS.sendRequestAndVerify(findTestObject('SQ/Ex Other Country/1 Pax/Airshopping-Json-1pax-RT', [('Dep1') : 'PAR'
            , ('Arr1') : 'SYD', ('PTC1') : 'ADT', ('CBN') : 'Economy', ('CBT') : 'Y', ('Dep2') : 'SYD', ('Arr2') : 'PAR'
            , ('Date1') : '2021-05-10', ('Date2') : '2021-05-11']))

println findTestObject('SQ/Ex Other Country/1 Pax/Airshopping-Json-1pax-RT', [('Dep1') : 'PAR'
            , ('Arr1') : 'SYD', ('PTC1') : 'ADT', ('CBN') : 'Economy', ('CBT') : 'Y', ('Dep2') : 'SYD', ('Arr2') : 'PAR'
            , ('Date1') : '2021-05-10', ('Date2') : '2021-05-11']).getHttpBody()


WS.verifyResponseStatusCode(response1, 200)

def slurper = new JsonSlurper()
def result1 = slurper.parseText(response1.getResponseBodyContent())

println('ResultAirshopping-RT-1ADT')
println(JsonOutput.prettyPrint(response1.getResponseBodyContent()))

MaterialRepository mr = ((GlobalVariable.MATERIAL_REPOSITORY) as MaterialRepository)

Path path2 = mr.resolveMaterialPath(GlobalVariable.CURRENT_TESTCASE_ID, 'Request-Airshopping.json')
String Request1 = findTestObject('SQ/Ex Other Country/1 Pax/Airshopping-Json-1pax-RT', [('Dep1') : 'PAR'
            , ('Arr1') : 'SYD', ('PTC1') : 'ADT', ('CBN') : 'Economy', ('CBT') : 'Y', ('Dep2') : 'SYD', ('Arr2') : 'PAR'
            , ('Date1') : '2021-05-10', ('Date2') : '2021-05-11']).getHttpBody()

path2.toFile().append(Request1, 'utf-8')

Path path3 = mr.resolveMaterialPath(GlobalVariable.CURRENT_TESTCASE_ID, 'Response-Airshopping.json')
String Response1 = response1.getResponseBodyContent()
path3.toFile().append(Response1, 'utf-8')

def response2 = WS.sendRequestAndVerify(findTestObject('SQ/Ex Other Country/1 Pax/FlightPrice-Json-1Pax-RT',[
		('Token') : result1.IATA_AirShoppingRS.PayloadAttributes.EchoTokenText, 
		('Offerid') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferID, 
		('OfferItem1') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferItem[0].OfferItemID, 
		('PXJOURNEY1') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferItem[0].Service[0].ServiceAssociations.PaxJourneyRefID[0], 
		('PXJOURNEY2') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferItem[0].Service[0].ServiceAssociations.PaxJourneyRefID[1], 
		('Shopping') : result1.IATA_AirShoppingRS.Response.ShoppingResponse.ShoppingResponseID, 
		('Amount') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].TotalPrice.TotalAmount.value, 
		('OwnerCode') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OwnerCode]))

WS.verifyResponseStatusCode(response2, 200)

def result2 = slurper.parseText(response2.getResponseBodyContent())

println('ResultBA-FlightPrice-1Pax-RT')
println(JsonOutput.prettyPrint(response2.getResponseBodyContent()))

Path path4 = mr.resolveMaterialPath(GlobalVariable.CURRENT_TESTCASE_ID, 'Request-OfferPrice.json')
String Request2 = findTestObject('SQ/Ex Other Country/1 Pax/FlightPrice-Json-1Pax-RT', 
		[('Token') : result1.IATA_AirShoppingRS.PayloadAttributes.EchoTokenText, 
		('Offerid') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferID, 
		('OfferItem1') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferItem[0].OfferItemID, 
		('PXJOURNEY1') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferItem[0].Service[0].ServiceAssociations.PaxJourneyRefID[0], 
		('PXJOURNEY2') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferItem[0].Service[0].ServiceAssociations.PaxJourneyRefID[1], 
		('Shopping') : result1.IATA_AirShoppingRS.Response.ShoppingResponse.ShoppingResponseID, 
		('Amount') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].TotalPrice.TotalAmount.value, 
		('OwnerCode') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OwnerCode]).getHttpBody()
path4.toFile().append(Request2, 'utf-8')

Path path5 = mr.resolveMaterialPath(GlobalVariable.CURRENT_TESTCASE_ID, 'Response-OfferPrice.json')
String Response2 = response2.getResponseBodyContent()
path5.toFile().append(Response2, 'utf-8')

def response3 = WS.sendRequestAndVerify(findTestObject('SQ/Ex Other Country/1 Pax/OrderCreate-Json-1pax-RT',
		[('Token') : result1.IATA_AirShoppingRS.PayloadAttributes.EchoTokenText,
		('OwnerCode') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OwnerCode,
		('Offerid') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferID,
		('OfferItem1') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferItem[0].OfferItemID,
		('PTC') : result1.IATA_AirShoppingRS.Response.DataLists.PaxList.Pax[0].PTC,
		('Shopping') : result1.IATA_AirShoppingRS.Response.ShoppingResponse.ShoppingResponseID,
		('Amount') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].TotalPrice.TotalAmount.value]))
WS.verifyResponseStatusCode(response3, 200)

def result3 = slurper.parseText(response3.getResponseBodyContent())
println(JsonOutput.prettyPrint(response3.getResponseBodyContent()))

Path path6 = mr.resolveMaterialPath(GlobalVariable.CURRENT_TESTCASE_ID, 'Request-OrderCreate.json')
String Request3 = findTestObject('SQ/Ex Other Country/1 Pax/OrderCreate-Json-1pax-RT', 
		[('Token') : result1.IATA_AirShoppingRS.PayloadAttributes.EchoTokenText, 
		('OwnerCode') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OwnerCode, 
		('Offerid') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferID, 
		('OfferItem1') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].OfferItem[0].OfferItemID, 
		('PTC') : result1.IATA_AirShoppingRS.Response.DataLists.PaxList.Pax[0].PTC, 
		('Shopping') : result1.IATA_AirShoppingRS.Response.ShoppingResponse.ShoppingResponseID, 
		('Amount') : result1.IATA_AirShoppingRS.Response.OffersGroup.CarrierOffers[0].Offer[0].TotalPrice.TotalAmount.value]).getHttpBody()
path6.toFile().append(Request3, 'utf-8')

Path path7 = mr.resolveMaterialPath(GlobalVariable.CURRENT_TESTCASE_ID, 'Response-OrderCreate.json')
String Response3 = response3.getResponseBodyContent()
path7.toFile().append(Response3, 'utf-8')

