package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPasswordAssignmentProvideOutputModelPasswordAssignmentInstanceRecord
 */
public class BQPasswordAssignmentProvideOutputModelPasswordAssignmentInstanceRecord   {
  private String formatRules = null;

  private String recentValues = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required format or minimum requirements for the password (e.g. 8 chars) 
   * @return formatRules
  **/

  public String getFormatRules() {
    return formatRules;
  }

  public void setFormatRules(String formatRules) {
    this.formatRules = formatRules;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Recent values maintained to eliminate repeated values 
   * @return recentValues
  **/

  public String getRecentValues() {
    return recentValues;
  }

  public void setRecentValues(String recentValues) {
    this.recentValues = recentValues;
  }


}

