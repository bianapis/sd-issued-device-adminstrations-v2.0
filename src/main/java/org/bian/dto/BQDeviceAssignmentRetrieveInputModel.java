package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceAnalysis;
import org.bian.dto.BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentRetrieveInputModel
 */
public class BQDeviceAssignmentRetrieveInputModel   {
  private Object deviceAssignmentRetrieveActionTaskRecord = null;

  private String deviceAssignmentRetrieveActionRequest = null;

  private BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceReport deviceAssignmentInstanceReport = null;

  private BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceAnalysis deviceAssignmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return deviceAssignmentRetrieveActionTaskRecord
  **/

  public Object getDeviceAssignmentRetrieveActionTaskRecord() {
    return deviceAssignmentRetrieveActionTaskRecord;
  }

  public void setDeviceAssignmentRetrieveActionTaskRecord(Object deviceAssignmentRetrieveActionTaskRecord) {
    this.deviceAssignmentRetrieveActionTaskRecord = deviceAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return deviceAssignmentRetrieveActionRequest
  **/

  public String getDeviceAssignmentRetrieveActionRequest() {
    return deviceAssignmentRetrieveActionRequest;
  }

  public void setDeviceAssignmentRetrieveActionRequest(String deviceAssignmentRetrieveActionRequest) {
    this.deviceAssignmentRetrieveActionRequest = deviceAssignmentRetrieveActionRequest;
  }


  /**
   * Get deviceAssignmentInstanceReport
   * @return deviceAssignmentInstanceReport
  **/

  public BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceReport getDeviceAssignmentInstanceReport() {
    return deviceAssignmentInstanceReport;
  }

  public void setDeviceAssignmentInstanceReport(BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceReport deviceAssignmentInstanceReport) {
    this.deviceAssignmentInstanceReport = deviceAssignmentInstanceReport;
  }


  /**
   * Get deviceAssignmentInstanceAnalysis
   * @return deviceAssignmentInstanceAnalysis
  **/

  public BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceAnalysis getDeviceAssignmentInstanceAnalysis() {
    return deviceAssignmentInstanceAnalysis;
  }

  public void setDeviceAssignmentInstanceAnalysis(BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceAnalysis deviceAssignmentInstanceAnalysis) {
    this.deviceAssignmentInstanceAnalysis = deviceAssignmentInstanceAnalysis;
  }


}

