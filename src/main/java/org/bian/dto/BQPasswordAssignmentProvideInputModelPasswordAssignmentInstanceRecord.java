package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentProvideInputModelPasswordAssignmentInstanceRecord
 */
public class BQPasswordAssignmentProvideInputModelPasswordAssignmentInstanceRecord   {
  private String passwordValue = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The stored value possibly in suitably encrypted form 
   * @return passwordValue
  **/

  public String getPasswordValue() {
    return passwordValue;
  }

  public void setPasswordValue(String passwordValue) {
    this.passwordValue = passwordValue;
  }


}

