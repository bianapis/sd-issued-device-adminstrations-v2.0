package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationUpdateInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationUpdateInputModel
 */
public class CRIssuedDeviceAllocationUpdateInputModel   {
  private String issuedDeviceAdministrationServicingSessionReference = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private CRIssuedDeviceAllocationUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private Object issuedDeviceAllocationUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return issuedDeviceAdministrationServicingSessionReference
  **/

  public String getIssuedDeviceAdministrationServicingSessionReference() {
    return issuedDeviceAdministrationServicingSessionReference;
  }

  public void setIssuedDeviceAdministrationServicingSessionReference(String issuedDeviceAdministrationServicingSessionReference) {
    this.issuedDeviceAdministrationServicingSessionReference = issuedDeviceAdministrationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device Allocation instance 
   * @return issuedDeviceAllocationInstanceReference
  **/

  public String getIssuedDeviceAllocationInstanceReference() {
    return issuedDeviceAllocationInstanceReference;
  }

  public void setIssuedDeviceAllocationInstanceReference(String issuedDeviceAllocationInstanceReference) {
    this.issuedDeviceAllocationInstanceReference = issuedDeviceAllocationInstanceReference;
  }


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public CRIssuedDeviceAllocationUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(CRIssuedDeviceAllocationUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return issuedDeviceAllocationUpdateActionTaskRecord
  **/

  public Object getIssuedDeviceAllocationUpdateActionTaskRecord() {
    return issuedDeviceAllocationUpdateActionTaskRecord;
  }

  public void setIssuedDeviceAllocationUpdateActionTaskRecord(Object issuedDeviceAllocationUpdateActionTaskRecord) {
    this.issuedDeviceAllocationUpdateActionTaskRecord = issuedDeviceAllocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

