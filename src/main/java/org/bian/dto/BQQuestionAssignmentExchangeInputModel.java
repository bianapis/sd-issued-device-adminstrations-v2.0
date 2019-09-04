package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentExchangeInputModel
 */
public class BQQuestionAssignmentExchangeInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String questionAssignmentInstanceReference = null;

  private Object questionAssignmentExchangeActionTaskRecord = null;

  private CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest questionAssignmentExchangeActionRequest = null;


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
   * Get questionAssignmentExchangeActionRequest
   * @return questionAssignmentExchangeActionRequest
  **/

  public CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest getQuestionAssignmentExchangeActionRequest() {
    return questionAssignmentExchangeActionRequest;
  }

  public void setQuestionAssignmentExchangeActionRequest(CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest questionAssignmentExchangeActionRequest) {
    this.questionAssignmentExchangeActionRequest = questionAssignmentExchangeActionRequest;
  }


}

