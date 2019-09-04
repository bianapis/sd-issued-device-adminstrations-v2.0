package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentExchangeInputModel
 */
public class BQChequesAssignmentExchangeInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String chequesAssignmentInstanceReference = null;

  private Object chequesAssignmentExchangeActionTaskRecord = null;

  private CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest chequesAssignmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Issued Device Allocation instance 
   * @return issuedDeviceAllocationInstanceReference
  **/

  public String getIssuedDeviceAllocationInstanceReference() {
    return issuedDeviceAllocationInstanceReference;
  }

  public void setIssuedDeviceAllocationInstanceReference(String issuedDeviceAllocationInstanceReference) {
    this.issuedDeviceAllocationInstanceReference = issuedDeviceAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cheques Assignment instance 
   * @return chequesAssignmentInstanceReference
  **/

  public String getChequesAssignmentInstanceReference() {
    return chequesAssignmentInstanceReference;
  }

  public void setChequesAssignmentInstanceReference(String chequesAssignmentInstanceReference) {
    this.chequesAssignmentInstanceReference = chequesAssignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return chequesAssignmentExchangeActionTaskRecord
  **/

  public Object getChequesAssignmentExchangeActionTaskRecord() {
    return chequesAssignmentExchangeActionTaskRecord;
  }

  public void setChequesAssignmentExchangeActionTaskRecord(Object chequesAssignmentExchangeActionTaskRecord) {
    this.chequesAssignmentExchangeActionTaskRecord = chequesAssignmentExchangeActionTaskRecord;
  }


  /**
   * Get chequesAssignmentExchangeActionRequest
   * @return chequesAssignmentExchangeActionRequest
  **/

  public CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest getChequesAssignmentExchangeActionRequest() {
    return chequesAssignmentExchangeActionRequest;
  }

  public void setChequesAssignmentExchangeActionRequest(CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest chequesAssignmentExchangeActionRequest) {
    this.chequesAssignmentExchangeActionRequest = chequesAssignmentExchangeActionRequest;
  }


}

