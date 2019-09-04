package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceReport
 */
public class BQDeviceAssignmentRetrieveInputModelDeviceAssignmentInstanceReport   {
  private String deviceAssignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return deviceAssignmentInstanceReportReference
  **/

  public String getDeviceAssignmentInstanceReportReference() {
    return deviceAssignmentInstanceReportReference;
  }

  public void setDeviceAssignmentInstanceReportReference(String deviceAssignmentInstanceReportReference) {
    this.deviceAssignmentInstanceReportReference = deviceAssignmentInstanceReportReference;
  }


}

