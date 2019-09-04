package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceAnalysis;
import org.bian.dto.BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceRecord;
import org.bian.dto.BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentRetrieveOutputModel
 */
public class BQPasswordAssignmentRetrieveOutputModel   {
  private BQPasswordAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord = null;

  private String passwordAssignmentRetrieveActionTaskReference = null;

  private Object passwordAssignmentRetrieveActionTaskRecord = null;

  private String passwordAssignmentRetrieveActionResponse = null;

  private BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceReport passwordAssignmentInstanceReport = null;

  private BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceAnalysis passwordAssignmentInstanceAnalysis = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQPasswordAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQPasswordAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * Get passwordAssignmentInstanceRecord
   * @return passwordAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceRecord getPasswordAssignmentInstanceRecord() {
    return passwordAssignmentInstanceRecord;
  }

  public void setPasswordAssignmentInstanceRecord(BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord) {
    this.passwordAssignmentInstanceRecord = passwordAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Password Assignment instance retrieve service call 
   * @return passwordAssignmentRetrieveActionTaskReference
  **/

  public String getPasswordAssignmentRetrieveActionTaskReference() {
    return passwordAssignmentRetrieveActionTaskReference;
  }

  public void setPasswordAssignmentRetrieveActionTaskReference(String passwordAssignmentRetrieveActionTaskReference) {
    this.passwordAssignmentRetrieveActionTaskReference = passwordAssignmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return passwordAssignmentRetrieveActionTaskRecord
  **/

  public Object getPasswordAssignmentRetrieveActionTaskRecord() {
    return passwordAssignmentRetrieveActionTaskRecord;
  }

  public void setPasswordAssignmentRetrieveActionTaskRecord(Object passwordAssignmentRetrieveActionTaskRecord) {
    this.passwordAssignmentRetrieveActionTaskRecord = passwordAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return passwordAssignmentRetrieveActionResponse
  **/

  public String getPasswordAssignmentRetrieveActionResponse() {
    return passwordAssignmentRetrieveActionResponse;
  }

  public void setPasswordAssignmentRetrieveActionResponse(String passwordAssignmentRetrieveActionResponse) {
    this.passwordAssignmentRetrieveActionResponse = passwordAssignmentRetrieveActionResponse;
  }


  /**
   * Get passwordAssignmentInstanceReport
   * @return passwordAssignmentInstanceReport
  **/

  public BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceReport getPasswordAssignmentInstanceReport() {
    return passwordAssignmentInstanceReport;
  }

  public void setPasswordAssignmentInstanceReport(BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceReport passwordAssignmentInstanceReport) {
    this.passwordAssignmentInstanceReport = passwordAssignmentInstanceReport;
  }


  /**
   * Get passwordAssignmentInstanceAnalysis
   * @return passwordAssignmentInstanceAnalysis
  **/

  public BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceAnalysis getPasswordAssignmentInstanceAnalysis() {
    return passwordAssignmentInstanceAnalysis;
  }

  public void setPasswordAssignmentInstanceAnalysis(BQPasswordAssignmentRetrieveOutputModelPasswordAssignmentInstanceAnalysis passwordAssignmentInstanceAnalysis) {
    this.passwordAssignmentInstanceAnalysis = passwordAssignmentInstanceAnalysis;
  }


}

