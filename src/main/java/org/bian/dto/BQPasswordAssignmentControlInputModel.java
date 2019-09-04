package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentControlInputModel
 */
public class BQPasswordAssignmentControlInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String passwordAssignmentInstanceReference = null;

  private Object passwordAssignmentControlActionTaskRecord = null;

  private CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest passwordAssignmentControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Password Assignment instance 
   * @return passwordAssignmentInstanceReference
  **/

  public String getPasswordAssignmentInstanceReference() {
    return passwordAssignmentInstanceReference;
  }

  public void setPasswordAssignmentInstanceReference(String passwordAssignmentInstanceReference) {
    this.passwordAssignmentInstanceReference = passwordAssignmentInstanceReference;
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
   * Get passwordAssignmentControlActionRequest
   * @return passwordAssignmentControlActionRequest
  **/

  public CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest getPasswordAssignmentControlActionRequest() {
    return passwordAssignmentControlActionRequest;
  }

  public void setPasswordAssignmentControlActionRequest(CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest passwordAssignmentControlActionRequest) {
    this.passwordAssignmentControlActionRequest = passwordAssignmentControlActionRequest;
  }


}

