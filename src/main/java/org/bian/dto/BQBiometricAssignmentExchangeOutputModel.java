package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentExchangeOutputModel
 */
public class BQBiometricAssignmentExchangeOutputModel   {
  private String biometricAssignmentExchangeActionTaskReference = null;

  private Object biometricAssignmentExchangeActionTaskRecord = null;

  private String biometricAssignmentExchangeActionResponse = null;

  private String biometricAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Biometric Assignment instance exchange service call 
   * @return biometricAssignmentExchangeActionTaskReference
  **/

  public String getBiometricAssignmentExchangeActionTaskReference() {
    return biometricAssignmentExchangeActionTaskReference;
  }

  public void setBiometricAssignmentExchangeActionTaskReference(String biometricAssignmentExchangeActionTaskReference) {
    this.biometricAssignmentExchangeActionTaskReference = biometricAssignmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return biometricAssignmentExchangeActionResponse
  **/

  public String getBiometricAssignmentExchangeActionResponse() {
    return biometricAssignmentExchangeActionResponse;
  }

  public void setBiometricAssignmentExchangeActionResponse(String biometricAssignmentExchangeActionResponse) {
    this.biometricAssignmentExchangeActionResponse = biometricAssignmentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Biometric Assignment instance (e.g. accepted, rejected, verified) 
   * @return biometricAssignmentInstanceStatus
  **/

  public String getBiometricAssignmentInstanceStatus() {
    return biometricAssignmentInstanceStatus;
  }

  public void setBiometricAssignmentInstanceStatus(String biometricAssignmentInstanceStatus) {
    this.biometricAssignmentInstanceStatus = biometricAssignmentInstanceStatus;
  }


}

