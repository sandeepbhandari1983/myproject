package com.myproject.soapapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import  com.liverestaurant.orderservice.schema.*;
@Endpoint 
public class MyWSEndPoint 
{

    @PayloadRoot(localPart = "PlaceOrderRequest", namespace = "http://www.liverestaurant.com/OrderService/schema")       
	@ResponsePayload
  public PlaceOrderResponse order(@RequestPayload PlaceOrderRequest placeOrderRequest)
  {   
PlaceOrderResponse response= new PlaceOrderResponse();
  
  System.out.println("Test");
  response.setRefNumber("1");
  return response;
  }

}