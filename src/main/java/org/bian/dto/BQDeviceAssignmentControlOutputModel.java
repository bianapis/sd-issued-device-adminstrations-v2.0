package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentControlOutputModel
 */
public class BQDeviceAssignmentControlOutputModel   {
  private String deviceAssignmentControlActionTaskReference = null;

  private Object deviceAssignmentControlActionTaskRecord = null;

  private String deviceAssignmentControlActionResponse = null;

  private String deviceAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Device Assignment instance control processing service call 
   * @return deviceAssignmentControlActionTaskReference
  **/

  public String getDeviceAssignmentControlActionTaskReference() {
    return deviceAssignmentControlActionTaskReference;
  }

  public void setDeviceAssignmentControlActionTaskReference(String deviceAssignmentControlActionTaskReference) {
    this.deviceAssignmentControlActionTaskReference = deviceAssignmentControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return deviceAssignmentControlActionResponse
  **/

  public String getDeviceAssignmentControlActionResponse() {
    return deviceAssignmentControlActionResponse;
  }

  public void setDeviceAssignmentControlActionResponse(String deviceAssignmentControlActionResponse) {
    this.deviceAssignmentControlActionResponse = deviceAssignmentControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Device Assignment instance (e.g. initialised, pending, active) 
   * @return deviceAssignmentInstanceStatus
  **/

  public String getDeviceAssignmentInstanceStatus() {
    return deviceAssignmentInstanceStatus;
  }

  public void setDeviceAssignmentInstanceStatus(String deviceAssignmentInstanceStatus) {
    this.deviceAssignmentInstanceStatus = deviceAssignmentInstanceStatus;
  }


}

