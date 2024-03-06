package org.example.demodate;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
public class Response {
    private String zoneId = ZoneId.systemDefault().getId();
    private Instant instant = Instant.now();
    private OffsetDateTime offsetDateTime = OffsetDateTime.now();
    private ZonedDateTime zonedDateTime = ZonedDateTime.now();
    private LocalDateTime localDateTime = LocalDateTime.now();
    private LocalDate localDate = LocalDate.now();
    private Date date = new Date();
}
