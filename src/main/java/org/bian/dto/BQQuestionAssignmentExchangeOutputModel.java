package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentExchangeOutputModel
 */
public class BQQuestionAssignmentExchangeOutputModel   {
  private String questionAssignmentExchangeActionTaskReference = null;

  private Object questionAssignmentExchangeActionTaskRecord = null;

  private String questionAssignmentExchangeActionResponse = null;

  private String questionAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Question Assignment instance exchange service call 
   * @return questionAssignmentExchangeActionTaskReference
  **/

  public String getQuestionAssignmentExchangeActionTaskReference() {
    return questionAssignmentExchangeActionTaskReference;
  }

  public void setQuestionAssignmentExchangeActionTaskReference(String questionAssignmentExchangeActionTaskReference) {
    this.questionAssignmentExchangeActionTaskReference = questionAssignmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return questionAssignmentExchangeActionTaskRecord
  **/

  public Object getQuestionAssignmentExchangeActionTaskRecord() {
    return questionAssignmentExchangeActionTaskRecord;
  }

  public void setQuestionAssignmentExchangeActionTaskRecord(Object questionAssignmentExchangeActionTaskRecord) {
    this.questionAssignmentExchangeActionTaskRecord = questionAssignmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return questionAssignmentExchangeActionResponse
  **/

  public String getQuestionAssignmentExchangeActionResponse() {
    return questionAssignmentExchangeActionResponse;
  }

  public void setQuestionAssignmentExchangeActionResponse(String questionAssignmentExchangeActionResponse) {
    this.questionAssignmentExchangeActionResponse = questionAssignmentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Question Assignment instance (e.g. accepted, rejected, verified) 
   * @return questionAssignmentInstanceStatus
  **/

  public String getQuestionAssignmentInstanceStatus() {
    return questionAssignmentInstanceStatus;
  }

  public void setQuestionAssignmentInstanceStatus(String questionAssignmentInstanceStatus) {
    this.questionAssignmentInstanceStatus = questionAssignmentInstanceStatus;
  }


}

