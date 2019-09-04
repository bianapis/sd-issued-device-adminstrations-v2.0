package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceAnalysis;
import org.bian.dto.BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceRecord;
import org.bian.dto.BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentRetrieveOutputModel
 */
public class BQQuestionAssignmentRetrieveOutputModel   {
  private BQQuestionAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord = null;

  private String questionAssignmentRetrieveActionTaskReference = null;

  private Object questionAssignmentRetrieveActionTaskRecord = null;

  private String questionAssignmentRetrieveActionResponse = null;

  private BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceReport questionAssignmentInstanceReport = null;

  private BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceAnalysis questionAssignmentInstanceAnalysis = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQQuestionAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQQuestionAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * Get questionAssignmentInstanceRecord
   * @return questionAssignmentInstanceRecord
  **/

  public BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceRecord getQuestionAssignmentInstanceRecord() {
    return questionAssignmentInstanceRecord;
  }

  public void setQuestionAssignmentInstanceRecord(BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceRecord questionAssignmentInstanceRecord) {
    this.questionAssignmentInstanceRecord = questionAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Question Assignment instance retrieve service call 
   * @return questionAssignmentRetrieveActionTaskReference
  **/

  public String getQuestionAssignmentRetrieveActionTaskReference() {
    return questionAssignmentRetrieveActionTaskReference;
  }

  public void setQuestionAssignmentRetrieveActionTaskReference(String questionAssignmentRetrieveActionTaskReference) {
    this.questionAssignmentRetrieveActionTaskReference = questionAssignmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return questionAssignmentRetrieveActionTaskRecord
  **/

  public Object getQuestionAssignmentRetrieveActionTaskRecord() {
    return questionAssignmentRetrieveActionTaskRecord;
  }

  public void setQuestionAssignmentRetrieveActionTaskRecord(Object questionAssignmentRetrieveActionTaskRecord) {
    this.questionAssignmentRetrieveActionTaskRecord = questionAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return questionAssignmentRetrieveActionResponse
  **/

  public String getQuestionAssignmentRetrieveActionResponse() {
    return questionAssignmentRetrieveActionResponse;
  }

  public void setQuestionAssignmentRetrieveActionResponse(String questionAssignmentRetrieveActionResponse) {
    this.questionAssignmentRetrieveActionResponse = questionAssignmentRetrieveActionResponse;
  }


  /**
   * Get questionAssignmentInstanceReport
   * @return questionAssignmentInstanceReport
  **/

  public BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceReport getQuestionAssignmentInstanceReport() {
    return questionAssignmentInstanceReport;
  }

  public void setQuestionAssignmentInstanceReport(BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceReport questionAssignmentInstanceReport) {
    this.questionAssignmentInstanceReport = questionAssignmentInstanceReport;
  }


  /**
   * Get questionAssignmentInstanceAnalysis
   * @return questionAssignmentInstanceAnalysis
  **/

  public BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceAnalysis getQuestionAssignmentInstanceAnalysis() {
    return questionAssignmentInstanceAnalysis;
  }

  public void setQuestionAssignmentInstanceAnalysis(BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceAnalysis questionAssignmentInstanceAnalysis) {
    this.questionAssignmentInstanceAnalysis = questionAssignmentInstanceAnalysis;
  }


}

