package com.example.profilemanager.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ResponseDTO<T> {
    private boolean orderLaterEnabled;
    private String stylesheet;
    private List<T> menuItems;
}
