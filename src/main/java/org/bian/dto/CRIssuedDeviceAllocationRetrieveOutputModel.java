package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceAnalysis;
import org.bian.dto.CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationRetrieveOutputModel
 */
public class CRIssuedDeviceAllocationRetrieveOutputModel   {
  private CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationRetrieveActionTaskReference = null;

  private Object issuedDeviceAllocationRetrieveActionTaskRecord = null;

  private String issuedDeviceAllocationRetrieveActionResponse = null;

  private CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceReportRecord issuedDeviceAllocationInstanceReportRecord = null;

  private CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceAnalysis issuedDeviceAllocationInstanceAnalysis = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Issued Device Allocation instance retrieve service call 
   * @return issuedDeviceAllocationRetrieveActionTaskReference
  **/

  public String getIssuedDeviceAllocationRetrieveActionTaskReference() {
    return issuedDeviceAllocationRetrieveActionTaskReference;
  }

  public void setIssuedDeviceAllocationRetrieveActionTaskReference(String issuedDeviceAllocationRetrieveActionTaskReference) {
    this.issuedDeviceAllocationRetrieveActionTaskReference = issuedDeviceAllocationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return issuedDeviceAllocationRetrieveActionResponse
  **/

  public String getIssuedDeviceAllocationRetrieveActionResponse() {
    return issuedDeviceAllocationRetrieveActionResponse;
  }

  public void setIssuedDeviceAllocationRetrieveActionResponse(String issuedDeviceAllocationRetrieveActionResponse) {
    this.issuedDeviceAllocationRetrieveActionResponse = issuedDeviceAllocationRetrieveActionResponse;
  }


  /**
   * Get issuedDeviceAllocationInstanceReportRecord
   * @return issuedDeviceAllocationInstanceReportRecord
  **/

  public CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceReportRecord getIssuedDeviceAllocationInstanceReportRecord() {
    return issuedDeviceAllocationInstanceReportRecord;
  }

  public void setIssuedDeviceAllocationInstanceReportRecord(CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceReportRecord issuedDeviceAllocationInstanceReportRecord) {
    this.issuedDeviceAllocationInstanceReportRecord = issuedDeviceAllocationInstanceReportRecord;
  }


  /**
   * Get issuedDeviceAllocationInstanceAnalysis
   * @return issuedDeviceAllocationInstanceAnalysis
  **/

  public CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceAnalysis getIssuedDeviceAllocationInstanceAnalysis() {
    return issuedDeviceAllocationInstanceAnalysis;
  }

  public void setIssuedDeviceAllocationInstanceAnalysis(CRIssuedDeviceAllocationRetrieveOutputModelIssuedDeviceAllocationInstanceAnalysis issuedDeviceAllocationInstanceAnalysis) {
    this.issuedDeviceAllocationInstanceAnalysis = issuedDeviceAllocationInstanceAnalysis;
  }


}

