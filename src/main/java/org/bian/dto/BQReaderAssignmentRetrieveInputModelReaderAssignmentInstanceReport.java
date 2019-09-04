package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceReport
 */
public class BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceReport   {
  private String readerAssignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return readerAssignmentInstanceReportReference
  **/

  public String getReaderAssignmentInstanceReportReference() {
    return readerAssignmentInstanceReportReference;
  }

  public void setReaderAssignmentInstanceReportReference(String readerAssignmentInstanceReportReference) {
    this.readerAssignmentInstanceReportReference = readerAssignmentInstanceReportReference;
  }


}

