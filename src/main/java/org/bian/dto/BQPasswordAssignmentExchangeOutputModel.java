package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentExchangeOutputModel
 */
public class BQPasswordAssignmentExchangeOutputModel   {
  private String passwordAssignmentExchangeActionTaskReference = null;

  private Object passwordAssignmentExchangeActionTaskRecord = null;

  private String passwordAssignmentExchangeActionResponse = null;

  private String passwordAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Password Assignment instance exchange service call 
   * @return passwordAssignmentExchangeActionTaskReference
  **/

  public String getPasswordAssignmentExchangeActionTaskReference() {
    return passwordAssignmentExchangeActionTaskReference;
  }

  public void setPasswordAssignmentExchangeActionTaskReference(String passwordAssignmentExchangeActionTaskReference) {
    this.passwordAssignmentExchangeActionTaskReference = passwordAssignmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return passwordAssignmentExchangeActionTaskRecord
  **/

  public Object getPasswordAssignmentExchangeActionTaskRecord() {
    return passwordAssignmentExchangeActionTaskRecord;
  }

  public void setPasswordAssignmentExchangeActionTaskRecord(Object passwordAssignmentExchangeActionTaskRecord) {
    this.passwordAssignmentExchangeActionTaskRecord = passwordAssignmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return passwordAssignmentExchangeActionResponse
  **/

  public String getPasswordAssignmentExchangeActionResponse() {
    return passwordAssignmentExchangeActionResponse;
  }

  public void setPasswordAssignmentExchangeActionResponse(String passwordAssignmentExchangeActionResponse) {
    this.passwordAssignmentExchangeActionResponse = passwordAssignmentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Password Assignment instance (e.g. accepted, rejected, verified) 
   * @return passwordAssignmentInstanceStatus
  **/

  public String getPasswordAssignmentInstanceStatus() {
    return passwordAssignmentInstanceStatus;
  }

  public void setPasswordAssignmentInstanceStatus(String passwordAssignmentInstanceStatus) {
    this.passwordAssignmentInstanceStatus = passwordAssignmentInstanceStatus;
  }


}

