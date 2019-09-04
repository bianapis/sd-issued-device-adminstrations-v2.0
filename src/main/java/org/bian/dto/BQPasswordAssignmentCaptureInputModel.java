package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentCaptureInputModel
 */
public class BQPasswordAssignmentCaptureInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String passwordAssignmentInstanceReference = null;

  private BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord = null;

  private Object passwordAssignmentCaptureActionTaskRecord = null;

  private BQPasswordAssignmentCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord getPasswordAssignmentInstanceRecord() {
    return passwordAssignmentInstanceRecord;
  }

  public void setPasswordAssignmentInstanceRecord(BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord) {
    this.passwordAssignmentInstanceRecord = passwordAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return passwordAssignmentCaptureActionTaskRecord
  **/

  public Object getPasswordAssignmentCaptureActionTaskRecord() {
    return passwordAssignmentCaptureActionTaskRecord;
  }

  public void setPasswordAssignmentCaptureActionTaskRecord(Object passwordAssignmentCaptureActionTaskRecord) {
    this.passwordAssignmentCaptureActionTaskRecord = passwordAssignmentCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQPasswordAssignmentCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQPasswordAssignmentCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

