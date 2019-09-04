package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReaderAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord;
import org.bian.dto.BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceAnalysis;
import org.bian.dto.BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceReport;
import org.bian.dto.BQReaderAssignmentUpdateInputModelReaderAssignmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentRetrieveOutputModel
 */
public class BQReaderAssignmentRetrieveOutputModel   {
  private BQReaderAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQReaderAssignmentUpdateInputModelReaderAssignmentInstanceRecord readerAssignmentInstanceRecord = null;

  private String readerAssignmentRetrieveActionTaskReference = null;

  private Object readerAssignmentRetrieveActionTaskRecord = null;

  private String readerAssignmentRetrieveActionResponse = null;

  private BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceReport readerAssignmentInstanceReport = null;

  private BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceAnalysis readerAssignmentInstanceAnalysis = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQReaderAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQReaderAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reader Assignment instance retrieve service call 
   * @return readerAssignmentRetrieveActionTaskReference
  **/

  public String getReaderAssignmentRetrieveActionTaskReference() {
    return readerAssignmentRetrieveActionTaskReference;
  }

  public void setReaderAssignmentRetrieveActionTaskReference(String readerAssignmentRetrieveActionTaskReference) {
    this.readerAssignmentRetrieveActionTaskReference = readerAssignmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return readerAssignmentRetrieveActionTaskRecord
  **/

  public Object getReaderAssignmentRetrieveActionTaskRecord() {
    return readerAssignmentRetrieveActionTaskRecord;
  }

  public void setReaderAssignmentRetrieveActionTaskRecord(Object readerAssignmentRetrieveActionTaskRecord) {
    this.readerAssignmentRetrieveActionTaskRecord = readerAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return readerAssignmentRetrieveActionResponse
  **/

  public String getReaderAssignmentRetrieveActionResponse() {
    return readerAssignmentRetrieveActionResponse;
  }

  public void setReaderAssignmentRetrieveActionResponse(String readerAssignmentRetrieveActionResponse) {
    this.readerAssignmentRetrieveActionResponse = readerAssignmentRetrieveActionResponse;
  }


  /**
   * Get readerAssignmentInstanceReport
   * @return readerAssignmentInstanceReport
  **/

  public BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceReport getReaderAssignmentInstanceReport() {
    return readerAssignmentInstanceReport;
  }

  public void setReaderAssignmentInstanceReport(BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceReport readerAssignmentInstanceReport) {
    this.readerAssignmentInstanceReport = readerAssignmentInstanceReport;
  }


  /**
   * Get readerAssignmentInstanceAnalysis
   * @return readerAssignmentInstanceAnalysis
  **/

  public BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceAnalysis getReaderAssignmentInstanceAnalysis() {
    return readerAssignmentInstanceAnalysis;
  }

  public void setReaderAssignmentInstanceAnalysis(BQReaderAssignmentRetrieveOutputModelReaderAssignmentInstanceAnalysis readerAssignmentInstanceAnalysis) {
    this.readerAssignmentInstanceAnalysis = readerAssignmentInstanceAnalysis;
  }


}

