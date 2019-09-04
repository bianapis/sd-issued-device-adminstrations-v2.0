package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceAnalysis
 */
public class CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceAnalysis   {
  private String issuedDeviceAllocationInstanceAnalysisReference = null;

  private String issuedDeviceAllocationInstanceAnalysisReportType = null;

  private String issuedDeviceAllocationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return issuedDeviceAllocationInstanceAnalysisReference
  **/

  public String getIssuedDeviceAllocationInstanceAnalysisReference() {
    return issuedDeviceAllocationInstanceAnalysisReference;
  }

  public void setIssuedDeviceAllocationInstanceAnalysisReference(String issuedDeviceAllocationInstanceAnalysisReference) {
    this.issuedDeviceAllocationInstanceAnalysisReference = issuedDeviceAllocationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return issuedDeviceAllocationInstanceAnalysisParameters
  **/

  public String getIssuedDeviceAllocationInstanceAnalysisParameters() {
    return issuedDeviceAllocationInstanceAnalysisParameters;
  }

  public void setIssuedDeviceAllocationInstanceAnalysisParameters(String issuedDeviceAllocationInstanceAnalysisParameters) {
    this.issuedDeviceAllocationInstanceAnalysisParameters = issuedDeviceAllocationInstanceAnalysisParameters;
  }


}

