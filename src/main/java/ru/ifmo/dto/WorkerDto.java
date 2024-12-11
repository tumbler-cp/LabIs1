package ru.ifmo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record WorkerDto (
        @JsonProperty("id")
        int id,
        @JsonProperty("name")
        String name
) {
}
