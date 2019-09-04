package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceAnalysis
 */
public class BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceAnalysis   {
  private Object deviceAssignmentInstanceAnalysisRecord = null;

  private String deviceAssignmentInstanceAnalysisReportType = null;

  private String deviceAssignmentInstanceAnalysisParameters = null;

  private Object deviceAssignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return deviceAssignmentInstanceAnalysisRecord
  **/

  public Object getDeviceAssignmentInstanceAnalysisRecord() {
    return deviceAssignmentInstanceAnalysisRecord;
  }

  public void setDeviceAssignmentInstanceAnalysisRecord(Object deviceAssignmentInstanceAnalysisRecord) {
    this.deviceAssignmentInstanceAnalysisRecord = deviceAssignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return deviceAssignmentInstanceAnalysisReportType
  **/

  public String getDeviceAssignmentInstanceAnalysisReportType() {
    return deviceAssignmentInstanceAnalysisReportType;
  }

  public void setDeviceAssignmentInstanceAnalysisReportType(String deviceAssignmentInstanceAnalysisReportType) {
    this.deviceAssignmentInstanceAnalysisReportType = deviceAssignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return deviceAssignmentInstanceAnalysisParameters
  **/

  public String getDeviceAssignmentInstanceAnalysisParameters() {
    return deviceAssignmentInstanceAnalysisParameters;
  }

  public void setDeviceAssignmentInstanceAnalysisParameters(String deviceAssignmentInstanceAnalysisParameters) {
    this.deviceAssignmentInstanceAnalysisParameters = deviceAssignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return deviceAssignmentInstanceAnalysisReport
  **/

  public Object getDeviceAssignmentInstanceAnalysisReport() {
    return deviceAssignmentInstanceAnalysisReport;
  }

  public void setDeviceAssignmentInstanceAnalysisReport(Object deviceAssignmentInstanceAnalysisReport) {
    this.deviceAssignmentInstanceAnalysisReport = deviceAssignmentInstanceAnalysisReport;
  }


}

