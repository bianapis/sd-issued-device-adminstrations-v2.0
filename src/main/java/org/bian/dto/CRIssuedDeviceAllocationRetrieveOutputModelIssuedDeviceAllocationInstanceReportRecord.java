package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceReportRecord
 */
public class CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceReportRecord   {
  private String issuedDeviceAllocationInstanceReportData = null;

  private String issuedDeviceAllocationInstanceReportType = null;

  private Object issuedDeviceAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return issuedDeviceAllocationInstanceReportData
  **/

  public String getIssuedDeviceAllocationInstanceReportData() {
    return issuedDeviceAllocationInstanceReportData;
  }

  public void setIssuedDeviceAllocationInstanceReportData(String issuedDeviceAllocationInstanceReportData) {
    this.issuedDeviceAllocationInstanceReportData = issuedDeviceAllocationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return issuedDeviceAllocationInstanceReportType
  **/

  public String getIssuedDeviceAllocationInstanceReportType() {
    return issuedDeviceAllocationInstanceReportType;
  }

  public void setIssuedDeviceAllocationInstanceReportType(String issuedDeviceAllocationInstanceReportType) {
    this.issuedDeviceAllocationInstanceReportType = issuedDeviceAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return issuedDeviceAllocationInstanceReport
  **/

  public Object getIssuedDeviceAllocationInstanceReport() {
    return issuedDeviceAllocationInstanceReport;
  }

  public void setIssuedDeviceAllocationInstanceReport(Object issuedDeviceAllocationInstanceReport) {
    this.issuedDeviceAllocationInstanceReport = issuedDeviceAllocationInstanceReport;
  }


}

