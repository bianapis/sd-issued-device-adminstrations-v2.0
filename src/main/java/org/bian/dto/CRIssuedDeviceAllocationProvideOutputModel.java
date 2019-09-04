package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationProvideOutputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationProvideOutputModel
 */
public class CRIssuedDeviceAllocationProvideOutputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String issuedDeviceAllocationProvideActionReference = null;

  private Object issuedDeviceAllocationProvideActionRecord = null;

  private String issuedDeviceAllocationInstanceStatus = null;

  private CRIssuedDeviceAllocationProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issued Device Allocation instance 
   * @return issuedDeviceAllocationInstanceReference
  **/

  public String getIssuedDeviceAllocationInstanceReference() {
    return issuedDeviceAllocationInstanceReference;
  }

  public void setIssuedDeviceAllocationInstanceReference(String issuedDeviceAllocationInstanceReference) {
    this.issuedDeviceAllocationInstanceReference = issuedDeviceAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Provide service call 
   * @return issuedDeviceAllocationProvideActionReference
  **/

  public String getIssuedDeviceAllocationProvideActionReference() {
    return issuedDeviceAllocationProvideActionReference;
  }

  public void setIssuedDeviceAllocationProvideActionReference(String issuedDeviceAllocationProvideActionReference) {
    this.issuedDeviceAllocationProvideActionReference = issuedDeviceAllocationProvideActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Provide service call input and output record 
   * @return issuedDeviceAllocationProvideActionRecord
  **/

  public Object getIssuedDeviceAllocationProvideActionRecord() {
    return issuedDeviceAllocationProvideActionRecord;
  }

  public void setIssuedDeviceAllocationProvideActionRecord(Object issuedDeviceAllocationProvideActionRecord) {
    this.issuedDeviceAllocationProvideActionRecord = issuedDeviceAllocationProvideActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Issued Device Allocation instance (e.g. initialised, pending, active) 
   * @return issuedDeviceAllocationInstanceStatus
  **/

  public String getIssuedDeviceAllocationInstanceStatus() {
    return issuedDeviceAllocationInstanceStatus;
  }

  public void setIssuedDeviceAllocationInstanceStatus(String issuedDeviceAllocationInstanceStatus) {
    this.issuedDeviceAllocationInstanceStatus = issuedDeviceAllocationInstanceStatus;
  }


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public CRIssuedDeviceAllocationProvideOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(CRIssuedDeviceAllocationProvideOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


}

