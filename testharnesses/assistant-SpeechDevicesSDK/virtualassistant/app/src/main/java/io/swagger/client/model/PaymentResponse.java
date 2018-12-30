/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    � 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PaymentAddress;
import java.io.IOException;

/**
 * A PaymentResponse is returned when a user has selected a payment method and approved a payment request
 */
@ApiModel(description = "A PaymentResponse is returned when a user has selected a payment method and approved a payment request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-29T10:06:15.114-07:00")
public class PaymentResponse {
  @SerializedName("methodName")
  private String methodName = null;

  @SerializedName("details")
  private Object details = null;

  @SerializedName("shippingAddress")
  private PaymentAddress shippingAddress = null;

  @SerializedName("shippingOption")
  private String shippingOption = null;

  @SerializedName("payerEmail")
  private String payerEmail = null;

  @SerializedName("payerPhone")
  private String payerPhone = null;

  public PaymentResponse methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

   /**
   * The payment method identifier for the payment method that the user selected to fulfil the transaction
   * @return methodName
  **/
  @ApiModelProperty(value = "The payment method identifier for the payment method that the user selected to fulfil the transaction")
  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public PaymentResponse details(Object details) {
    this.details = details;
    return this;
  }

   /**
   * A JSON-serializable object that provides a payment method specific message used by the merchant to process the transaction and determine successful fund transfer
   * @return details
  **/
  @ApiModelProperty(value = "A JSON-serializable object that provides a payment method specific message used by the merchant to process the transaction and determine successful fund transfer")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  public PaymentResponse shippingAddress(PaymentAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * If the requestShipping flag was set to true in the PaymentOptions passed to the PaymentRequest constructor, then shippingAddress will be the full and final shipping address chosen by the user
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "If the requestShipping flag was set to true in the PaymentOptions passed to the PaymentRequest constructor, then shippingAddress will be the full and final shipping address chosen by the user")
  public PaymentAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(PaymentAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public PaymentResponse shippingOption(String shippingOption) {
    this.shippingOption = shippingOption;
    return this;
  }

   /**
   * If the requestShipping flag was set to true in the PaymentOptions passed to the PaymentRequest constructor, then shippingOption will be the id attribute of the selected shipping option
   * @return shippingOption
  **/
  @ApiModelProperty(value = "If the requestShipping flag was set to true in the PaymentOptions passed to the PaymentRequest constructor, then shippingOption will be the id attribute of the selected shipping option")
  public String getShippingOption() {
    return shippingOption;
  }

  public void setShippingOption(String shippingOption) {
    this.shippingOption = shippingOption;
  }

  public PaymentResponse payerEmail(String payerEmail) {
    this.payerEmail = payerEmail;
    return this;
  }

   /**
   * If the requestPayerEmail flag was set to true in the PaymentOptions passed to the PaymentRequest constructor, then payerEmail will be the email address chosen by the user
   * @return payerEmail
  **/
  @ApiModelProperty(value = "If the requestPayerEmail flag was set to true in the PaymentOptions passed to the PaymentRequest constructor, then payerEmail will be the email address chosen by the user")
  public String getPayerEmail() {
    return payerEmail;
  }

  public void setPayerEmail(String payerEmail) {
    this.payerEmail = payerEmail;
  }

  public PaymentResponse payerPhone(String payerPhone) {
    this.payerPhone = payerPhone;
    return this;
  }

   /**
   * If the requestPayerPhone flag was set to true in the PaymentOptions passed to the PaymentRequest constructor, then payerPhone will be the phone number chosen by the user
   * @return payerPhone
  **/
  @ApiModelProperty(value = "If the requestPayerPhone flag was set to true in the PaymentOptions passed to the PaymentRequest constructor, then payerPhone will be the phone number chosen by the user")
  public String getPayerPhone() {
    return payerPhone;
  }

  public void setPayerPhone(String payerPhone) {
    this.payerPhone = payerPhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResponse paymentResponse = (PaymentResponse) o;
    return Objects.equals(this.methodName, paymentResponse.methodName) &&
        Objects.equals(this.details, paymentResponse.details) &&
        Objects.equals(this.shippingAddress, paymentResponse.shippingAddress) &&
        Objects.equals(this.shippingOption, paymentResponse.shippingOption) &&
        Objects.equals(this.payerEmail, paymentResponse.payerEmail) &&
        Objects.equals(this.payerPhone, paymentResponse.payerPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodName, details, shippingAddress, shippingOption, payerEmail, payerPhone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponse {\n");
    
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingOption: ").append(toIndentedString(shippingOption)).append("\n");
    sb.append("    payerEmail: ").append(toIndentedString(payerEmail)).append("\n");
    sb.append("    payerPhone: ").append(toIndentedString(payerPhone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

