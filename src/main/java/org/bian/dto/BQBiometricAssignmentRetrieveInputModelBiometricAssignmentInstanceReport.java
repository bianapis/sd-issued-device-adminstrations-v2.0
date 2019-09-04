package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceReport
 */
public class BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceReport   {
  private String biometricAssignmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return biometricAssignmentInstanceReportReference
  **/

  public String getBiometricAssignmentInstanceReportReference() {
    return biometricAssignmentInstanceReportReference;
  }

  public void setBiometricAssignmentInstanceReportReference(String biometricAssignmentInstanceReportReference) {
    this.biometricAssignmentInstanceReportReference = biometricAssignmentInstanceReportReference;
  }


}

