package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQQuestionAssignmentUpdateInputModelQuestionAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentUpdateInputModel
 */
public class BQQuestionAssignmentUpdateInputModel   {
  private BQQuestionAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private String questionAssignmentInstanceReference = null;

  private BQQuestionAssignmentUpdateInputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord = null;

  private Object questionAssignmentUpdateActionTaskRecord = null;

  private String questionAssignmentUpdateActionRequest = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQQuestionAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQQuestionAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


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

  public BQQuestionAssignmentUpdateInputModelQuestionAssignmentInstanceRecord getQuestionAssignmentInstanceRecord() {
    return questionAssignmentInstanceRecord;
  }

  public void setQuestionAssignmentInstanceRecord(BQQuestionAssignmentUpdateInputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord) {
    this.questionAssignmentInstanceRecord = questionAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return questionAssignmentUpdateActionTaskRecord
  **/

  public Object getQuestionAssignmentUpdateActionTaskRecord() {
    return questionAssignmentUpdateActionTaskRecord;
  }

  public void setQuestionAssignmentUpdateActionTaskRecord(Object questionAssignmentUpdateActionTaskRecord) {
    this.questionAssignmentUpdateActionTaskRecord = questionAssignmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return questionAssignmentUpdateActionRequest
  **/

  public String getQuestionAssignmentUpdateActionRequest() {
    return questionAssignmentUpdateActionRequest;
  }

  public void setQuestionAssignmentUpdateActionRequest(String questionAssignmentUpdateActionRequest) {
    this.questionAssignmentUpdateActionRequest = questionAssignmentUpdateActionRequest;
  }


}

