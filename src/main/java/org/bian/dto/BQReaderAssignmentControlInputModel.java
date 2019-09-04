package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentControlInputModel
 */
public class BQReaderAssignmentControlInputModel   {
  private String issuedDeviceAllocationInstanceReference = null;

  private String readerAssignmentInstanceReference = null;

  private Object readerAssignmentControlActionTaskRecord = null;

  private CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest readerAssignmentControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return readerAssignmentControlActionTaskRecord
  **/

  public Object getReaderAssignmentControlActionTaskRecord() {
    return readerAssignmentControlActionTaskRecord;
  }

  public void setReaderAssignmentControlActionTaskRecord(Object readerAssignmentControlActionTaskRecord) {
    this.readerAssignmentControlActionTaskRecord = readerAssignmentControlActionTaskRecord;
  }


  /**
   * Get readerAssignmentControlActionRequest
   * @return readerAssignmentControlActionRequest
  **/

  public CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest getReaderAssignmentControlActionRequest() {
    return readerAssignmentControlActionRequest;
  }

  public void setReaderAssignmentControlActionRequest(CRIssuedDeviceAllocationControlInputModelIssuedDeviceAllocationControlActionRequest readerAssignmentControlActionRequest) {
    this.readerAssignmentControlActionRequest = readerAssignmentControlActionRequest;
  }


}

