package com.volkanozturk.springbootaop.service;

import org.springframework.stereotype.Service;

/**
 * @author volkanozturk
 */
@Service
public class OtherMessageService {

  public String getOtherMessage(String param) {
    System.out.println("Messages :" + param);
    return param;
  }
}