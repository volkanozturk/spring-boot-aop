package com.volkanozturk.springbootaop.service;

import org.springframework.stereotype.Service;

/**
 * @author volkanozturk
 */
@Service
public class MessageService {

  public String getMessage(String param) {
    System.out.println("Messages :" + param);
    return param;
  }
}
