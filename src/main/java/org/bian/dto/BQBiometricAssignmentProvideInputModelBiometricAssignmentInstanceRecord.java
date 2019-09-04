package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord
 */
public class BQBiometricAssignmentProvideInputModelBiometricAssignmentInstanceRecord   {
  private String biometricType = null;

  private String biometricRegisteredDetail = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Type of biometric record being used (e.g. face, fingerprint, signature) 
   * @return biometricType
  **/

  public String getBiometricType() {
    return biometricType;
  }

  public void setBiometricType(String biometricType) {
    this.biometricType = biometricType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The stored biometric value possibly in suitably encrypted form 
   * @return biometricRegisteredDetail
  **/

  public String getBiometricRegisteredDetail() {
    return biometricRegisteredDetail;
  }

  public void setBiometricRegisteredDetail(String biometricRegisteredDetail) {
    this.biometricRegisteredDetail = biometricRegisteredDetail;
  }


}

