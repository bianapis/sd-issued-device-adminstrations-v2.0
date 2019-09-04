package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChequesAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentProvideOutputModel
 */
public class BQChequesAssignmentProvideOutputModel   {
  private BQChequesAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String chequesAssignmentInstanceReference = null;

  private String chequesAssignmentProvideActionReference = null;

  private Object chequesAssignmentProvideActionRecord = null;

  private String chequesAssignmentInstanceStatus = null;

  private Object chequesAssignmentInstanceRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQChequesAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQChequesAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cheques Assignment instance 
   * @return chequesAssignmentInstanceReference
  **/

  public String getChequesAssignmentInstanceReference() {
    return chequesAssignmentInstanceReference;
  }

  public void setChequesAssignmentInstanceReference(String chequesAssignmentInstanceReference) {
    this.chequesAssignmentInstanceReference = chequesAssignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Provide service call 
   * @return chequesAssignmentProvideActionReference
  **/

  public String getChequesAssignmentProvideActionReference() {
    return chequesAssignmentProvideActionReference;
  }

  public void setChequesAssignmentProvideActionReference(String chequesAssignmentProvideActionReference) {
    this.chequesAssignmentProvideActionReference = chequesAssignmentProvideActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Provide service call input and output record 
   * @return chequesAssignmentProvideActionRecord
  **/

  public Object getChequesAssignmentProvideActionRecord() {
    return chequesAssignmentProvideActionRecord;
  }

  public void setChequesAssignmentProvideActionRecord(Object chequesAssignmentProvideActionRecord) {
    this.chequesAssignmentProvideActionRecord = chequesAssignmentProvideActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Cheques Assignment instance (e.g. initialised, pending, active) 
   * @return chequesAssignmentInstanceStatus
  **/

  public String getChequesAssignmentInstanceStatus() {
    return chequesAssignmentInstanceStatus;
  }

  public void setChequesAssignmentInstanceStatus(String chequesAssignmentInstanceStatus) {
    this.chequesAssignmentInstanceStatus = chequesAssignmentInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Handles the issuance of cheques or checks as numbered and tracked devices sequenceNumber:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The tracked sequence numbering (e.g. cheque number range issued)  
   * @return chequesAssignmentInstanceRecord
  **/

  public Object getChequesAssignmentInstanceRecord() {
    return chequesAssignmentInstanceRecord;
  }

  public void setChequesAssignmentInstanceRecord(Object chequesAssignmentInstanceRecord) {
    this.chequesAssignmentInstanceRecord = chequesAssignmentInstanceRecord;
  }


}

