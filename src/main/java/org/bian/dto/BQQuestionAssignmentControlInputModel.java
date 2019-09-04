package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentControlInputModel
 */
public class BQQuestionAssignmentControlInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String questionAssignmentInstanceReference = null;

  private Object questionAssignmentControlActionTaskRecord = null;

  private CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest questionAssignmentControlActionRequest = null;


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
   * Get questionAssignmentControlActionRequest
   * @return questionAssignmentControlActionRequest
  **/

  public CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest getQuestionAssignmentControlActionRequest() {
    return questionAssignmentControlActionRequest;
  }

  public void setQuestionAssignmentControlActionRequest(CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest questionAssignmentControlActionRequest) {
    this.questionAssignmentControlActionRequest = questionAssignmentControlActionRequest;
  }


}

