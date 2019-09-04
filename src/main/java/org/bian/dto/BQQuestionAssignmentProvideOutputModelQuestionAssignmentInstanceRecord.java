package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentProvideOutputModelQuestionAssignmentInstanceRecord
 */
public class BQQuestionAssignmentProvideOutputModelQuestionAssignmentInstanceRecord   {
  private String formatRules = null;

  private String recentValues = null;

  private String requestText = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the minimum requirements for answers 
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Used to select secret questions and access prompts 
   * @return requestText
  **/

  public String getRequestText() {
    return requestText;
  }

  public void setRequestText(String requestText) {
    this.requestText = requestText;
  }


}

