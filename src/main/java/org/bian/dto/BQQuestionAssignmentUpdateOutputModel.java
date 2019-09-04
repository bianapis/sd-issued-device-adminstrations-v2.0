package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQQuestionAssignmentUpdateInputModelQuestionAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentUpdateOutputModel
 */
public class BQQuestionAssignmentUpdateOutputModel   {
  private BQQuestionAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQQuestionAssignmentUpdateInputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord = null;

  private String questionAssignmentUpdateActionTaskReference = null;

  private Object questionAssignmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return questionAssignmentUpdateActionTaskReference
  **/

  public String getQuestionAssignmentUpdateActionTaskReference() {
    return questionAssignmentUpdateActionTaskReference;
  }

  public void setQuestionAssignmentUpdateActionTaskReference(String questionAssignmentUpdateActionTaskReference) {
    this.questionAssignmentUpdateActionTaskReference = questionAssignmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

