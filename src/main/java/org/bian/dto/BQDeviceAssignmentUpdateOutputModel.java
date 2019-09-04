package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceAssignmentUpdateInputModelDeviceAssignmentInstanceRecord;
import org.bian.dto.BQDeviceAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentUpdateOutputModel
 */
public class BQDeviceAssignmentUpdateOutputModel   {
  private BQDeviceAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQDeviceAssignmentUpdateInputModelDeviceAssignmentInstanceRecord deviceAssignmentInstanceRecord = null;

  private String deviceAssignmentUpdateActionTaskReference = null;

  private Object deviceAssignmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return deviceAssignmentUpdateActionTaskReference
  **/

  public String getDeviceAssignmentUpdateActionTaskReference() {
    return deviceAssignmentUpdateActionTaskReference;
  }

  public void setDeviceAssignmentUpdateActionTaskReference(String deviceAssignmentUpdateActionTaskReference) {
    this.deviceAssignmentUpdateActionTaskReference = deviceAssignmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

