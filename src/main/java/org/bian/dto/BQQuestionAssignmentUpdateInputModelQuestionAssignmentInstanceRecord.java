package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQuestionAssignmentUpdateInputModelQuestionAssignmentInstanceRecord
 */
public class BQQuestionAssignmentUpdateInputModelQuestionAssignmentInstanceRecord   {
  private String requestText = null;

  private String usageLog = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and frequency of access/use - includes errors for fraud detection 
   * @return usageLog
  **/

  public String getUsageLog() {
    return usageLog;
  }

  public void setUsageLog(String usageLog) {
    this.usageLog = usageLog;
  }


}

