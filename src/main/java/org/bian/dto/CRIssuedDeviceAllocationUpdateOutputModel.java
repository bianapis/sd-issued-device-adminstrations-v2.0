package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationUpdateInputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIssuedDeviceAllocationUpdateOutputModel
 */
public class CRIssuedDeviceAllocationUpdateOutputModel   {
  private CRIssuedDeviceAllocationUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationUpdateActionTaskReference = null;

  private Object issuedDeviceAllocationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public CRIssuedDeviceAllocationUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(CRIssuedDeviceAllocationUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return issuedDeviceAllocationUpdateActionTaskReference
  **/

  public String getIssuedDeviceAllocationUpdateActionTaskReference() {
    return issuedDeviceAllocationUpdateActionTaskReference;
  }

  public void setIssuedDeviceAllocationUpdateActionTaskReference(String issuedDeviceAllocationUpdateActionTaskReference) {
    this.issuedDeviceAllocationUpdateActionTaskReference = issuedDeviceAllocationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return issuedDeviceAllocationUpdateActionTaskRecord
  **/

  public Object getIssuedDeviceAllocationUpdateActionTaskRecord() {
    return issuedDeviceAllocationUpdateActionTaskRecord;
  }

  public void setIssuedDeviceAllocationUpdateActionTaskRecord(Object issuedDeviceAllocationUpdateActionTaskRecord) {
    this.issuedDeviceAllocationUpdateActionTaskRecord = issuedDeviceAllocationUpdateActionTaskRecord;
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

