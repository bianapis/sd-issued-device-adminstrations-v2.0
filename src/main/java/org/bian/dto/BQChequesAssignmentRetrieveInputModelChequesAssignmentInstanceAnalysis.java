package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceAnalysis
 */
public class BQChequesAssignmentRetrieveInputModelChequesAssignmentInstanceAnalysis   {
  private String chequesAssignmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return chequesAssignmentInstanceAnalysisReference
  **/

  public String getChequesAssignmentInstanceAnalysisReference() {
    return chequesAssignmentInstanceAnalysisReference;
  }

  public void setChequesAssignmentInstanceAnalysisReference(String chequesAssignmentInstanceAnalysisReference) {
    this.chequesAssignmentInstanceAnalysisReference = chequesAssignmentInstanceAnalysisReference;
  }


}

