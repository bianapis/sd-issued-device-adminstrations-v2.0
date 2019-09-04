package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceReport
 */
public class BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceReport   {
  private Object questionAssignmentInstanceReportRecord = null;

  private String questionAssignmentInstanceReportType = null;

  private String questionAssignmentInstanceReportParameters = null;

  private Object questionAssignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return questionAssignmentInstanceReportRecord
  **/

  public Object getQuestionAssignmentInstanceReportRecord() {
    return questionAssignmentInstanceReportRecord;
  }

  public void setQuestionAssignmentInstanceReportRecord(Object questionAssignmentInstanceReportRecord) {
    this.questionAssignmentInstanceReportRecord = questionAssignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return questionAssignmentInstanceReportType
  **/

  public String getQuestionAssignmentInstanceReportType() {
    return questionAssignmentInstanceReportType;
  }

  public void setQuestionAssignmentInstanceReportType(String questionAssignmentInstanceReportType) {
    this.questionAssignmentInstanceReportType = questionAssignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return questionAssignmentInstanceReportParameters
  **/

  public String getQuestionAssignmentInstanceReportParameters() {
    return questionAssignmentInstanceReportParameters;
  }

  public void setQuestionAssignmentInstanceReportParameters(String questionAssignmentInstanceReportParameters) {
    this.questionAssignmentInstanceReportParameters = questionAssignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return questionAssignmentInstanceReport
  **/

  public Object getQuestionAssignmentInstanceReport() {
    return questionAssignmentInstanceReport;
  }

  public void setQuestionAssignmentInstanceReport(Object questionAssignmentInstanceReport) {
    this.questionAssignmentInstanceReport = questionAssignmentInstanceReport;
  }


}

