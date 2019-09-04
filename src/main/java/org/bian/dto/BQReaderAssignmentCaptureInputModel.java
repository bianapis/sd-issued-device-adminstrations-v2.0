package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentCaptureInputModel
 */
public class BQReaderAssignmentCaptureInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String readerAssignmentInstanceReference = null;

  private BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord readerAssignmentInstanceRecord = null;

  private Object readerAssignmentCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reader Assignment instance 
   * @return readerAssignmentInstanceReference
  **/

  public String getReaderAssignmentInstanceReference() {
    return readerAssignmentInstanceReference;
  }

  public void setReaderAssignmentInstanceReference(String readerAssignmentInstanceReference) {
    this.readerAssignmentInstanceReference = readerAssignmentInstanceReference;
  }


  /**
   * Get readerAssignmentInstanceRecord
   * @return readerAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord getReaderAssignmentInstanceRecord() {
    return readerAssignmentInstanceRecord;
  }

  public void setReaderAssignmentInstanceRecord(BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord readerAssignmentInstanceRecord) {
    this.readerAssignmentInstanceRecord = readerAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return readerAssignmentCaptureActionTaskRecord
  **/

  public Object getReaderAssignmentCaptureActionTaskRecord() {
    return readerAssignmentCaptureActionTaskRecord;
  }

  public void setReaderAssignmentCaptureActionTaskRecord(Object readerAssignmentCaptureActionTaskRecord) {
    this.readerAssignmentCaptureActionTaskRecord = readerAssignmentCaptureActionTaskRecord;
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

