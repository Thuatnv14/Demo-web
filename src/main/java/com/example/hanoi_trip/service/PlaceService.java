package com.example.hanoi_trip.service;

import com.example.hanoi_trip.Model.Place;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class PlaceService {
    public List<Place> getAllPlaces() {
        return Arrays.asList(
                new Place("Hồ Gươm", "Một trong những biểu tượng của Hà Nội."),
                new Place("Lăng Chủ tịch Hồ Chí Minh", "Lăng của vị lãnh tụ vĩ đại của Việt Nam."),
                new Place("Văn Miếu - Quốc Tử Giám", "Trường đại học đầu tiên của Việt Nam."),
                new Place("Phố Cổ Hà Nội", "Khu phố cổ kính và nhộn nhịp của Hà Nội."),
                new Place("Chùa Một Cột", "Ngôi chùa độc đáo với kiến trúc có một không hai.")
        );
    }
}
