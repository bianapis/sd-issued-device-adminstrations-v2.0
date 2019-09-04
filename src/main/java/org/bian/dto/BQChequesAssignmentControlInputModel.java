package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentControlInputModel
 */
public class BQChequesAssignmentControlInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String chequesAssignmentInstanceReference = null;

  private Object chequesAssignmentControlActionTaskRecord = null;

  private CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest chequesAssignmentControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cheques Assignment instance 
   * @return chequesAssignmentInstanceReference
  **/

  public String getChequesAssignmentInstanceReference() {
    return chequesAssignmentInstanceReference;
  }

  public void setChequesAssignmentInstanceReference(String chequesAssignmentInstanceReference) {
    this.chequesAssignmentInstanceReference = chequesAssignmentInstanceReference;
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
   * Get chequesAssignmentControlActionRequest
   * @return chequesAssignmentControlActionRequest
  **/

  public CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest getChequesAssignmentControlActionRequest() {
    return chequesAssignmentControlActionRequest;
  }

  public void setChequesAssignmentControlActionRequest(CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest chequesAssignmentControlActionRequest) {
    this.chequesAssignmentControlActionRequest = chequesAssignmentControlActionRequest;
  }


}

