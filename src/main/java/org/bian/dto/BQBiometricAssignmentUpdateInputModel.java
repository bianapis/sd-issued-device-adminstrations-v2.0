package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord;
import org.bian.dto.BQBiometricAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentUpdateInputModel
 */
public class BQBiometricAssignmentUpdateInputModel   {
  private BQBiometricAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private String biometricAssignmentInstanceReference = null;

  private BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord = null;

  private Object biometricAssignmentUpdateActionTaskRecord = null;

  private String biometricAssignmentUpdateActionRequest = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQBiometricAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQBiometricAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Issued Device Allocation instance 
   * @return issuedDeviceAllocationInstanceReference
  **/

  public String getIssuedDeviceAllocationInstanceReference() {
    return issuedDeviceAllocationInstanceReference;
  }

  public void setIssuedDeviceAllocationInstanceReference(String issuedDeviceAllocationInstanceReference) {
    this.issuedDeviceAllocationInstanceReference = issuedDeviceAllocationInstanceReference;
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
   * Get biometricAssignmentInstanceRecord
   * @return biometricAssignmentInstanceRecord
  **/

  public BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord getBiometricAssignmentInstanceRecord() {
    return biometricAssignmentInstanceRecord;
  }

  public void setBiometricAssignmentInstanceRecord(BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord) {
    this.biometricAssignmentInstanceRecord = biometricAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return biometricAssignmentUpdateActionTaskRecord
  **/

  public Object getBiometricAssignmentUpdateActionTaskRecord() {
    return biometricAssignmentUpdateActionTaskRecord;
  }

  public void setBiometricAssignmentUpdateActionTaskRecord(Object biometricAssignmentUpdateActionTaskRecord) {
    this.biometricAssignmentUpdateActionTaskRecord = biometricAssignmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return biometricAssignmentUpdateActionRequest
  **/

  public String getBiometricAssignmentUpdateActionRequest() {
    return biometricAssignmentUpdateActionRequest;
  }

  public void setBiometricAssignmentUpdateActionRequest(String biometricAssignmentUpdateActionRequest) {
    this.biometricAssignmentUpdateActionRequest = biometricAssignmentUpdateActionRequest;
  }


}

