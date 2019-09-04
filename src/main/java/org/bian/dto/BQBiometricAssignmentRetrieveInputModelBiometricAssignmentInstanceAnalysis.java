package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceAnalysis
 */
public class BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceAnalysis   {
  private String biometricAssignmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return biometricAssignmentInstanceAnalysisReference
  **/

  public String getBiometricAssignmentInstanceAnalysisReference() {
    return biometricAssignmentInstanceAnalysisReference;
  }

  public void setBiometricAssignmentInstanceAnalysisReference(String biometricAssignmentInstanceAnalysisReference) {
    this.biometricAssignmentInstanceAnalysisReference = biometricAssignmentInstanceAnalysisReference;
  }


}

