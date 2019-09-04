package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceAnalysis;
import org.bian.dto.BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceReport;
import org.bian.dto.BQChequesAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentRetrieveOutputModel
 */
public class BQChequesAssignmentRetrieveOutputModel   {
  private BQChequesAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private Object chequesAssignmentInstanceRecord = null;

  private String chequesAssignmentRetrieveActionTaskReference = null;

  private Object chequesAssignmentRetrieveActionTaskRecord = null;

  private String chequesAssignmentRetrieveActionResponse = null;

  private BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceReport chequesAssignmentInstanceReport = null;

  private BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceAnalysis chequesAssignmentInstanceAnalysis = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQChequesAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQChequesAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Handles the issuance of cheques or checks as numbered and tracked devices issuedDeviceTemplateValues:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Cheque template (e.g. customer account/branch reference, print image/personalization) issueLocation:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The delivery address for distribution sequenceNumber:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The tracked sequence numbering (e.g. cheque number range issued)  
   * @return chequesAssignmentInstanceRecord
  **/

  public Object getChequesAssignmentInstanceRecord() {
    return chequesAssignmentInstanceRecord;
  }

  public void setChequesAssignmentInstanceRecord(Object chequesAssignmentInstanceRecord) {
    this.chequesAssignmentInstanceRecord = chequesAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cheques Assignment instance retrieve service call 
   * @return chequesAssignmentRetrieveActionTaskReference
  **/

  public String getChequesAssignmentRetrieveActionTaskReference() {
    return chequesAssignmentRetrieveActionTaskReference;
  }

  public void setChequesAssignmentRetrieveActionTaskReference(String chequesAssignmentRetrieveActionTaskReference) {
    this.chequesAssignmentRetrieveActionTaskReference = chequesAssignmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return chequesAssignmentRetrieveActionTaskRecord
  **/

  public Object getChequesAssignmentRetrieveActionTaskRecord() {
    return chequesAssignmentRetrieveActionTaskRecord;
  }

  public void setChequesAssignmentRetrieveActionTaskRecord(Object chequesAssignmentRetrieveActionTaskRecord) {
    this.chequesAssignmentRetrieveActionTaskRecord = chequesAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return chequesAssignmentRetrieveActionResponse
  **/

  public String getChequesAssignmentRetrieveActionResponse() {
    return chequesAssignmentRetrieveActionResponse;
  }

  public void setChequesAssignmentRetrieveActionResponse(String chequesAssignmentRetrieveActionResponse) {
    this.chequesAssignmentRetrieveActionResponse = chequesAssignmentRetrieveActionResponse;
  }


  /**
   * Get chequesAssignmentInstanceReport
   * @return chequesAssignmentInstanceReport
  **/

  public BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceReport getChequesAssignmentInstanceReport() {
    return chequesAssignmentInstanceReport;
  }

  public void setChequesAssignmentInstanceReport(BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceReport chequesAssignmentInstanceReport) {
    this.chequesAssignmentInstanceReport = chequesAssignmentInstanceReport;
  }


  /**
   * Get chequesAssignmentInstanceAnalysis
   * @return chequesAssignmentInstanceAnalysis
  **/

  public BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceAnalysis getChequesAssignmentInstanceAnalysis() {
    return chequesAssignmentInstanceAnalysis;
  }

  public void setChequesAssignmentInstanceAnalysis(BQChequesAssignmentRetrieveOutputModelChequesAssignmentInstanceAnalysis chequesAssignmentInstanceAnalysis) {
    this.chequesAssignmentInstanceAnalysis = chequesAssignmentInstanceAnalysis;
  }


}

