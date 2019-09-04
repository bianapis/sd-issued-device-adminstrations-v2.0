package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceReportRecord
 */
public class CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceReportRecord   {
  private String issuedDeviceAllocationInstanceReportReference = null;

  private String issuedDeviceAllocationInstanceReportType = null;

  private String issuedDeviceAllocationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return issuedDeviceAllocationInstanceReportReference
  **/

  public String getIssuedDeviceAllocationInstanceReportReference() {
    return issuedDeviceAllocationInstanceReportReference;
  }

  public void setIssuedDeviceAllocationInstanceReportReference(String issuedDeviceAllocationInstanceReportReference) {
    this.issuedDeviceAllocationInstanceReportReference = issuedDeviceAllocationInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return issuedDeviceAllocationInstanceReportParameters
  **/

  public String getIssuedDeviceAllocationInstanceReportParameters() {
    return issuedDeviceAllocationInstanceReportParameters;
  }

  public void setIssuedDeviceAllocationInstanceReportParameters(String issuedDeviceAllocationInstanceReportParameters) {
    this.issuedDeviceAllocationInstanceReportParameters = issuedDeviceAllocationInstanceReportParameters;
  }


}

