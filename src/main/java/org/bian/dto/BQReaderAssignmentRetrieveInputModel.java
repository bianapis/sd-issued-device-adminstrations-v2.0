package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceAnalysis;
import org.bian.dto.BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentRetrieveInputModel
 */
public class BQReaderAssignmentRetrieveInputModel   {
  private Object readerAssignmentRetrieveActionTaskRecord = null;

  private String readerAssignmentRetrieveActionRequest = null;

  private BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceReport readerAssignmentInstanceReport = null;

  private BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceAnalysis readerAssignmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return readerAssignmentRetrieveActionRequest
  **/

  public String getReaderAssignmentRetrieveActionRequest() {
    return readerAssignmentRetrieveActionRequest;
  }

  public void setReaderAssignmentRetrieveActionRequest(String readerAssignmentRetrieveActionRequest) {
    this.readerAssignmentRetrieveActionRequest = readerAssignmentRetrieveActionRequest;
  }


  /**
   * Get readerAssignmentInstanceReport
   * @return readerAssignmentInstanceReport
  **/

  public BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceReport getReaderAssignmentInstanceReport() {
    return readerAssignmentInstanceReport;
  }

  public void setReaderAssignmentInstanceReport(BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceReport readerAssignmentInstanceReport) {
    this.readerAssignmentInstanceReport = readerAssignmentInstanceReport;
  }


  /**
   * Get readerAssignmentInstanceAnalysis
   * @return readerAssignmentInstanceAnalysis
  **/

  public BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceAnalysis getReaderAssignmentInstanceAnalysis() {
    return readerAssignmentInstanceAnalysis;
  }

  public void setReaderAssignmentInstanceAnalysis(BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceAnalysis readerAssignmentInstanceAnalysis) {
    this.readerAssignmentInstanceAnalysis = readerAssignmentInstanceAnalysis;
  }


}

