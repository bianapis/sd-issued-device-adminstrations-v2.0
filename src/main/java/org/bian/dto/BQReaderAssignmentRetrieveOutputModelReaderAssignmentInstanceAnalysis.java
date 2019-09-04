package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceAnalysis
 */
public class BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceAnalysis   {
  private Object readerAssignmentInstanceAnalysisRecord = null;

  private String readerAssignmentInstanceAnalysisReportType = null;

  private String readerAssignmentInstanceAnalysisParameters = null;

  private Object readerAssignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return readerAssignmentInstanceAnalysisRecord
  **/

  public Object getReaderAssignmentInstanceAnalysisRecord() {
    return readerAssignmentInstanceAnalysisRecord;
  }

  public void setReaderAssignmentInstanceAnalysisRecord(Object readerAssignmentInstanceAnalysisRecord) {
    this.readerAssignmentInstanceAnalysisRecord = readerAssignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return readerAssignmentInstanceAnalysisReportType
  **/

  public String getReaderAssignmentInstanceAnalysisReportType() {
    return readerAssignmentInstanceAnalysisReportType;
  }

  public void setReaderAssignmentInstanceAnalysisReportType(String readerAssignmentInstanceAnalysisReportType) {
    this.readerAssignmentInstanceAnalysisReportType = readerAssignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return readerAssignmentInstanceAnalysisParameters
  **/

  public String getReaderAssignmentInstanceAnalysisParameters() {
    return readerAssignmentInstanceAnalysisParameters;
  }

  public void setReaderAssignmentInstanceAnalysisParameters(String readerAssignmentInstanceAnalysisParameters) {
    this.readerAssignmentInstanceAnalysisParameters = readerAssignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return readerAssignmentInstanceAnalysisReport
  **/

  public Object getReaderAssignmentInstanceAnalysisReport() {
    return readerAssignmentInstanceAnalysisReport;
  }

  public void setReaderAssignmentInstanceAnalysisReport(Object readerAssignmentInstanceAnalysisReport) {
    this.readerAssignmentInstanceAnalysisReport = readerAssignmentInstanceAnalysisReport;
  }


}

