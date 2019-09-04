package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceAnalysis;
import org.bian.dto.BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceRecord;
import org.bian.dto.BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceReport;
import org.bian.dto.BQDeviceAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentRetrieveOutputModel
 */
public class BQDeviceAssignmentRetrieveOutputModel   {
  private BQDeviceAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceRecord deviceAssignmentInstanceRecord = null;

  private String deviceAssignmentRetrieveActionTaskReference = null;

  private Object deviceAssignmentRetrieveActionTaskRecord = null;

  private String deviceAssignmentRetrieveActionResponse = null;

  private BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceReport deviceAssignmentInstanceReport = null;

  private BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceAnalysis deviceAssignmentInstanceAnalysis = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQDeviceAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQDeviceAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * Get deviceAssignmentInstanceRecord
   * @return deviceAssignmentInstanceRecord
  **/

  public BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceRecord getDeviceAssignmentInstanceRecord() {
    return deviceAssignmentInstanceRecord;
  }

  public void setDeviceAssignmentInstanceRecord(BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceRecord deviceAssignmentInstanceRecord) {
    this.deviceAssignmentInstanceRecord = deviceAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Device Assignment instance retrieve service call 
   * @return deviceAssignmentRetrieveActionTaskReference
  **/

  public String getDeviceAssignmentRetrieveActionTaskReference() {
    return deviceAssignmentRetrieveActionTaskReference;
  }

  public void setDeviceAssignmentRetrieveActionTaskReference(String deviceAssignmentRetrieveActionTaskReference) {
    this.deviceAssignmentRetrieveActionTaskReference = deviceAssignmentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return deviceAssignmentRetrieveActionResponse
  **/

  public String getDeviceAssignmentRetrieveActionResponse() {
    return deviceAssignmentRetrieveActionResponse;
  }

  public void setDeviceAssignmentRetrieveActionResponse(String deviceAssignmentRetrieveActionResponse) {
    this.deviceAssignmentRetrieveActionResponse = deviceAssignmentRetrieveActionResponse;
  }


  /**
   * Get deviceAssignmentInstanceReport
   * @return deviceAssignmentInstanceReport
  **/

  public BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceReport getDeviceAssignmentInstanceReport() {
    return deviceAssignmentInstanceReport;
  }

  public void setDeviceAssignmentInstanceReport(BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceReport deviceAssignmentInstanceReport) {
    this.deviceAssignmentInstanceReport = deviceAssignmentInstanceReport;
  }


  /**
   * Get deviceAssignmentInstanceAnalysis
   * @return deviceAssignmentInstanceAnalysis
  **/

  public BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceAnalysis getDeviceAssignmentInstanceAnalysis() {
    return deviceAssignmentInstanceAnalysis;
  }

  public void setDeviceAssignmentInstanceAnalysis(BQDeviceAssignmentRetrieveOutputModelDeviceAssignmentInstanceAnalysis deviceAssignmentInstanceAnalysis) {
    this.deviceAssignmentInstanceAnalysis = deviceAssignmentInstanceAnalysis;
  }


}

