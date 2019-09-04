package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReaderAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQReaderAssignmentUpdateInputModelReaderAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentUpdateInputModel
 */
public class BQReaderAssignmentUpdateInputModel   {
  private BQReaderAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private String issuedDeviceAllocationInstanceReference = null;

  private String readerAssignmentInstanceReference = null;

  private BQReaderAssignmentUpdateInputModelReaderAssignmentInstanceRecord readerAssignmentInstanceRecord = null;

  private Object readerAssignmentUpdateActionTaskRecord = null;

  private String readerAssignmentUpdateActionRequest = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQReaderAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQReaderAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reader Assignment instance 
   * @return readerAssignmentInstanceReference
  **/

  public String getReaderAssignmentInstanceReference() {
    return readerAssignmentInstanceReference;
  }

  public void setReaderAssignmentInstanceReference(String readerAssignmentInstanceReference) {
    this.readerAssignmentInstanceReference = readerAssignmentInstanceReference;
  }


  /**
   * Get readerAssignmentInstanceRecord
   * @return readerAssignmentInstanceRecord
  **/

  public BQReaderAssignmentUpdateInputModelReaderAssignmentInstanceRecord getReaderAssignmentInstanceRecord() {
    return readerAssignmentInstanceRecord;
  }

  public void setReaderAssignmentInstanceRecord(BQReaderAssignmentUpdateInputModelReaderAssignmentInstanceRecord readerAssignmentInstanceRecord) {
    this.readerAssignmentInstanceRecord = readerAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return readerAssignmentUpdateActionTaskRecord
  **/

  public Object getReaderAssignmentUpdateActionTaskRecord() {
    return readerAssignmentUpdateActionTaskRecord;
  }

  public void setReaderAssignmentUpdateActionTaskRecord(Object readerAssignmentUpdateActionTaskRecord) {
    this.readerAssignmentUpdateActionTaskRecord = readerAssignmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return readerAssignmentUpdateActionRequest
  **/

  public String getReaderAssignmentUpdateActionRequest() {
    return readerAssignmentUpdateActionRequest;
  }

  public void setReaderAssignmentUpdateActionRequest(String readerAssignmentUpdateActionRequest) {
    this.readerAssignmentUpdateActionRequest = readerAssignmentUpdateActionRequest;
  }


}

