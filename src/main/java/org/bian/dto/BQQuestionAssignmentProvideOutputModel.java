package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQQuestionAssignmentProvideOutputModelQuestionAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentProvideOutputModel
 */
public class BQQuestionAssignmentProvideOutputModel   {
  private BQQuestionAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String questionAssignmentInstanceReference = null;

  private String questionAssignmentProvideActionReference = null;

  private Object questionAssignmentProvideActionRecord = null;

  private String questionAssignmentInstanceStatus = null;

  private BQQuestionAssignmentProvideOutputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQQuestionAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQQuestionAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Provide service call 
   * @return questionAssignmentProvideActionReference
  **/

  public String getQuestionAssignmentProvideActionReference() {
    return questionAssignmentProvideActionReference;
  }

  public void setQuestionAssignmentProvideActionReference(String questionAssignmentProvideActionReference) {
    this.questionAssignmentProvideActionReference = questionAssignmentProvideActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Provide service call input and output record 
   * @return questionAssignmentProvideActionRecord
  **/

  public Object getQuestionAssignmentProvideActionRecord() {
    return questionAssignmentProvideActionRecord;
  }

  public void setQuestionAssignmentProvideActionRecord(Object questionAssignmentProvideActionRecord) {
    this.questionAssignmentProvideActionRecord = questionAssignmentProvideActionRecord;
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


  /**
   * Get questionAssignmentInstanceRecord
   * @return questionAssignmentInstanceRecord
  **/

  public BQQuestionAssignmentProvideOutputModelQuestionAssignmentInstanceRecord getQuestionAssignmentInstanceRecord() {
    return questionAssignmentInstanceRecord;
  }

  public void setQuestionAssignmentInstanceRecord(BQQuestionAssignmentProvideOutputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord) {
    this.questionAssignmentInstanceRecord = questionAssignmentInstanceRecord;
  }


}

