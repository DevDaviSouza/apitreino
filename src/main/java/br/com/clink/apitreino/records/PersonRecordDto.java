package br.com.clink.apitreino.records;
import jakarta.validation.constraints.NotBlank;

public record PersonRecordDto(@NotBlank String fistName, @NotBlank String lastName, @NotBlank String adress , @NotBlank String gender) {}
