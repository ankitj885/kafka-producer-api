package com.utility.kafkaproducerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class EventBase {
    public Long eventTimeStamp;
    public String eventId;
    public String type;
    public String trackingId;
}
