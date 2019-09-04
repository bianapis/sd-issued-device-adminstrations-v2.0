package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPasswordAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQPasswordAssignmentProvideInputModelPasswordAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentProvideInputModel
 */
public class BQPasswordAssignmentProvideInputModel   {
  private BQPasswordAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private Object passwordAssignmentProvideActionRecord = null;

  private BQPasswordAssignmentProvideInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQPasswordAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQPasswordAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Provide service call input and output record 
   * @return passwordAssignmentProvideActionRecord
  **/

  public Object getPasswordAssignmentProvideActionRecord() {
    return passwordAssignmentProvideActionRecord;
  }

  public void setPasswordAssignmentProvideActionRecord(Object passwordAssignmentProvideActionRecord) {
    this.passwordAssignmentProvideActionRecord = passwordAssignmentProvideActionRecord;
  }


  /**
   * Get passwordAssignmentInstanceRecord
   * @return passwordAssignmentInstanceRecord
  **/

  public BQPasswordAssignmentProvideInputModelPasswordAssignmentInstanceRecord getPasswordAssignmentInstanceRecord() {
    return passwordAssignmentInstanceRecord;
  }

  public void setPasswordAssignmentInstanceRecord(BQPasswordAssignmentProvideInputModelPasswordAssignmentInstanceRecord passwordAssignmentInstanceRecord) {
    this.passwordAssignmentInstanceRecord = passwordAssignmentInstanceRecord;
  }


}

