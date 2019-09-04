package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceAnalysis;
import org.bian.dto.BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentRetrieveInputModel
 */
public class BQQuestionAssignmentRetrieveInputModel   {
  private Object questionAssignmentRetrieveActionTaskRecord = null;

  private String questionAssignmentRetrieveActionRequest = null;

  private BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceReport questionAssignmentInstanceReport = null;

  private BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceAnalysis questionAssignmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return questionAssignmentRetrieveActionRequest
  **/

  public String getQuestionAssignmentRetrieveActionRequest() {
    return questionAssignmentRetrieveActionRequest;
  }

  public void setQuestionAssignmentRetrieveActionRequest(String questionAssignmentRetrieveActionRequest) {
    this.questionAssignmentRetrieveActionRequest = questionAssignmentRetrieveActionRequest;
  }


  /**
   * Get questionAssignmentInstanceReport
   * @return questionAssignmentInstanceReport
  **/

  public BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceReport getQuestionAssignmentInstanceReport() {
    return questionAssignmentInstanceReport;
  }

  public void setQuestionAssignmentInstanceReport(BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceReport questionAssignmentInstanceReport) {
    this.questionAssignmentInstanceReport = questionAssignmentInstanceReport;
  }


  /**
   * Get questionAssignmentInstanceAnalysis
   * @return questionAssignmentInstanceAnalysis
  **/

  public BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceAnalysis getQuestionAssignmentInstanceAnalysis() {
    return questionAssignmentInstanceAnalysis;
  }

  public void setQuestionAssignmentInstanceAnalysis(BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceAnalysis questionAssignmentInstanceAnalysis) {
    this.questionAssignmentInstanceAnalysis = questionAssignmentInstanceAnalysis;
  }


}

