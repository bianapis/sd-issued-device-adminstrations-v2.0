package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord;
import org.bian.dto.BQBiometricAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentUpdateOutputModel
 */
public class BQBiometricAssignmentUpdateOutputModel   {
  private BQBiometricAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord = null;

  private String biometricAssignmentUpdateActionTaskReference = null;

  private Object biometricAssignmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQBiometricAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQBiometricAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return biometricAssignmentUpdateActionTaskReference
  **/

  public String getBiometricAssignmentUpdateActionTaskReference() {
    return biometricAssignmentUpdateActionTaskReference;
  }

  public void setBiometricAssignmentUpdateActionTaskReference(String biometricAssignmentUpdateActionTaskReference) {
    this.biometricAssignmentUpdateActionTaskReference = biometricAssignmentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return biometricAssignmentUpdateActionTaskRecord
  **/

  public Object getBiometricAssignmentUpdateActionTaskRecord() {
    return biometricAssignmentUpdateActionTaskRecord;
  }

  public void setBiometricAssignmentUpdateActionTaskRecord(Object biometricAssignmentUpdateActionTaskRecord) {
    this.biometricAssignmentUpdateActionTaskRecord = biometricAssignmentUpdateActionTaskRecord;
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

