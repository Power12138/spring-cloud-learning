package com.casic.common;
/*
 *Created with IntelliJ IDEA
 *User: tangcb
 *Date: 2019/10/13
 *Time: 19:12
 *Description:
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfosRequest {

    private List<Long> ids;

}
