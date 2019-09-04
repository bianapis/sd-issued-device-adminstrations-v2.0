package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentCaptureOutputModel
 */
public class BQPasswordAssignmentCaptureOutputModel   {
  private BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord = null;

  private String passwordAssignmentCaptureActionTaskReference = null;

  private Object passwordAssignmentCaptureActionTaskRecord = null;

  private String passwordAssignmentCaptureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Password Assignment instance capture service call 
   * @return passwordAssignmentCaptureActionTaskReference
  **/

  public String getPasswordAssignmentCaptureActionTaskReference() {
    return passwordAssignmentCaptureActionTaskReference;
  }

  public void setPasswordAssignmentCaptureActionTaskReference(String passwordAssignmentCaptureActionTaskReference) {
    this.passwordAssignmentCaptureActionTaskReference = passwordAssignmentCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Password Assignment structured input transaction/record 
   * @return passwordAssignmentCaptureRecordReference
  **/

  public String getPasswordAssignmentCaptureRecordReference() {
    return passwordAssignmentCaptureRecordReference;
  }

  public void setPasswordAssignmentCaptureRecordReference(String passwordAssignmentCaptureRecordReference) {
    this.passwordAssignmentCaptureRecordReference = passwordAssignmentCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

