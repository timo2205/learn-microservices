package com.timothy.restaurant.kafka.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event implements Serializable {
    @Serial
    private static final long serialVersionUID = -474166644334136379L;

    @JsonProperty("message1")
    private String message1;

    @JsonProperty("message2")
    private String message2;
}
