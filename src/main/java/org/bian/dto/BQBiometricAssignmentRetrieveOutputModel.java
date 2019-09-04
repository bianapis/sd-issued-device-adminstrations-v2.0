package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord;
import org.bian.dto.BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceAnalysis;
import org.bian.dto.BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceReport;
import org.bian.dto.BQBiometricAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentRetrieveOutputModel
 */
public class BQBiometricAssignmentRetrieveOutputModel   {
  private BQBiometricAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord = null;

  private BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord = null;

  private String biometricAssignmentRetrieveActionTaskReference = null;

  private Object biometricAssignmentRetrieveActionTaskRecord = null;

  private String biometricAssignmentRetrieveActionResponse = null;

  private BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceReport biometricAssignmentInstanceReport = null;

  private BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceAnalysis biometricAssignmentInstanceAnalysis = null;


  /**
   * Get issuedDeviceAllocationInstanceRecord
   * @return issuedDeviceAllocationInstanceRecord
  **/

  public BQBiometricAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord getIssuedDeviceAllocationInstanceRecord() {
    return issuedDeviceAllocationInstanceRecord;
  }

  public void setIssuedDeviceAllocationInstanceRecord(BQBiometricAssignmentRetrieveOutputModelIssuedDeviceAllocationInstanceRecord issuedDeviceAllocationInstanceRecord) {
    this.issuedDeviceAllocationInstanceRecord = issuedDeviceAllocationInstanceRecord;
  }


  /**
   * Get biometricAssignmentInstanceRecord
   * @return biometricAssignmentInstanceRecord
  **/

  public BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord getBiometricAssignmentInstanceRecord() {
    return biometricAssignmentInstanceRecord;
  }

  public void setBiometricAssignmentInstanceRecord(BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord biometricAssignmentInstanceRecord) {
    this.biometricAssignmentInstanceRecord = biometricAssignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Biometric Assignment instance retrieve service call 
   * @return biometricAssignmentRetrieveActionTaskReference
  **/

  public String getBiometricAssignmentRetrieveActionTaskReference() {
    return biometricAssignmentRetrieveActionTaskReference;
  }

  public void setBiometricAssignmentRetrieveActionTaskReference(String biometricAssignmentRetrieveActionTaskReference) {
    this.biometricAssignmentRetrieveActionTaskReference = biometricAssignmentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return biometricAssignmentRetrieveActionResponse
  **/

  public String getBiometricAssignmentRetrieveActionResponse() {
    return biometricAssignmentRetrieveActionResponse;
  }

  public void setBiometricAssignmentRetrieveActionResponse(String biometricAssignmentRetrieveActionResponse) {
    this.biometricAssignmentRetrieveActionResponse = biometricAssignmentRetrieveActionResponse;
  }


  /**
   * Get biometricAssignmentInstanceReport
   * @return biometricAssignmentInstanceReport
  **/

  public BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceReport getBiometricAssignmentInstanceReport() {
    return biometricAssignmentInstanceReport;
  }

  public void setBiometricAssignmentInstanceReport(BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceReport biometricAssignmentInstanceReport) {
    this.biometricAssignmentInstanceReport = biometricAssignmentInstanceReport;
  }


  /**
   * Get biometricAssignmentInstanceAnalysis
   * @return biometricAssignmentInstanceAnalysis
  **/

  public BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceAnalysis getBiometricAssignmentInstanceAnalysis() {
    return biometricAssignmentInstanceAnalysis;
  }

  public void setBiometricAssignmentInstanceAnalysis(BQBiometricAssignmentRetrieveOutputModelBiometricAssignmentInstanceAnalysis biometricAssignmentInstanceAnalysis) {
    this.biometricAssignmentInstanceAnalysis = biometricAssignmentInstanceAnalysis;
  }


}

