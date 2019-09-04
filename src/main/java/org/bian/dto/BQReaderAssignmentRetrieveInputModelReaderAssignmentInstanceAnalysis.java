package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceAnalysis
 */
public class BQReaderAssignmentRetrieveInputModelReaderAssignmentInstanceAnalysis   {
  private String readerAssignmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return readerAssignmentInstanceAnalysisReference
  **/

  public String getReaderAssignmentInstanceAnalysisReference() {
    return readerAssignmentInstanceAnalysisReference;
  }

  public void setReaderAssignmentInstanceAnalysisReference(String readerAssignmentInstanceAnalysisReference) {
    this.readerAssignmentInstanceAnalysisReference = readerAssignmentInstanceAnalysisReference;
  }


}

