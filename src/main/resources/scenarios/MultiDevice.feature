@MultiDevice
Feature: Multi Device Demo Scenarios

  @2DevicesDemo
  Scenario: 2 Devices Demo
    And I switch to driver "perfecto"
    And I open browser to webpage "https://demo.dynamsoft.com/web-twain/mobile-online-camera-scanner/"
    And I click on "//*[@class="dcs-main-captureBtn"]//img"
    And I click on "//*[@class="dynamsoft-camera-button-toggleCamera"]"
    And I switch to driver "perfecto2"
    And I click on "//*[@text="Internal storage"]"
    And I click on "//*[@text="Download"]"
    And I click on "(//*[@resource-id="com.sec.android.app.myfiles:id/thumbnail_layout"])[1]"
    And I switch to driver "perfecto"
    And I click on "//*[@class="dynamsoft-camera-font dynamsoft-camera-icon-scan"]"
    And I wait for "5" seconds
