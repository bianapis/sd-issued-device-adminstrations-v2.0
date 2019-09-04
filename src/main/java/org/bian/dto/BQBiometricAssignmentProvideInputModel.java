package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord;
import org.bian.dto.BQBiometricAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentProvideInputModel
 */
public class BQBiometricAssignmentProvideInputModel   {
  private BQBiometricAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private Object biometricAssignmentProvideActionRecord = null;

  private BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQBiometricAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQBiometricAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
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
   * @return biometricAssignmentProvideActionRecord
  **/

  public Object getBiometricAssignmentProvideActionRecord() {
    return biometricAssignmentProvideActionRecord;
  }

  public void setBiometricAssignmentProvideActionRecord(Object biometricAssignmentProvideActionRecord) {
    this.biometricAssignmentProvideActionRecord = biometricAssignmentProvideActionRecord;
  }


  /**
   * Get biometricAssignmentInstanceRecord
   * @return biometricAssignmentInstanceRecord
  **/

  public BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord getBiometricAssignmentInstanceRecord() {
    return biometricAssignmentInstanceRecord;
  }

  public void setBiometricAssignmentInstanceRecord(BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord) {
    this.biometricAssignmentInstanceRecord = biometricAssignmentInstanceRecord;
  }


}

