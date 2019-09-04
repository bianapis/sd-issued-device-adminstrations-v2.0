package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceReport
 */
public class BQQuestionAssignmentRetrieveInputModelQuestionAssignmentInstanceReport   {
  private String questionAssignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return questionAssignmentInstanceReportReference
  **/

  public String getQuestionAssignmentInstanceReportReference() {
    return questionAssignmentInstanceReportReference;
  }

  public void setQuestionAssignmentInstanceReportReference(String questionAssignmentInstanceReportReference) {
    this.questionAssignmentInstanceReportReference = questionAssignmentInstanceReportReference;
  }


}

