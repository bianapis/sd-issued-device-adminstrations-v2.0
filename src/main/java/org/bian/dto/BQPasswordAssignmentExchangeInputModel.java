package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentExchangeInputModel
 */
public class BQPasswordAssignmentExchangeInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String passwordAssignmentInstanceReference = null;

  private Object passwordAssignmentExchangeActionTaskRecord = null;

  private CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest passwordAssignmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Password Assignment instance 
   * @return passwordAssignmentInstanceReference
  **/

  public String getPasswordAssignmentInstanceReference() {
    return passwordAssignmentInstanceReference;
  }

  public void setPasswordAssignmentInstanceReference(String passwordAssignmentInstanceReference) {
    this.passwordAssignmentInstanceReference = passwordAssignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return passwordAssignmentExchangeActionTaskRecord
  **/

  public Object getPasswordAssignmentExchangeActionTaskRecord() {
    return passwordAssignmentExchangeActionTaskRecord;
  }

  public void setPasswordAssignmentExchangeActionTaskRecord(Object passwordAssignmentExchangeActionTaskRecord) {
    this.passwordAssignmentExchangeActionTaskRecord = passwordAssignmentExchangeActionTaskRecord;
  }


  /**
   * Get passwordAssignmentExchangeActionRequest
   * @return passwordAssignmentExchangeActionRequest
  **/

  public CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest getPasswordAssignmentExchangeActionRequest() {
    return passwordAssignmentExchangeActionRequest;
  }

  public void setPasswordAssignmentExchangeActionRequest(CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest passwordAssignmentExchangeActionRequest) {
    this.passwordAssignmentExchangeActionRequest = passwordAssignmentExchangeActionRequest;
  }


}

