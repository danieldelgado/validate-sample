package com.example.validate;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Validated
@RestController
class ValidateRequestBodyController {

  @PostMapping("/endpoint")
  ResponseEntity<String> validateBody(@Valid @RequestBody BookData1 book) {
    return ResponseEntity.ok("valid");
  }

  @PostMapping("/endpoint2")
  ResponseEntity<String> validateBody(@Valid @RequestBody BookData2 book) {
    return ResponseEntity.ok("valid");
  }

  @PostMapping("/endpoint3")
  ResponseEntity<String> validateBody(
          @NotEmpty(message = "Input book list cannot be empty.")
          @RequestBody List< @Valid BookData2> book) {
    return ResponseEntity.ok("valid");
  }


  @PostMapping("/endpoint4")
  ResponseEntity<String> validateBody(
          @RequestBody @Valid BookData3 book) {
    return ResponseEntity.ok("valid");
  }

}