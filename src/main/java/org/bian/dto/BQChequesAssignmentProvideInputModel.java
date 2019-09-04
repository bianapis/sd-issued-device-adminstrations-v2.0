package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChequesAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentProvideInputModel
 */
public class BQChequesAssignmentProvideInputModel   {
  private BQChequesAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private Object chequesAssignmentProvideActionRecord = null;

  private Object chequesAssignmentInstanceRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQChequesAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQChequesAssignmentProvideInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
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
   * @return chequesAssignmentProvideActionRecord
  **/

  public Object getChequesAssignmentProvideActionRecord() {
    return chequesAssignmentProvideActionRecord;
  }

  public void setChequesAssignmentProvideActionRecord(Object chequesAssignmentProvideActionRecord) {
    this.chequesAssignmentProvideActionRecord = chequesAssignmentProvideActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Handles the issuance of cheques or checks as numbered and tracked devices issuedDeviceTemplateValues:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: Cheque template (e.g. customer account/branch reference, print image/personalization) issueLocation:  type: string  description: |   `status: Not Mapped`    core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text    general-info: The delivery address for distribution 
   * @return chequesAssignmentInstanceRecord
  **/

  public Object getChequesAssignmentInstanceRecord() {
    return chequesAssignmentInstanceRecord;
  }

  public void setChequesAssignmentInstanceRecord(Object chequesAssignmentInstanceRecord) {
    this.chequesAssignmentInstanceRecord = chequesAssignmentInstanceRecord;
  }


}

