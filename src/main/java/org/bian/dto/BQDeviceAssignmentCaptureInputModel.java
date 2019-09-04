package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentCaptureInputModel
 */
public class BQDeviceAssignmentCaptureInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String deviceAssignmentInstanceReference = null;

  private BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord deviceAssignmentInstanceRecord = null;

  private Object deviceAssignmentCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Device Assignment instance 
   * @return deviceAssignmentInstanceReference
  **/

  public String getDeviceAssignmentInstanceReference() {
    return deviceAssignmentInstanceReference;
  }

  public void setDeviceAssignmentInstanceReference(String deviceAssignmentInstanceReference) {
    this.deviceAssignmentInstanceReference = deviceAssignmentInstanceReference;
  }


  /**
   * Get deviceAssignmentInstanceRecord
   * @return deviceAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord getDeviceAssignmentInstanceRecord() {
    return deviceAssignmentInstanceRecord;
  }

  public void setDeviceAssignmentInstanceRecord(BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord deviceAssignmentInstanceRecord) {
    this.deviceAssignmentInstanceRecord = deviceAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return deviceAssignmentCaptureActionTaskRecord
  **/

  public Object getDeviceAssignmentCaptureActionTaskRecord() {
    return deviceAssignmentCaptureActionTaskRecord;
  }

  public void setDeviceAssignmentCaptureActionTaskRecord(Object deviceAssignmentCaptureActionTaskRecord) {
    this.deviceAssignmentCaptureActionTaskRecord = deviceAssignmentCaptureActionTaskRecord;
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

