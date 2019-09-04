package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceReport
 */
public class BQPasswordAssignmentRetrieveInputModelPasswordAssignmentInstanceReport   {
  private String passwordAssignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return passwordAssignmentInstanceReportReference
  **/

  public String getPasswordAssignmentInstanceReportReference() {
    return passwordAssignmentInstanceReportReference;
  }

  public void setPasswordAssignmentInstanceReportReference(String passwordAssignmentInstanceReportReference) {
    this.passwordAssignmentInstanceReportReference = passwordAssignmentInstanceReportReference;
  }


}

