package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQQuestionAssignmentProvideInputModelQuestionAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentProvideInputModel
 */
public class BQQuestionAssignmentProvideInputModel   {
  private BQQuestionAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private Object questionAssignmentProvideActionRecord = null;

  private BQQuestionAssignmentProvideInputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQQuestionAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQQuestionAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
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
   * Get questionAssignmentInstanceRecord
   * @return questionAssignmentInstanceRecord
  **/

  public BQQuestionAssignmentProvideInputModelQuestionAssignmentInstanceRecord getQuestionAssignmentInstanceRecord() {
    return questionAssignmentInstanceRecord;
  }

  public void setQuestionAssignmentInstanceRecord(BQQuestionAssignmentProvideInputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord) {
    this.questionAssignmentInstanceRecord = questionAssignmentInstanceRecord;
  }


}

