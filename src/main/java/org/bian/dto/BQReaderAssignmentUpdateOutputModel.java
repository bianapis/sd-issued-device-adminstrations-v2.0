package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReaderAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQReaderAssignmentUpdateInputModelReaderAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentUpdateOutputModel
 */
public class BQReaderAssignmentUpdateOutputModel   {
  private BQReaderAssignmentUpdateInputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQReaderAssignmentUpdateInputModelReaderAssignmentInstanceRecord readerAssignmentInstanceRecord = null;

  private String readerAssignmentUpdateActionTaskReference = null;

  private Object readerAssignmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return readerAssignmentUpdateActionTaskReference
  **/

  public String getReaderAssignmentUpdateActionTaskReference() {
    return readerAssignmentUpdateActionTaskReference;
  }

  public void setReaderAssignmentUpdateActionTaskReference(String readerAssignmentUpdateActionTaskReference) {
    this.readerAssignmentUpdateActionTaskReference = readerAssignmentUpdateActionTaskReference;
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

