package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceReport
 */
public class BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceReport   {
  private Object readerAssignmentInstanceReportRecord = null;

  private String readerAssignmentInstanceReportType = null;

  private String readerAssignmentInstanceReportParameters = null;

  private Object readerAssignmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return readerAssignmentInstanceReportRecord
  **/

  public Object getReaderAssignmentInstanceReportRecord() {
    return readerAssignmentInstanceReportRecord;
  }

  public void setReaderAssignmentInstanceReportRecord(Object readerAssignmentInstanceReportRecord) {
    this.readerAssignmentInstanceReportRecord = readerAssignmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return readerAssignmentInstanceReportType
  **/

  public String getReaderAssignmentInstanceReportType() {
    return readerAssignmentInstanceReportType;
  }

  public void setReaderAssignmentInstanceReportType(String readerAssignmentInstanceReportType) {
    this.readerAssignmentInstanceReportType = readerAssignmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return readerAssignmentInstanceReportParameters
  **/

  public String getReaderAssignmentInstanceReportParameters() {
    return readerAssignmentInstanceReportParameters;
  }

  public void setReaderAssignmentInstanceReportParameters(String readerAssignmentInstanceReportParameters) {
    this.readerAssignmentInstanceReportParameters = readerAssignmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return readerAssignmentInstanceReport
  **/

  public Object getReaderAssignmentInstanceReport() {
    return readerAssignmentInstanceReport;
  }

  public void setReaderAssignmentInstanceReport(Object readerAssignmentInstanceReport) {
    this.readerAssignmentInstanceReport = readerAssignmentInstanceReport;
  }


}

