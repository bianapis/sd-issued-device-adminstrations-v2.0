package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceReport
 */
public class BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceReport   {
  private Object biometricAssignmentInstanceReportRecord = null;

  private String biometricAssignmentInstanceReportType = null;

  private String biometricAssignmentInstanceReportParameters = null;

  private Object biometricAssignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return biometricAssignmentInstanceReportRecord
  **/

  public Object getBiometricAssignmentInstanceReportRecord() {
    return biometricAssignmentInstanceReportRecord;
  }

  public void setBiometricAssignmentInstanceReportRecord(Object biometricAssignmentInstanceReportRecord) {
    this.biometricAssignmentInstanceReportRecord = biometricAssignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return biometricAssignmentInstanceReportType
  **/

  public String getBiometricAssignmentInstanceReportType() {
    return biometricAssignmentInstanceReportType;
  }

  public void setBiometricAssignmentInstanceReportType(String biometricAssignmentInstanceReportType) {
    this.biometricAssignmentInstanceReportType = biometricAssignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return biometricAssignmentInstanceReportParameters
  **/

  public String getBiometricAssignmentInstanceReportParameters() {
    return biometricAssignmentInstanceReportParameters;
  }

  public void setBiometricAssignmentInstanceReportParameters(String biometricAssignmentInstanceReportParameters) {
    this.biometricAssignmentInstanceReportParameters = biometricAssignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return biometricAssignmentInstanceReport
  **/

  public Object getBiometricAssignmentInstanceReport() {
    return biometricAssignmentInstanceReport;
  }

  public void setBiometricAssignmentInstanceReport(Object biometricAssignmentInstanceReport) {
    this.biometricAssignmentInstanceReport = biometricAssignmentInstanceReport;
  }


}

