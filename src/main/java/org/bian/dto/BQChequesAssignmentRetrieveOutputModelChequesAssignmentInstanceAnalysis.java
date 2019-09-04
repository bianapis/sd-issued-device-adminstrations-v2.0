package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceAnalysis
 */
public class BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceAnalysis   {
  private Object chequesAssignmentInstanceAnalysisRecord = null;

  private String chequesAssignmentInstanceAnalysisReportType = null;

  private String chequesAssignmentInstanceAnalysisParameters = null;

  private Object chequesAssignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return chequesAssignmentInstanceAnalysisRecord
  **/

  public Object getChequesAssignmentInstanceAnalysisRecord() {
    return chequesAssignmentInstanceAnalysisRecord;
  }

  public void setChequesAssignmentInstanceAnalysisRecord(Object chequesAssignmentInstanceAnalysisRecord) {
    this.chequesAssignmentInstanceAnalysisRecord = chequesAssignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return chequesAssignmentInstanceAnalysisReportType
  **/

  public String getChequesAssignmentInstanceAnalysisReportType() {
    return chequesAssignmentInstanceAnalysisReportType;
  }

  public void setChequesAssignmentInstanceAnalysisReportType(String chequesAssignmentInstanceAnalysisReportType) {
    this.chequesAssignmentInstanceAnalysisReportType = chequesAssignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return chequesAssignmentInstanceAnalysisParameters
  **/

  public String getChequesAssignmentInstanceAnalysisParameters() {
    return chequesAssignmentInstanceAnalysisParameters;
  }

  public void setChequesAssignmentInstanceAnalysisParameters(String chequesAssignmentInstanceAnalysisParameters) {
    this.chequesAssignmentInstanceAnalysisParameters = chequesAssignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return chequesAssignmentInstanceAnalysisReport
  **/

  public Object getChequesAssignmentInstanceAnalysisReport() {
    return chequesAssignmentInstanceAnalysisReport;
  }

  public void setChequesAssignmentInstanceAnalysisReport(Object chequesAssignmentInstanceAnalysisReport) {
    this.chequesAssignmentInstanceAnalysisReport = chequesAssignmentInstanceAnalysisReport;
  }


}

