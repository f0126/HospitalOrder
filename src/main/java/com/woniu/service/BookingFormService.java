package com.woniu.service;

import java.util.List;

import com.woniu.domain.Bookingform;

public interface BookingFormService {
    void save(Bookingform bookingform);
    void update(Bookingform bookingform);
    void delete(Integer bookingid);
    Bookingform find(Integer bookingid);
    List<Bookingform> find();
    
}
