package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceAnalysis
 */
public class BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceAnalysis   {
  private Object biometricAssignmentInstanceAnalysisRecord = null;

  private String biometricAssignmentInstanceAnalysisReportType = null;

  private String biometricAssignmentInstanceAnalysisParameters = null;

  private Object biometricAssignmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return biometricAssignmentInstanceAnalysisRecord
  **/

  public Object getBiometricAssignmentInstanceAnalysisRecord() {
    return biometricAssignmentInstanceAnalysisRecord;
  }

  public void setBiometricAssignmentInstanceAnalysisRecord(Object biometricAssignmentInstanceAnalysisRecord) {
    this.biometricAssignmentInstanceAnalysisRecord = biometricAssignmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return biometricAssignmentInstanceAnalysisReportType
  **/

  public String getBiometricAssignmentInstanceAnalysisReportType() {
    return biometricAssignmentInstanceAnalysisReportType;
  }

  public void setBiometricAssignmentInstanceAnalysisReportType(String biometricAssignmentInstanceAnalysisReportType) {
    this.biometricAssignmentInstanceAnalysisReportType = biometricAssignmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return biometricAssignmentInstanceAnalysisParameters
  **/

  public String getBiometricAssignmentInstanceAnalysisParameters() {
    return biometricAssignmentInstanceAnalysisParameters;
  }

  public void setBiometricAssignmentInstanceAnalysisParameters(String biometricAssignmentInstanceAnalysisParameters) {
    this.biometricAssignmentInstanceAnalysisParameters = biometricAssignmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return biometricAssignmentInstanceAnalysisReport
  **/

  public Object getBiometricAssignmentInstanceAnalysisReport() {
    return biometricAssignmentInstanceAnalysisReport;
  }

  public void setBiometricAssignmentInstanceAnalysisReport(Object biometricAssignmentInstanceAnalysisReport) {
    this.biometricAssignmentInstanceAnalysisReport = biometricAssignmentInstanceAnalysisReport;
  }


}

