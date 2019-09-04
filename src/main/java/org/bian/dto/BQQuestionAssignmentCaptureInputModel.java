package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentCaptureInputModel
 */
public class BQQuestionAssignmentCaptureInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String questionAssignmentInstanceReference = null;

  private BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord questionAssignmentInstanceRecord = null;

  private Object questionAssignmentCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Question Assignment instance 
   * @return questionAssignmentInstanceReference
  **/

  public String getQuestionAssignmentInstanceReference() {
    return questionAssignmentInstanceReference;
  }

  public void setQuestionAssignmentInstanceReference(String questionAssignmentInstanceReference) {
    this.questionAssignmentInstanceReference = questionAssignmentInstanceReference;
  }


  /**
   * Get questionAssignmentInstanceRecord
   * @return questionAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord getQuestionAssignmentInstanceRecord() {
    return questionAssignmentInstanceRecord;
  }

  public void setQuestionAssignmentInstanceRecord(BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord questionAssignmentInstanceRecord) {
    this.questionAssignmentInstanceRecord = questionAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return questionAssignmentCaptureActionTaskRecord
  **/

  public Object getQuestionAssignmentCaptureActionTaskRecord() {
    return questionAssignmentCaptureActionTaskRecord;
  }

  public void setQuestionAssignmentCaptureActionTaskRecord(Object questionAssignmentCaptureActionTaskRecord) {
    this.questionAssignmentCaptureActionTaskRecord = questionAssignmentCaptureActionTaskRecord;
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

