package com.volkanozturk.springbootaop.api;

import com.volkanozturk.springbootaop.service.MessageService;
import com.volkanozturk.springbootaop.service.OtherMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author volkanozturk
 */
@RestController
@RequestMapping("/message")
public class MessageApi {

  @Autowired
  private MessageService messageService;

  @Autowired
  private OtherMessageService otherMessageService;

  @PostMapping
  public ResponseEntity<String> ornekMethod(@RequestBody String message) {
    otherMessageService.getOtherMessage(message);
    return ResponseEntity.ok(messageService.getMessage(message));
  }
}
