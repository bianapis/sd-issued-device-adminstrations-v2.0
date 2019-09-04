package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentControlInputModel
 */
public class BQBiometricAssignmentControlInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String biometricAssignmentInstanceReference = null;

  private Object biometricAssignmentControlActionTaskRecord = null;

  private CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest biometricAssignmentControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return biometricAssignmentControlActionTaskRecord
  **/

  public Object getBiometricAssignmentControlActionTaskRecord() {
    return biometricAssignmentControlActionTaskRecord;
  }

  public void setBiometricAssignmentControlActionTaskRecord(Object biometricAssignmentControlActionTaskRecord) {
    this.biometricAssignmentControlActionTaskRecord = biometricAssignmentControlActionTaskRecord;
  }


  /**
   * Get biometricAssignmentControlActionRequest
   * @return biometricAssignmentControlActionRequest
  **/

  public CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest getBiometricAssignmentControlActionRequest() {
    return biometricAssignmentControlActionRequest;
  }

  public void setBiometricAssignmentControlActionRequest(CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest biometricAssignmentControlActionRequest) {
    this.biometricAssignmentControlActionRequest = biometricAssignmentControlActionRequest;
  }


}

