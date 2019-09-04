package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQPasswordAssignmentUpdateInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentUpdateInputModel
 */
public class BQPasswordAssignmentUpdateInputModel   {
  private BQPasswordAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private String passwordAssignmentInstanceReference = null;

  private BQPasswordAssignmentUpdateInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord = null;

  private Object passwordAssignmentUpdateActionTaskRecord = null;

  private String passwordAssignmentUpdateActionRequest = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQPasswordAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQPasswordAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


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
   * Get passwordAssignmentInstanceRecord
   * @return passwordAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentUpdateInputModelPasswordAssignmentInstanceRecord getPasswordAssignmentInstanceRecord() {
    return passwordAssignmentInstanceRecord;
  }

  public void setPasswordAssignmentInstanceRecord(BQPasswordAssignmentUpdateInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord) {
    this.passwordAssignmentInstanceRecord = passwordAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return passwordAssignmentUpdateActionTaskRecord
  **/

  public Object getPasswordAssignmentUpdateActionTaskRecord() {
    return passwordAssignmentUpdateActionTaskRecord;
  }

  public void setPasswordAssignmentUpdateActionTaskRecord(Object passwordAssignmentUpdateActionTaskRecord) {
    this.passwordAssignmentUpdateActionTaskRecord = passwordAssignmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return passwordAssignmentUpdateActionRequest
  **/

  public String getPasswordAssignmentUpdateActionRequest() {
    return passwordAssignmentUpdateActionRequest;
  }

  public void setPasswordAssignmentUpdateActionRequest(String passwordAssignmentUpdateActionRequest) {
    this.passwordAssignmentUpdateActionRequest = passwordAssignmentUpdateActionRequest;
  }


}

