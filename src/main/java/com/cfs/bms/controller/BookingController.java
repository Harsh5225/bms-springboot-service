package com.cfs.bms.controller;


import com.cfs.bms.dto.BookingDto;
import com.cfs.bms.dto.BookingRequestDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {


    @PostMapping
    public ResponseEntity<BookingDto>createBooking(@Valid @RequestBody BookingRequestDto bookingRequest){

        return new ResponseEntity<>(bookingService.createBooking(bookingRequest), HttpStatus.CREATED);


    }

}
