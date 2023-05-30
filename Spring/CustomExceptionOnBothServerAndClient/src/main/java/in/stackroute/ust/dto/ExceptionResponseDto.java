package in.stackroute.ust.dto;

import java.time.LocalDateTime;

public record ExceptionResponseDto(String message, LocalDateTime timestamp) {
}
