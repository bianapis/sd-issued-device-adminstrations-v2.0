package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentControlOutputModel
 */
public class BQPasswordAssignmentControlOutputModel   {
  private String passwordAssignmentControlActionTaskReference = null;

  private Object passwordAssignmentControlActionTaskRecord = null;

  private String passwordAssignmentControlActionResponse = null;

  private String passwordAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Password Assignment instance control processing service call 
   * @return passwordAssignmentControlActionTaskReference
  **/

  public String getPasswordAssignmentControlActionTaskReference() {
    return passwordAssignmentControlActionTaskReference;
  }

  public void setPasswordAssignmentControlActionTaskReference(String passwordAssignmentControlActionTaskReference) {
    this.passwordAssignmentControlActionTaskReference = passwordAssignmentControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return passwordAssignmentControlActionTaskRecord
  **/

  public Object getPasswordAssignmentControlActionTaskRecord() {
    return passwordAssignmentControlActionTaskRecord;
  }

  public void setPasswordAssignmentControlActionTaskRecord(Object passwordAssignmentControlActionTaskRecord) {
    this.passwordAssignmentControlActionTaskRecord = passwordAssignmentControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return passwordAssignmentControlActionResponse
  **/

  public String getPasswordAssignmentControlActionResponse() {
    return passwordAssignmentControlActionResponse;
  }

  public void setPasswordAssignmentControlActionResponse(String passwordAssignmentControlActionResponse) {
    this.passwordAssignmentControlActionResponse = passwordAssignmentControlActionResponse;
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


}

