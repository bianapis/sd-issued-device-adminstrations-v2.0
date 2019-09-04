package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentControlOutputModel
 */
public class BQQuestionAssignmentControlOutputModel   {
  private String questionAssignmentControlActionTaskReference = null;

  private Object questionAssignmentControlActionTaskRecord = null;

  private String questionAssignmentControlActionResponse = null;

  private String questionAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Question Assignment instance control processing service call 
   * @return questionAssignmentControlActionTaskReference
  **/

  public String getQuestionAssignmentControlActionTaskReference() {
    return questionAssignmentControlActionTaskReference;
  }

  public void setQuestionAssignmentControlActionTaskReference(String questionAssignmentControlActionTaskReference) {
    this.questionAssignmentControlActionTaskReference = questionAssignmentControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return questionAssignmentControlActionTaskRecord
  **/

  public Object getQuestionAssignmentControlActionTaskRecord() {
    return questionAssignmentControlActionTaskRecord;
  }

  public void setQuestionAssignmentControlActionTaskRecord(Object questionAssignmentControlActionTaskRecord) {
    this.questionAssignmentControlActionTaskRecord = questionAssignmentControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return questionAssignmentControlActionResponse
  **/

  public String getQuestionAssignmentControlActionResponse() {
    return questionAssignmentControlActionResponse;
  }

  public void setQuestionAssignmentControlActionResponse(String questionAssignmentControlActionResponse) {
    this.questionAssignmentControlActionResponse = questionAssignmentControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Question Assignment instance (e.g. initialised, pending, active) 
   * @return questionAssignmentInstanceStatus
  **/

  public String getQuestionAssignmentInstanceStatus() {
    return questionAssignmentInstanceStatus;
  }

  public void setQuestionAssignmentInstanceStatus(String questionAssignmentInstanceStatus) {
    this.questionAssignmentInstanceStatus = questionAssignmentInstanceStatus;
  }


}

