package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentCaptureOutputModel
 */
public class BQReaderAssignmentCaptureOutputModel   {
  private BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord readerAssignmentInstanceRecord = null;

  private String readerAssignmentCaptureActionTaskReference = null;

  private Object readerAssignmentCaptureActionTaskRecord = null;

  private String readerAssignmentCaptureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reader Assignment instance capture service call 
   * @return readerAssignmentCaptureActionTaskReference
  **/

  public String getReaderAssignmentCaptureActionTaskReference() {
    return readerAssignmentCaptureActionTaskReference;
  }

  public void setReaderAssignmentCaptureActionTaskReference(String readerAssignmentCaptureActionTaskReference) {
    this.readerAssignmentCaptureActionTaskReference = readerAssignmentCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reader Assignment structured input transaction/record 
   * @return readerAssignmentCaptureRecordReference
  **/

  public String getReaderAssignmentCaptureRecordReference() {
    return readerAssignmentCaptureRecordReference;
  }

  public void setReaderAssignmentCaptureRecordReference(String readerAssignmentCaptureRecordReference) {
    this.readerAssignmentCaptureRecordReference = readerAssignmentCaptureRecordReference;
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

