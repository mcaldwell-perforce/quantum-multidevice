package com.quantum.tests;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.quantum.utils.DriverUtils;
import org.testng.annotations.Test;

public class TwoDevices extends WebDriverTestCase {

    @Test(description = "JavaTestTwoDevices", groups = {"@2DevicesDemo"})
    public void twoDevicesTest() throws InterruptedException {
        DriverUtils.switchToDriver("perfecto");
        getDriver().get("https://demo.dynamsoft.com/web-twain/mobile-online-camera-scanner/");
        getDriver().findElementByXPath("//*[@class=\"dcs-main-captureBtn\"]//img").click();
        getDriver().findElementByXPath("//*[@class=\"dynamsoft-camera-button-toggleCamera\"]").click();
        DriverUtils.switchToDriver("perfecto2");
        getDriver().findElementByXPath("//*[@text=\"Internal storage\"]").click();
        getDriver().findElementByXPath("//*[@text=\"Download\"]").click();
        getDriver().findElementByXPath("(//*[@resource-id=\"com.sec.android.app.myfiles:id/thumbnail_layout\"])[1]").click();
        DriverUtils.switchToDriver("perfecto");
        getDriver().findElementByXPath("//*[@class=\"dynamsoft-camera-font dynamsoft-camera-icon-scan\"]").click();
        Thread.sleep(5000);
    }
}
