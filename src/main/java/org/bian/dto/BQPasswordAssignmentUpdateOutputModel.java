package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQPasswordAssignmentUpdateInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentUpdateOutputModel
 */
public class BQPasswordAssignmentUpdateOutputModel   {
  private BQPasswordAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQPasswordAssignmentUpdateInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord = null;

  private String passwordAssignmentUpdateActionTaskReference = null;

  private Object passwordAssignmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQPasswordAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQPasswordAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * Get passwordAssignmentInstanceRecord
   * @return passwordAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentUpdateInputModelPasswordAssignmentInstanceRecord getPasswordAssignmentInstanceRecord() {
    return passwordAssignmentInstanceRecord;
  }

  public void setPasswordAssignmentInstanceRecord(BQPasswordAssignmentUpdateInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord) {
    this.passwordAssignmentInstanceRecord = passwordAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return passwordAssignmentUpdateActionTaskReference
  **/

  public String getPasswordAssignmentUpdateActionTaskReference() {
    return passwordAssignmentUpdateActionTaskReference;
  }

  public void setPasswordAssignmentUpdateActionTaskReference(String passwordAssignmentUpdateActionTaskReference) {
    this.passwordAssignmentUpdateActionTaskReference = passwordAssignmentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return passwordAssignmentUpdateActionTaskRecord
  **/

  public Object getPasswordAssignmentUpdateActionTaskRecord() {
    return passwordAssignmentUpdateActionTaskRecord;
  }

  public void setPasswordAssignmentUpdateActionTaskRecord(Object passwordAssignmentUpdateActionTaskRecord) {
    this.passwordAssignmentUpdateActionTaskRecord = passwordAssignmentUpdateActionTaskRecord;
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

