package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentControlInputModel
 */
public class BQDeviceAssignmentControlInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String deviceAssignmentInstanceReference = null;

  private Object deviceAssignmentControlActionTaskRecord = null;

  private CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest deviceAssignmentControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Device Assignment instance 
   * @return deviceAssignmentInstanceReference
  **/

  public String getDeviceAssignmentInstanceReference() {
    return deviceAssignmentInstanceReference;
  }

  public void setDeviceAssignmentInstanceReference(String deviceAssignmentInstanceReference) {
    this.deviceAssignmentInstanceReference = deviceAssignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return deviceAssignmentControlActionTaskRecord
  **/

  public Object getDeviceAssignmentControlActionTaskRecord() {
    return deviceAssignmentControlActionTaskRecord;
  }

  public void setDeviceAssignmentControlActionTaskRecord(Object deviceAssignmentControlActionTaskRecord) {
    this.deviceAssignmentControlActionTaskRecord = deviceAssignmentControlActionTaskRecord;
  }


  /**
   * Get deviceAssignmentControlActionRequest
   * @return deviceAssignmentControlActionRequest
  **/

  public CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest getDeviceAssignmentControlActionRequest() {
    return deviceAssignmentControlActionRequest;
  }

  public void setDeviceAssignmentControlActionRequest(CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest deviceAssignmentControlActionRequest) {
    this.deviceAssignmentControlActionRequest = deviceAssignmentControlActionRequest;
  }


}

