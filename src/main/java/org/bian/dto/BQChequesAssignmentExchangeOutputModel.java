package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentExchangeOutputModel
 */
public class BQChequesAssignmentExchangeOutputModel   {
  private String chequesAssignmentExchangeActionTaskReference = null;

  private Object chequesAssignmentExchangeActionTaskRecord = null;

  private String chequesAssignmentExchangeActionResponse = null;

  private String chequesAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cheques Assignment instance exchange service call 
   * @return chequesAssignmentExchangeActionTaskReference
  **/

  public String getChequesAssignmentExchangeActionTaskReference() {
    return chequesAssignmentExchangeActionTaskReference;
  }

  public void setChequesAssignmentExchangeActionTaskReference(String chequesAssignmentExchangeActionTaskReference) {
    this.chequesAssignmentExchangeActionTaskReference = chequesAssignmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return chequesAssignmentExchangeActionTaskRecord
  **/

  public Object getChequesAssignmentExchangeActionTaskRecord() {
    return chequesAssignmentExchangeActionTaskRecord;
  }

  public void setChequesAssignmentExchangeActionTaskRecord(Object chequesAssignmentExchangeActionTaskRecord) {
    this.chequesAssignmentExchangeActionTaskRecord = chequesAssignmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return chequesAssignmentExchangeActionResponse
  **/

  public String getChequesAssignmentExchangeActionResponse() {
    return chequesAssignmentExchangeActionResponse;
  }

  public void setChequesAssignmentExchangeActionResponse(String chequesAssignmentExchangeActionResponse) {
    this.chequesAssignmentExchangeActionResponse = chequesAssignmentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Cheques Assignment instance (e.g. accepted, rejected, verified) 
   * @return chequesAssignmentInstanceStatus
  **/

  public String getChequesAssignmentInstanceStatus() {
    return chequesAssignmentInstanceStatus;
  }

  public void setChequesAssignmentInstanceStatus(String chequesAssignmentInstanceStatus) {
    this.chequesAssignmentInstanceStatus = chequesAssignmentInstanceStatus;
  }


}

