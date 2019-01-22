package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardTerminalOperationResponse
 */
public class CardTerminalOperationResponse   {
  private String cardPOSTerminalOperatingSessionReference = null;

  private String cardPOSTerminalOperatingSchedule = null;

  private String cardPOSTermainalOperatingServiceConfiguration = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to active service session\" 
   * @return cardPOSTerminalOperatingSessionReference
  **/

  public String getCardPOSTerminalOperatingSessionReference() {
    return cardPOSTerminalOperatingSessionReference;
  }

  public void setCardPOSTerminalOperatingSessionReference(String cardPOSTerminalOperatingSessionReference) {
    this.cardPOSTerminalOperatingSessionReference = cardPOSTerminalOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"describes service availability\" 
   * @return cardPOSTerminalOperatingSchedule
  **/

  public String getCardPOSTerminalOperatingSchedule() {
    return cardPOSTerminalOperatingSchedule;
  }

  public void setCardPOSTerminalOperatingSchedule(String cardPOSTerminalOperatingSchedule) {
    this.cardPOSTerminalOperatingSchedule = cardPOSTerminalOperatingSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"service configuration setting\" 
   * @return cardPOSTermainalOperatingServiceConfiguration
  **/

  public String getCardPOSTermainalOperatingServiceConfiguration() {
    return cardPOSTermainalOperatingServiceConfiguration;
  }

  public void setCardPOSTermainalOperatingServiceConfiguration(String cardPOSTermainalOperatingServiceConfiguration) {
    this.cardPOSTermainalOperatingServiceConfiguration = cardPOSTermainalOperatingServiceConfiguration;
  }


}

