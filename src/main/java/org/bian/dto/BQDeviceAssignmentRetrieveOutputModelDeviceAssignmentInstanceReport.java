package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceReport
 */
public class BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceReport   {
  private Object deviceAssignmentInstanceReportRecord = null;

  private String deviceAssignmentInstanceReportType = null;

  private String deviceAssignmentInstanceReportParameters = null;

  private Object deviceAssignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return deviceAssignmentInstanceReportRecord
  **/

  public Object getDeviceAssignmentInstanceReportRecord() {
    return deviceAssignmentInstanceReportRecord;
  }

  public void setDeviceAssignmentInstanceReportRecord(Object deviceAssignmentInstanceReportRecord) {
    this.deviceAssignmentInstanceReportRecord = deviceAssignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return deviceAssignmentInstanceReportType
  **/

  public String getDeviceAssignmentInstanceReportType() {
    return deviceAssignmentInstanceReportType;
  }

  public void setDeviceAssignmentInstanceReportType(String deviceAssignmentInstanceReportType) {
    this.deviceAssignmentInstanceReportType = deviceAssignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return deviceAssignmentInstanceReportParameters
  **/

  public String getDeviceAssignmentInstanceReportParameters() {
    return deviceAssignmentInstanceReportParameters;
  }

  public void setDeviceAssignmentInstanceReportParameters(String deviceAssignmentInstanceReportParameters) {
    this.deviceAssignmentInstanceReportParameters = deviceAssignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return deviceAssignmentInstanceReport
  **/

  public Object getDeviceAssignmentInstanceReport() {
    return deviceAssignmentInstanceReport;
  }

  public void setDeviceAssignmentInstanceReport(Object deviceAssignmentInstanceReport) {
    this.deviceAssignmentInstanceReport = deviceAssignmentInstanceReport;
  }


}

