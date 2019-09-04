package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceRecord
 */
public class BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceRecord   {
  private String versionNumber = null;

  private String customerCustomizationReference = null;

  private String deliverymethod = null;

  private String issueLocation = null;

  private String issuedDeviceConfiguration = null;

  private String usageLog = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Operating system version for smart devices 
   * @return versionNumber
  **/

  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Used for device personalization 
   * @return customerCustomizationReference
  **/

  public String getCustomerCustomizationReference() {
    return customerCustomizationReference;
  }

  public void setCustomerCustomizationReference(String customerCustomizationReference) {
    this.customerCustomizationReference = customerCustomizationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details how device and replacements are distributed (e.g. mail, courier, collect at branch, kiosk) 
   * @return deliverymethod
  **/

  public String getDeliverymethod() {
    return deliverymethod;
  }

  public void setDeliverymethod(String deliverymethod) {
    this.deliverymethod = deliverymethod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The delivery address or tracked location if appropriate 
   * @return issueLocation
  **/

  public String getIssueLocation() {
    return issueLocation;
  }

  public void setIssueLocation(String issueLocation) {
    this.issueLocation = issueLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Device stored values such as mag strip/chip settings 
   * @return issuedDeviceConfiguration
  **/

  public String getIssuedDeviceConfiguration() {
    return issuedDeviceConfiguration;
  }

  public void setIssuedDeviceConfiguration(String issuedDeviceConfiguration) {
    this.issuedDeviceConfiguration = issuedDeviceConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and frequency of access/use - includes errors for fraud detection 
   * @return usageLog
  **/

  public String getUsageLog() {
    return usageLog;
  }

  public void setUsageLog(String usageLog) {
    this.usageLog = usageLog;
  }


}

