package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceAnalysis
 */
public class CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceAnalysis   {
  private String issuedDeviceAllocationInstanceAnalysisData = null;

  private String issuedDeviceAllocationInstanceAnalysisReportType = null;

  private Object issuedDeviceAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return issuedDeviceAllocationInstanceAnalysisData
  **/

  public String getIssuedDeviceAllocationInstanceAnalysisData() {
    return issuedDeviceAllocationInstanceAnalysisData;
  }

  public void setIssuedDeviceAllocationInstanceAnalysisData(String issuedDeviceAllocationInstanceAnalysisData) {
    this.issuedDeviceAllocationInstanceAnalysisData = issuedDeviceAllocationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return issuedDeviceAllocationInstanceAnalysisReportType
  **/

  public String getIssuedDeviceAllocationInstanceAnalysisReportType() {
    return issuedDeviceAllocationInstanceAnalysisReportType;
  }

  public void setIssuedDeviceAllocationInstanceAnalysisReportType(String issuedDeviceAllocationInstanceAnalysisReportType) {
    this.issuedDeviceAllocationInstanceAnalysisReportType = issuedDeviceAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return issuedDeviceAllocationInstanceAnalysisReport
  **/

  public Object getIssuedDeviceAllocationInstanceAnalysisReport() {
    return issuedDeviceAllocationInstanceAnalysisReport;
  }

  public void setIssuedDeviceAllocationInstanceAnalysisReport(Object issuedDeviceAllocationInstanceAnalysisReport) {
    this.issuedDeviceAllocationInstanceAnalysisReport = issuedDeviceAllocationInstanceAnalysisReport;
  }


}

