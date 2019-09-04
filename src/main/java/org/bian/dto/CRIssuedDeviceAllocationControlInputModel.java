package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationControlInputModel
 */
public class CRIssuedDeviceAllocationControlInputModel   {
  private String issuedDeviceAdministrationServicingSessionReference = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private Object issuedDeviceAllocationControlActionTaskRecord = null;

  private CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest issuedDeviceAllocationControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return issuedDeviceAllocationControlActionTaskRecord
  **/

  public Object getIssuedDeviceAllocationControlActionTaskRecord() {
    return issuedDeviceAllocationControlActionTaskRecord;
  }

  public void setIssuedDeviceAllocationControlActionTaskRecord(Object issuedDeviceAllocationControlActionTaskRecord) {
    this.issuedDeviceAllocationControlActionTaskRecord = issuedDeviceAllocationControlActionTaskRecord;
  }


  /**
   * Get issuedDeviceAllocationControlActionRequest
   * @return issuedDeviceAllocationControlActionRequest
  **/

  public CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest getIssuedDeviceAllocationControlActionRequest() {
    return issuedDeviceAllocationControlActionRequest;
  }

  public void setIssuedDeviceAllocationControlActionRequest(CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest issuedDeviceAllocationControlActionRequest) {
    this.issuedDeviceAllocationControlActionRequest = issuedDeviceAllocationControlActionRequest;
  }


}

