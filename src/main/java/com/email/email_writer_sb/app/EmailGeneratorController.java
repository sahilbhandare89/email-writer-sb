package com.email.email_writer_sb.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<Map<String, String>> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailGeneratorService.ganerateEmailReply(emailRequest);
        return ResponseEntity.ok(Map.of("reply", response)); // ✅ Valid JSON
    }
}
