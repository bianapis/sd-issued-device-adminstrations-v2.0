package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentCaptureOutputModel
 */
public class BQDeviceAssignmentCaptureOutputModel   {
  private BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord deviceAssignmentInstanceRecord = null;

  private String deviceAssignmentCaptureActionTaskReference = null;

  private Object deviceAssignmentCaptureActionTaskRecord = null;

  private String deviceAssignmentCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get deviceAssignmentInstanceRecord
   * @return deviceAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord getDeviceAssignmentInstanceRecord() {
    return deviceAssignmentInstanceRecord;
  }

  public void setDeviceAssignmentInstanceRecord(BQPasswordAssignmentCaptureInputModelPasswordAssignmentInstanceRecord deviceAssignmentInstanceRecord) {
    this.deviceAssignmentInstanceRecord = deviceAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Device Assignment instance capture service call 
   * @return deviceAssignmentCaptureActionTaskReference
  **/

  public String getDeviceAssignmentCaptureActionTaskReference() {
    return deviceAssignmentCaptureActionTaskReference;
  }

  public void setDeviceAssignmentCaptureActionTaskReference(String deviceAssignmentCaptureActionTaskReference) {
    this.deviceAssignmentCaptureActionTaskReference = deviceAssignmentCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return deviceAssignmentCaptureActionTaskRecord
  **/

  public Object getDeviceAssignmentCaptureActionTaskRecord() {
    return deviceAssignmentCaptureActionTaskRecord;
  }

  public void setDeviceAssignmentCaptureActionTaskRecord(Object deviceAssignmentCaptureActionTaskRecord) {
    this.deviceAssignmentCaptureActionTaskRecord = deviceAssignmentCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Device Assignment structured input transaction/record 
   * @return deviceAssignmentCaptureRecordReference
  **/

  public String getDeviceAssignmentCaptureRecordReference() {
    return deviceAssignmentCaptureRecordReference;
  }

  public void setDeviceAssignmentCaptureRecordReference(String deviceAssignmentCaptureRecordReference) {
    this.deviceAssignmentCaptureRecordReference = deviceAssignmentCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

