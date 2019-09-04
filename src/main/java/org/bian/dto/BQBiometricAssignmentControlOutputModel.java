package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentControlOutputModel
 */
public class BQBiometricAssignmentControlOutputModel   {
  private String biometricAssignmentControlActionTaskReference = null;

  private Object biometricAssignmentControlActionTaskRecord = null;

  private String biometricAssignmentControlActionResponse = null;

  private String biometricAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Biometric Assignment instance control processing service call 
   * @return biometricAssignmentControlActionTaskReference
  **/

  public String getBiometricAssignmentControlActionTaskReference() {
    return biometricAssignmentControlActionTaskReference;
  }

  public void setBiometricAssignmentControlActionTaskReference(String biometricAssignmentControlActionTaskReference) {
    this.biometricAssignmentControlActionTaskReference = biometricAssignmentControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return biometricAssignmentControlActionResponse
  **/

  public String getBiometricAssignmentControlActionResponse() {
    return biometricAssignmentControlActionResponse;
  }

  public void setBiometricAssignmentControlActionResponse(String biometricAssignmentControlActionResponse) {
    this.biometricAssignmentControlActionResponse = biometricAssignmentControlActionResponse;
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


}

