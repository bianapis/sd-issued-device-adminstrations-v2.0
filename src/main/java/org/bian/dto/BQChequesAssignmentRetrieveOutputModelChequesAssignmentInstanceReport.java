package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceReport
 */
public class BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceReport   {
  private Object chequesAssignmentInstanceReportRecord = null;

  private String chequesAssignmentInstanceReportType = null;

  private String chequesAssignmentInstanceReportParameters = null;

  private Object chequesAssignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return chequesAssignmentInstanceReportRecord
  **/

  public Object getChequesAssignmentInstanceReportRecord() {
    return chequesAssignmentInstanceReportRecord;
  }

  public void setChequesAssignmentInstanceReportRecord(Object chequesAssignmentInstanceReportRecord) {
    this.chequesAssignmentInstanceReportRecord = chequesAssignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return chequesAssignmentInstanceReportType
  **/

  public String getChequesAssignmentInstanceReportType() {
    return chequesAssignmentInstanceReportType;
  }

  public void setChequesAssignmentInstanceReportType(String chequesAssignmentInstanceReportType) {
    this.chequesAssignmentInstanceReportType = chequesAssignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return chequesAssignmentInstanceReportParameters
  **/

  public String getChequesAssignmentInstanceReportParameters() {
    return chequesAssignmentInstanceReportParameters;
  }

  public void setChequesAssignmentInstanceReportParameters(String chequesAssignmentInstanceReportParameters) {
    this.chequesAssignmentInstanceReportParameters = chequesAssignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return chequesAssignmentInstanceReport
  **/

  public Object getChequesAssignmentInstanceReport() {
    return chequesAssignmentInstanceReport;
  }

  public void setChequesAssignmentInstanceReport(Object chequesAssignmentInstanceReport) {
    this.chequesAssignmentInstanceReport = chequesAssignmentInstanceReport;
  }


}

