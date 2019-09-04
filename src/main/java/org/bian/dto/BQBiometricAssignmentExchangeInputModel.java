package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentExchangeInputModel
 */
public class BQBiometricAssignmentExchangeInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String biometricAssignmentInstanceReference = null;

  private Object biometricAssignmentExchangeActionTaskRecord = null;

  private CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest biometricAssignmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return biometricAssignmentExchangeActionTaskRecord
  **/

  public Object getBiometricAssignmentExchangeActionTaskRecord() {
    return biometricAssignmentExchangeActionTaskRecord;
  }

  public void setBiometricAssignmentExchangeActionTaskRecord(Object biometricAssignmentExchangeActionTaskRecord) {
    this.biometricAssignmentExchangeActionTaskRecord = biometricAssignmentExchangeActionTaskRecord;
  }


  /**
   * Get biometricAssignmentExchangeActionRequest
   * @return biometricAssignmentExchangeActionRequest
  **/

  public CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest getBiometricAssignmentExchangeActionRequest() {
    return biometricAssignmentExchangeActionRequest;
  }

  public void setBiometricAssignmentExchangeActionRequest(CRIssuedDeviceAllocationExchangeInputModelIssuedDeviceAllocationExchangeActionRequest biometricAssignmentExchangeActionRequest) {
    this.biometricAssignmentExchangeActionRequest = biometricAssignmentExchangeActionRequest;
  }


}

