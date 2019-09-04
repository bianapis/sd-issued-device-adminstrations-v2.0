package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationControlOutputModel
 */
public class CRIssuedDeviceAllocationControlOutputModel   {
  private String issuedDeviceAllocationControlActionTaskReference = null;

  private Object issuedDeviceAllocationControlActionTaskRecord = null;

  private String issuedDeviceAllocationControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device Allocation instance control processing service call 
   * @return issuedDeviceAllocationControlActionTaskReference
  **/

  public String getIssuedDeviceAllocationControlActionTaskReference() {
    return issuedDeviceAllocationControlActionTaskReference;
  }

  public void setIssuedDeviceAllocationControlActionTaskReference(String issuedDeviceAllocationControlActionTaskReference) {
    this.issuedDeviceAllocationControlActionTaskReference = issuedDeviceAllocationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return issuedDeviceAllocationControlActionTaskRecord
  **/

  public Object getIssuedDeviceAllocationControlActionTaskRecord() {
    return issuedDeviceAllocationControlActionTaskRecord;
  }

  public void setIssuedDeviceAllocationControlActionTaskRecord(Object issuedDeviceAllocationControlActionTaskRecord) {
    this.issuedDeviceAllocationControlActionTaskRecord = issuedDeviceAllocationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return issuedDeviceAllocationControlActionResponse
  **/

  public String getIssuedDeviceAllocationControlActionResponse() {
    return issuedDeviceAllocationControlActionResponse;
  }

  public void setIssuedDeviceAllocationControlActionResponse(String issuedDeviceAllocationControlActionResponse) {
    this.issuedDeviceAllocationControlActionResponse = issuedDeviceAllocationControlActionResponse;
  }


}

