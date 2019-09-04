package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceAnalysis;
import org.bian.dto.BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentRetrieveInputModel
 */
public class BQPasswordAssignmentRetrieveInputModel   {
  private Object passwordAssignmentRetrieveActionTaskRecord = null;

  private String passwordAssignmentRetrieveActionRequest = null;

  private BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceReport passwordAssignmentInstanceReport = null;

  private BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceAnalysis passwordAssignmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return passwordAssignmentRetrieveActionTaskRecord
  **/

  public Object getPasswordAssignmentRetrieveActionTaskRecord() {
    return passwordAssignmentRetrieveActionTaskRecord;
  }

  public void setPasswordAssignmentRetrieveActionTaskRecord(Object passwordAssignmentRetrieveActionTaskRecord) {
    this.passwordAssignmentRetrieveActionTaskRecord = passwordAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return passwordAssignmentRetrieveActionRequest
  **/

  public String getPasswordAssignmentRetrieveActionRequest() {
    return passwordAssignmentRetrieveActionRequest;
  }

  public void setPasswordAssignmentRetrieveActionRequest(String passwordAssignmentRetrieveActionRequest) {
    this.passwordAssignmentRetrieveActionRequest = passwordAssignmentRetrieveActionRequest;
  }


  /**
   * Get passwordAssignmentInstanceReport
   * @return passwordAssignmentInstanceReport
  **/

  public BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceReport getPasswordAssignmentInstanceReport() {
    return passwordAssignmentInstanceReport;
  }

  public void setPasswordAssignmentInstanceReport(BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceReport passwordAssignmentInstanceReport) {
    this.passwordAssignmentInstanceReport = passwordAssignmentInstanceReport;
  }


  /**
   * Get passwordAssignmentInstanceAnalysis
   * @return passwordAssignmentInstanceAnalysis
  **/

  public BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceAnalysis getPasswordAssignmentInstanceAnalysis() {
    return passwordAssignmentInstanceAnalysis;
  }

  public void setPasswordAssignmentInstanceAnalysis(BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceAnalysis passwordAssignmentInstanceAnalysis) {
    this.passwordAssignmentInstanceAnalysis = passwordAssignmentInstanceAnalysis;
  }


}

