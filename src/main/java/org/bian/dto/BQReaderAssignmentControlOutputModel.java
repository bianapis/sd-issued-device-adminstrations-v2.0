package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentControlOutputModel
 */
public class BQReaderAssignmentControlOutputModel   {
  private String readerAssignmentControlActionTaskReference = null;

  private Object readerAssignmentControlActionTaskRecord = null;

  private String readerAssignmentControlActionResponse = null;

  private String readerAssignmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reader Assignment instance control processing service call 
   * @return readerAssignmentControlActionTaskReference
  **/

  public String getReaderAssignmentControlActionTaskReference() {
    return readerAssignmentControlActionTaskReference;
  }

  public void setReaderAssignmentControlActionTaskReference(String readerAssignmentControlActionTaskReference) {
    this.readerAssignmentControlActionTaskReference = readerAssignmentControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return readerAssignmentControlActionResponse
  **/

  public String getReaderAssignmentControlActionResponse() {
    return readerAssignmentControlActionResponse;
  }

  public void setReaderAssignmentControlActionResponse(String readerAssignmentControlActionResponse) {
    this.readerAssignmentControlActionResponse = readerAssignmentControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Reader Assignment instance (e.g. initialised, pending, active) 
   * @return readerAssignmentInstanceStatus
  **/

  public String getReaderAssignmentInstanceStatus() {
    return readerAssignmentInstanceStatus;
  }

  public void setReaderAssignmentInstanceStatus(String readerAssignmentInstanceStatus) {
    this.readerAssignmentInstanceStatus = readerAssignmentInstanceStatus;
  }


}

