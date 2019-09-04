package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceAnalysis;
import org.bian.dto.BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentRetrieveInputModel
 */
public class BQChequesAssignmentRetrieveInputModel   {
  private Object chequesAssignmentRetrieveActionTaskRecord = null;

  private String chequesAssignmentRetrieveActionRequest = null;

  private BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceReport chequesAssignmentInstanceReport = null;

  private BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceAnalysis chequesAssignmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return chequesAssignmentRetrieveActionTaskRecord
  **/

  public Object getChequesAssignmentRetrieveActionTaskRecord() {
    return chequesAssignmentRetrieveActionTaskRecord;
  }

  public void setChequesAssignmentRetrieveActionTaskRecord(Object chequesAssignmentRetrieveActionTaskRecord) {
    this.chequesAssignmentRetrieveActionTaskRecord = chequesAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return chequesAssignmentRetrieveActionRequest
  **/

  public String getChequesAssignmentRetrieveActionRequest() {
    return chequesAssignmentRetrieveActionRequest;
  }

  public void setChequesAssignmentRetrieveActionRequest(String chequesAssignmentRetrieveActionRequest) {
    this.chequesAssignmentRetrieveActionRequest = chequesAssignmentRetrieveActionRequest;
  }


  /**
   * Get chequesAssignmentInstanceReport
   * @return chequesAssignmentInstanceReport
  **/

  public BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceReport getChequesAssignmentInstanceReport() {
    return chequesAssignmentInstanceReport;
  }

  public void setChequesAssignmentInstanceReport(BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceReport chequesAssignmentInstanceReport) {
    this.chequesAssignmentInstanceReport = chequesAssignmentInstanceReport;
  }


  /**
   * Get chequesAssignmentInstanceAnalysis
   * @return chequesAssignmentInstanceAnalysis
  **/

  public BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceAnalysis getChequesAssignmentInstanceAnalysis() {
    return chequesAssignmentInstanceAnalysis;
  }

  public void setChequesAssignmentInstanceAnalysis(BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceAnalysis chequesAssignmentInstanceAnalysis) {
    this.chequesAssignmentInstanceAnalysis = chequesAssignmentInstanceAnalysis;
  }


}

