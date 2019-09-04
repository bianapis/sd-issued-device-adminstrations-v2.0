package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationProvideInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationProvideInputModel
 */
public class CRIssuedDeviceAllocationProvideInputModel   {
  private String issuedDeviceAdministrationServicingSessionReference = null;

  private Object issuedDeviceAllocationProvideActionRecord = null;

  private String issuedDeviceAllocationInstanceStatus = null;

  private CRIssuedDeviceAllocationProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Provide service call input and output record 
   * @return issuedDeviceAllocationProvideActionRecord
  **/

  public Object getIssuedDeviceAllocationProvideActionRecord() {
    return issuedDeviceAllocationProvideActionRecord;
  }

  public void setIssuedDeviceAllocationProvideActionRecord(Object issuedDeviceAllocationProvideActionRecord) {
    this.issuedDeviceAllocationProvideActionRecord = issuedDeviceAllocationProvideActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Issued Device Allocation instance (e.g. initialised, pending, active) 
   * @return issuedDeviceAllocationInstanceStatus
  **/

  public String getIssuedDeviceAllocationInstanceStatus() {
    return issuedDeviceAllocationInstanceStatus;
  }

  public void setIssuedDeviceAllocationInstanceStatus(String issuedDeviceAllocationInstanceStatus) {
    this.issuedDeviceAllocationInstanceStatus = issuedDeviceAllocationInstanceStatus;
  }


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public CRIssuedDeviceAllocationProvideInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(CRIssuedDeviceAllocationProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


}

