package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceReport
 */
public class BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceReport   {
  private Object passwordAssignmentInstanceReportRecord = null;

  private String passwordAssignmentInstanceReportType = null;

  private String passwordAssignmentInstanceReportParameters = null;

  private Object passwordAssignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return passwordAssignmentInstanceReportRecord
  **/

  public Object getPasswordAssignmentInstanceReportRecord() {
    return passwordAssignmentInstanceReportRecord;
  }

  public void setPasswordAssignmentInstanceReportRecord(Object passwordAssignmentInstanceReportRecord) {
    this.passwordAssignmentInstanceReportRecord = passwordAssignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return passwordAssignmentInstanceReportType
  **/

  public String getPasswordAssignmentInstanceReportType() {
    return passwordAssignmentInstanceReportType;
  }

  public void setPasswordAssignmentInstanceReportType(String passwordAssignmentInstanceReportType) {
    this.passwordAssignmentInstanceReportType = passwordAssignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return passwordAssignmentInstanceReportParameters
  **/

  public String getPasswordAssignmentInstanceReportParameters() {
    return passwordAssignmentInstanceReportParameters;
  }

  public void setPasswordAssignmentInstanceReportParameters(String passwordAssignmentInstanceReportParameters) {
    this.passwordAssignmentInstanceReportParameters = passwordAssignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return passwordAssignmentInstanceReport
  **/

  public Object getPasswordAssignmentInstanceReport() {
    return passwordAssignmentInstanceReport;
  }

  public void setPasswordAssignmentInstanceReport(Object passwordAssignmentInstanceReport) {
    this.passwordAssignmentInstanceReport = passwordAssignmentInstanceReport;
  }


}

