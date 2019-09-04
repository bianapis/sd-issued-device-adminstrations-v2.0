package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceAnalysis;
import org.bian.dto.BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentRetrieveInputModel
 */
public class BQBiometricAssignmentRetrieveInputModel   {
  private Object biometricAssignmentRetrieveActionTaskRecord = null;

  private String biometricAssignmentRetrieveActionRequest = null;

  private BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceReport biometricAssignmentInstanceReport = null;

  private BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceAnalysis biometricAssignmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return biometricAssignmentRetrieveActionTaskRecord
  **/

  public Object getBiometricAssignmentRetrieveActionTaskRecord() {
    return biometricAssignmentRetrieveActionTaskRecord;
  }

  public void setBiometricAssignmentRetrieveActionTaskRecord(Object biometricAssignmentRetrieveActionTaskRecord) {
    this.biometricAssignmentRetrieveActionTaskRecord = biometricAssignmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return biometricAssignmentRetrieveActionRequest
  **/

  public String getBiometricAssignmentRetrieveActionRequest() {
    return biometricAssignmentRetrieveActionRequest;
  }

  public void setBiometricAssignmentRetrieveActionRequest(String biometricAssignmentRetrieveActionRequest) {
    this.biometricAssignmentRetrieveActionRequest = biometricAssignmentRetrieveActionRequest;
  }


  /**
   * Get biometricAssignmentInstanceReport
   * @return biometricAssignmentInstanceReport
  **/

  public BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceReport getBiometricAssignmentInstanceReport() {
    return biometricAssignmentInstanceReport;
  }

  public void setBiometricAssignmentInstanceReport(BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceReport biometricAssignmentInstanceReport) {
    this.biometricAssignmentInstanceReport = biometricAssignmentInstanceReport;
  }


  /**
   * Get biometricAssignmentInstanceAnalysis
   * @return biometricAssignmentInstanceAnalysis
  **/

  public BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceAnalysis getBiometricAssignmentInstanceAnalysis() {
    return biometricAssignmentInstanceAnalysis;
  }

  public void setBiometricAssignmentInstanceAnalysis(BQBiometricAssignmentRetrieveInputModelBiometricAssignmentInstanceAnalysis biometricAssignmentInstanceAnalysis) {
    this.biometricAssignmentInstanceAnalysis = biometricAssignmentInstanceAnalysis;
  }


}

