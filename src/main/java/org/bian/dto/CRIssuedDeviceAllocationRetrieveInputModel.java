package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceAnalysis;
import org.bian.dto.CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationRetrieveInputModel
 */
public class CRIssuedDeviceAllocationRetrieveInputModel   {
  private Object issuedDeviceAllocationRetrieveActionTaskRecord = null;

  private String issuedDeviceAllocationRetrieveActionRequest = null;

  private CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceReportRecord issuedDeviceAllocationInstanceReportRecord = null;

  private CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceAnalysis issuedDeviceAllocationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return issuedDeviceAllocationRetrieveActionTaskRecord
  **/

  public Object getIssuedDeviceAllocationRetrieveActionTaskRecord() {
    return issuedDeviceAllocationRetrieveActionTaskRecord;
  }

  public void setIssuedDeviceAllocationRetrieveActionTaskRecord(Object issuedDeviceAllocationRetrieveActionTaskRecord) {
    this.issuedDeviceAllocationRetrieveActionTaskRecord = issuedDeviceAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return issuedDeviceAllocationRetrieveActionRequest
  **/

  public String getIssuedDeviceAllocationRetrieveActionRequest() {
    return issuedDeviceAllocationRetrieveActionRequest;
  }

  public void setIssuedDeviceAllocationRetrieveActionRequest(String issuedDeviceAllocationRetrieveActionRequest) {
    this.issuedDeviceAllocationRetrieveActionRequest = issuedDeviceAllocationRetrieveActionRequest;
  }


  /**
   * Get issuedDeviceAllocationInstanceReportRecord
   * @return issuedDeviceAllocationInstanceReportRecord
  **/

  public CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceReportRecord getIssuedDeviceAllocationInstanceReportRecord() {
    return issuedDeviceAllocationInstanceReportRecord;
  }

  public void setIssuedDeviceAllocationInstanceReportRecord(CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceReportRecord issuedDeviceAllocationInstanceReportRecord) {
    this.issuedDeviceAllocationInstanceReportRecord = issuedDeviceAllocationInstanceReportRecord;
  }


  /**
   * Get issuedDeviceAllocationInstanceAnalysis
   * @return issuedDeviceAllocationInstanceAnalysis
  **/

  public CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceAnalysis getIssuedDeviceAllocationInstanceAnalysis() {
    return issuedDeviceAllocationInstanceAnalysis;
  }

  public void setIssuedDeviceAllocationInstanceAnalysis(CRIssuedDeviceAllocationRetrieveInputModelIssuedDeviceAllocationInstanceAnalysis issuedDeviceAllocationInstanceAnalysis) {
    this.issuedDeviceAllocationInstanceAnalysis = issuedDeviceAllocationInstanceAnalysis;
  }


}

