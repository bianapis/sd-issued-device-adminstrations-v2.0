package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentCaptureOutputModel
 */
public class BQQuestionAssignmentCaptureOutputModel   {
  private BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord questionAssignmentInstanceRecord = null;

  private String questionAssignmentCaptureActionTaskReference = null;

  private Object questionAssignmentCaptureActionTaskRecord = null;

  private String questionAssignmentCaptureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Question Assignment instance capture service call 
   * @return questionAssignmentCaptureActionTaskReference
  **/

  public String getQuestionAssignmentCaptureActionTaskReference() {
    return questionAssignmentCaptureActionTaskReference;
  }

  public void setQuestionAssignmentCaptureActionTaskReference(String questionAssignmentCaptureActionTaskReference) {
    this.questionAssignmentCaptureActionTaskReference = questionAssignmentCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Question Assignment structured input transaction/record 
   * @return questionAssignmentCaptureRecordReference
  **/

  public String getQuestionAssignmentCaptureRecordReference() {
    return questionAssignmentCaptureRecordReference;
  }

  public void setQuestionAssignmentCaptureRecordReference(String questionAssignmentCaptureRecordReference) {
    this.questionAssignmentCaptureRecordReference = questionAssignmentCaptureRecordReference;
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

