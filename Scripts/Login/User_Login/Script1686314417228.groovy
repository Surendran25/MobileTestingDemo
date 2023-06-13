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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import internal.GlobalVariable as GlobalVariable

apk_File = 'APK File/IvyDMS_PNGIndia_1567_9911.apk'

def appPath = PathUtil.relativeToAbsolutePath(apk_File, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

if (Mobile.verifyElementVisible(findTestObject('Activation/Allow_button_1'), 5, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Activation/Allow_button_1'), 0)

    Mobile.tap(findTestObject('Activation/Allow_button_1'), 0)
}

Mobile.delay(5)

Mobile.sendKeys(findTestObject('Activation/Activation Key'), 'CPG-SF-RCHXFZAIC', FailureHandling.STOP_ON_FAILURE)