package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQPasswordAssignmentProvideOutputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentProvideOutputModel
 */
public class BQPasswordAssignmentProvideOutputModel   {
  private BQPasswordAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String passwordAssignmentInstanceReference = null;

  private String passwordAssignmentProvideActionReference = null;

  private Object passwordAssignmentProvideActionRecord = null;

  private String passwordAssignmentInstanceStatus = null;

  private BQPasswordAssignmentProvideOutputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQPasswordAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQPasswordAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Password Assignment instance 
   * @return passwordAssignmentInstanceReference
  **/

  public String getPasswordAssignmentInstanceReference() {
    return passwordAssignmentInstanceReference;
  }

  public void setPasswordAssignmentInstanceReference(String passwordAssignmentInstanceReference) {
    this.passwordAssignmentInstanceReference = passwordAssignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Provide service call 
   * @return passwordAssignmentProvideActionReference
  **/

  public String getPasswordAssignmentProvideActionReference() {
    return passwordAssignmentProvideActionReference;
  }

  public void setPasswordAssignmentProvideActionReference(String passwordAssignmentProvideActionReference) {
    this.passwordAssignmentProvideActionReference = passwordAssignmentProvideActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Provide service call input and output record 
   * @return passwordAssignmentProvideActionRecord
  **/

  public Object getPasswordAssignmentProvideActionRecord() {
    return passwordAssignmentProvideActionRecord;
  }

  public void setPasswordAssignmentProvideActionRecord(Object passwordAssignmentProvideActionRecord) {
    this.passwordAssignmentProvideActionRecord = passwordAssignmentProvideActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Password Assignment instance (e.g. initialised, pending, active) 
   * @return passwordAssignmentInstanceStatus
  **/

  public String getPasswordAssignmentInstanceStatus() {
    return passwordAssignmentInstanceStatus;
  }

  public void setPasswordAssignmentInstanceStatus(String passwordAssignmentInstanceStatus) {
    this.passwordAssignmentInstanceStatus = passwordAssignmentInstanceStatus;
  }


  /**
   * Get passwordAssignmentInstanceRecord
   * @return passwordAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentProvideOutputModelPasswordAssignmentInstanceRecord getPasswordAssignmentInstanceRecord() {
    return passwordAssignmentInstanceRecord;
  }

  public void setPasswordAssignmentInstanceRecord(BQPasswordAssignmentProvideOutputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord) {
    this.passwordAssignmentInstanceRecord = passwordAssignmentInstanceRecord;
  }


}

