package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationExchangeOutputModel
 */
public class CRIssuedDeviceAllocationExchangeOutputModel   {
  private String issuedDeviceAllocationExchangeActionTaskReference = null;

  private Object issuedDeviceAllocationExchangeActionTaskRecord = null;

  private String issuedDeviceAllocationExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device Allocation instance exchange service call 
   * @return issuedDeviceAllocationExchangeActionTaskReference
  **/

  public String getIssuedDeviceAllocationExchangeActionTaskReference() {
    return issuedDeviceAllocationExchangeActionTaskReference;
  }

  public void setIssuedDeviceAllocationExchangeActionTaskReference(String issuedDeviceAllocationExchangeActionTaskReference) {
    this.issuedDeviceAllocationExchangeActionTaskReference = issuedDeviceAllocationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return issuedDeviceAllocationExchangeActionTaskRecord
  **/

  public Object getIssuedDeviceAllocationExchangeActionTaskRecord() {
    return issuedDeviceAllocationExchangeActionTaskRecord;
  }

  public void setIssuedDeviceAllocationExchangeActionTaskRecord(Object issuedDeviceAllocationExchangeActionTaskRecord) {
    this.issuedDeviceAllocationExchangeActionTaskRecord = issuedDeviceAllocationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return issuedDeviceAllocationExchangeActionResponse
  **/

  public String getIssuedDeviceAllocationExchangeActionResponse() {
    return issuedDeviceAllocationExchangeActionResponse;
  }

  public void setIssuedDeviceAllocationExchangeActionResponse(String issuedDeviceAllocationExchangeActionResponse) {
    this.issuedDeviceAllocationExchangeActionResponse = issuedDeviceAllocationExchangeActionResponse;
  }


}

