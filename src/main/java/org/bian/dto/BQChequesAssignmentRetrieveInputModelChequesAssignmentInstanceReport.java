package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceReport
 */
public class BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceReport   {
  private String chequesAssignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return chequesAssignmentInstanceReportReference
  **/

  public String getChequesAssignmentInstanceReportReference() {
    return chequesAssignmentInstanceReportReference;
  }

  public void setChequesAssignmentInstanceReportReference(String chequesAssignmentInstanceReportReference) {
    this.chequesAssignmentInstanceReportReference = chequesAssignmentInstanceReportReference;
  }


}

