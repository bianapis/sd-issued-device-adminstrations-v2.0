package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricAssignmentProvideOutputModelBiometricAssignmentInstanceRecord;
import org.bian.dto.BQBiometricAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentProvideOutputModel
 */
public class BQBiometricAssignmentProvideOutputModel   {
  private BQBiometricAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String biometricAssignmentInstanceReference = null;

  private String biometricAssignmentProvideActionReference = null;

  private Object biometricAssignmentProvideActionRecord = null;

  private String biometricAssignmentInstanceStatus = null;

  private BQBiometricAssignmentProvideOutputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQBiometricAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQBiometricAssignmentProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Biometric Assignment instance 
   * @return biometricAssignmentInstanceReference
  **/

  public String getBiometricAssignmentInstanceReference() {
    return biometricAssignmentInstanceReference;
  }

  public void setBiometricAssignmentInstanceReference(String biometricAssignmentInstanceReference) {
    this.biometricAssignmentInstanceReference = biometricAssignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Provide service call 
   * @return biometricAssignmentProvideActionReference
  **/

  public String getBiometricAssignmentProvideActionReference() {
    return biometricAssignmentProvideActionReference;
  }

  public void setBiometricAssignmentProvideActionReference(String biometricAssignmentProvideActionReference) {
    this.biometricAssignmentProvideActionReference = biometricAssignmentProvideActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Provide service call input and output record 
   * @return biometricAssignmentProvideActionRecord
  **/

  public Object getBiometricAssignmentProvideActionRecord() {
    return biometricAssignmentProvideActionRecord;
  }

  public void setBiometricAssignmentProvideActionRecord(Object biometricAssignmentProvideActionRecord) {
    this.biometricAssignmentProvideActionRecord = biometricAssignmentProvideActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Biometric Assignment instance (e.g. initialised, pending, active) 
   * @return biometricAssignmentInstanceStatus
  **/

  public String getBiometricAssignmentInstanceStatus() {
    return biometricAssignmentInstanceStatus;
  }

  public void setBiometricAssignmentInstanceStatus(String biometricAssignmentInstanceStatus) {
    this.biometricAssignmentInstanceStatus = biometricAssignmentInstanceStatus;
  }


  /**
   * Get biometricAssignmentInstanceRecord
   * @return biometricAssignmentInstanceRecord
  **/

  public BQBiometricAssignmentProvideOutputModelBiometricAssignmentInstanceRecord getBiometricAssignmentInstanceRecord() {
    return biometricAssignmentInstanceRecord;
  }

  public void setBiometricAssignmentInstanceRecord(BQBiometricAssignmentProvideOutputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord) {
    this.biometricAssignmentInstanceRecord = biometricAssignmentInstanceRecord;
  }


}

