package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationExchangeInputModel
 */
public class CRIssuedDeviceAllocationExchangeInputModel   {
  private String issuedDeviceAdministrationServicingSessionReference = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private Object issuedDeviceAllocationExchangeActionTaskRecord = null;

  private CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest issuedDeviceAllocationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return issuedDeviceAdministrationServicingSessionReference
  **/

  public String getIssuedDeviceAdministrationServicingSessionReference() {
    return issuedDeviceAdministrationServicingSessionReference;
  }

  public void setIssuedDeviceAdministrationServicingSessionReference(String issuedDeviceAdministrationServicingSessionReference) {
    this.issuedDeviceAdministrationServicingSessionReference = issuedDeviceAdministrationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device Allocation instance 
   * @return issuedDeviceAllocationInstanceReference
  **/

  public String getIssuedDeviceAllocationInstanceReference() {
    return issuedDeviceAllocationInstanceReference;
  }

  public void setIssuedDeviceAllocationInstanceReference(String issuedDeviceAllocationInstanceReference) {
    this.issuedDeviceAllocationInstanceReference = issuedDeviceAllocationInstanceReference;
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
   * Get issuedDeviceAllocationExchangeActionRequest
   * @return issuedDeviceAllocationExchangeActionRequest
  **/

  public CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest getIssuedDeviceAllocationExchangeActionRequest() {
    return issuedDeviceAllocationExchangeActionRequest;
  }

  public void setIssuedDeviceAllocationExchangeActionRequest(CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest issuedDeviceAllocationExchangeActionRequest) {
    this.issuedDeviceAllocationExchangeActionRequest = issuedDeviceAllocationExchangeActionRequest;
  }


}

