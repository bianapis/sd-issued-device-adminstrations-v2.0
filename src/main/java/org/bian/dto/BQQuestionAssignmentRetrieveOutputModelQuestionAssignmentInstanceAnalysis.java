package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceAnalysis
 */
public class BQQuestionAssignmentRetrieveOutputModelQuestionAssignmentInstanceAnalysis   {
  private Object questionAssignmentInstanceAnalysisRecord = null;

  private String questionAssignmentInstanceAnalysisReportType = null;

  private String questionAssignmentInstanceAnalysisParameters = null;

  private Object questionAssignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return questionAssignmentInstanceAnalysisRecord
  **/

  public Object getQuestionAssignmentInstanceAnalysisRecord() {
    return questionAssignmentInstanceAnalysisRecord;
  }

  public void setQuestionAssignmentInstanceAnalysisRecord(Object questionAssignmentInstanceAnalysisRecord) {
    this.questionAssignmentInstanceAnalysisRecord = questionAssignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return questionAssignmentInstanceAnalysisReportType
  **/

  public String getQuestionAssignmentInstanceAnalysisReportType() {
    return questionAssignmentInstanceAnalysisReportType;
  }

  public void setQuestionAssignmentInstanceAnalysisReportType(String questionAssignmentInstanceAnalysisReportType) {
    this.questionAssignmentInstanceAnalysisReportType = questionAssignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return questionAssignmentInstanceAnalysisParameters
  **/

  public String getQuestionAssignmentInstanceAnalysisParameters() {
    return questionAssignmentInstanceAnalysisParameters;
  }

  public void setQuestionAssignmentInstanceAnalysisParameters(String questionAssignmentInstanceAnalysisParameters) {
    this.questionAssignmentInstanceAnalysisParameters = questionAssignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return questionAssignmentInstanceAnalysisReport
  **/

  public Object getQuestionAssignmentInstanceAnalysisReport() {
    return questionAssignmentInstanceAnalysisReport;
  }

  public void setQuestionAssignmentInstanceAnalysisReport(Object questionAssignmentInstanceAnalysisReport) {
    this.questionAssignmentInstanceAnalysisReport = questionAssignmentInstanceAnalysisReport;
  }


}

