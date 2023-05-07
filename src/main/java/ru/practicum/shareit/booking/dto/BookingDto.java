package ru.practicum.shareit.booking.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import java.time.LocalDateTime;

/**
 * TODO Sprint add-bookings.
 */
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingDto {

    long id;

    long itemId;

    @FutureOrPresent
    LocalDateTime start;

    @Future
    LocalDateTime end;

}
