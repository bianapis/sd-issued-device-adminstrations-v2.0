package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceAnalysis
 */
public class BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceAnalysis   {
  private Object passwordAssignmentInstanceAnalysisRecord = null;

  private String passwordAssignmentInstanceAnalysisReportType = null;

  private String passwordAssignmentInstanceAnalysisParameters = null;

  private Object passwordAssignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return passwordAssignmentInstanceAnalysisRecord
  **/

  public Object getPasswordAssignmentInstanceAnalysisRecord() {
    return passwordAssignmentInstanceAnalysisRecord;
  }

  public void setPasswordAssignmentInstanceAnalysisRecord(Object passwordAssignmentInstanceAnalysisRecord) {
    this.passwordAssignmentInstanceAnalysisRecord = passwordAssignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return passwordAssignmentInstanceAnalysisReportType
  **/

  public String getPasswordAssignmentInstanceAnalysisReportType() {
    return passwordAssignmentInstanceAnalysisReportType;
  }

  public void setPasswordAssignmentInstanceAnalysisReportType(String passwordAssignmentInstanceAnalysisReportType) {
    this.passwordAssignmentInstanceAnalysisReportType = passwordAssignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return passwordAssignmentInstanceAnalysisParameters
  **/

  public String getPasswordAssignmentInstanceAnalysisParameters() {
    return passwordAssignmentInstanceAnalysisParameters;
  }

  public void setPasswordAssignmentInstanceAnalysisParameters(String passwordAssignmentInstanceAnalysisParameters) {
    this.passwordAssignmentInstanceAnalysisParameters = passwordAssignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return passwordAssignmentInstanceAnalysisReport
  **/

  public Object getPasswordAssignmentInstanceAnalysisReport() {
    return passwordAssignmentInstanceAnalysisReport;
  }

  public void setPasswordAssignmentInstanceAnalysisReport(Object passwordAssignmentInstanceAnalysisReport) {
    this.passwordAssignmentInstanceAnalysisReport = passwordAssignmentInstanceAnalysisReport;
  }


}

