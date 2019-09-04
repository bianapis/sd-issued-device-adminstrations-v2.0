package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceAssignmentUpdateInputModelDeviceAssignmentInstanceRecord;
import org.bian.dto.BQDeviceAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentUpdateInputModel
 */
public class BQDeviceAssignmentUpdateInputModel   {
  private BQDeviceAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private String deviceAssignmentInstanceReference = null;

  private BQDeviceAssignmentUpdateInputModelDeviceAssignmentInstanceRecord deviceAssignmentInstanceRecord = null;

  private Object deviceAssignmentUpdateActionTaskRecord = null;

  private String deviceAssignmentUpdateActionRequest = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQDeviceAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQDeviceAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


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
   * Get deviceAssignmentInstanceRecord
   * @return deviceAssignmentInstanceRecord
  **/

  public BQDeviceAssignmentUpdateInputModelDeviceAssignmentInstanceRecord getDeviceAssignmentInstanceRecord() {
    return deviceAssignmentInstanceRecord;
  }

  public void setDeviceAssignmentInstanceRecord(BQDeviceAssignmentUpdateInputModelDeviceAssignmentInstanceRecord deviceAssignmentInstanceRecord) {
    this.deviceAssignmentInstanceRecord = deviceAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return deviceAssignmentUpdateActionTaskRecord
  **/

  public Object getDeviceAssignmentUpdateActionTaskRecord() {
    return deviceAssignmentUpdateActionTaskRecord;
  }

  public void setDeviceAssignmentUpdateActionTaskRecord(Object deviceAssignmentUpdateActionTaskRecord) {
    this.deviceAssignmentUpdateActionTaskRecord = deviceAssignmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return deviceAssignmentUpdateActionRequest
  **/

  public String getDeviceAssignmentUpdateActionRequest() {
    return deviceAssignmentUpdateActionRequest;
  }

  public void setDeviceAssignmentUpdateActionRequest(String deviceAssignmentUpdateActionRequest) {
    this.deviceAssignmentUpdateActionRequest = deviceAssignmentUpdateActionRequest;
  }


}

