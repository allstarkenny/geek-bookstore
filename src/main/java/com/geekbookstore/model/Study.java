package com.geekbookstore.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Study {
    String id;
    String image;
    String title;
    List<String> memberIdList;
    int memberCount;
    String description;
    Date startDate;
}
