package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentControlOutputModel
 */
public class BQChequesAssignmentControlOutputModel   {
  private String chequesAssignmentControlActionTaskReference = null;

  private Object chequesAssignmentControlActionTaskRecord = null;

  private String chequesAssignmentControlActionResponse = null;

  private String chequesAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cheques Assignment instance control processing service call 
   * @return chequesAssignmentControlActionTaskReference
  **/

  public String getChequesAssignmentControlActionTaskReference() {
    return chequesAssignmentControlActionTaskReference;
  }

  public void setChequesAssignmentControlActionTaskReference(String chequesAssignmentControlActionTaskReference) {
    this.chequesAssignmentControlActionTaskReference = chequesAssignmentControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return chequesAssignmentControlActionTaskRecord
  **/

  public Object getChequesAssignmentControlActionTaskRecord() {
    return chequesAssignmentControlActionTaskRecord;
  }

  public void setChequesAssignmentControlActionTaskRecord(Object chequesAssignmentControlActionTaskRecord) {
    this.chequesAssignmentControlActionTaskRecord = chequesAssignmentControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return chequesAssignmentControlActionResponse
  **/

  public String getChequesAssignmentControlActionResponse() {
    return chequesAssignmentControlActionResponse;
  }

  public void setChequesAssignmentControlActionResponse(String chequesAssignmentControlActionResponse) {
    this.chequesAssignmentControlActionResponse = chequesAssignmentControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Cheques Assignment instance (e.g. initialised, pending, active) 
   * @return chequesAssignmentInstanceStatus
  **/

  public String getChequesAssignmentInstanceStatus() {
    return chequesAssignmentInstanceStatus;
  }

  public void setChequesAssignmentInstanceStatus(String chequesAssignmentInstanceStatus) {
    this.chequesAssignmentInstanceStatus = chequesAssignmentInstanceStatus;
  }


}

