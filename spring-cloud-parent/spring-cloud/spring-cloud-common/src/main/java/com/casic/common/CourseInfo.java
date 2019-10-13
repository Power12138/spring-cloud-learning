package com.casic.common;
/*
 *Created with IntelliJ IDEA
 *User: tangcb
 *Date: 2019/10/13
 *Time: 18:58
 *Description:
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfo {

    private Long id;
    private String courseName;
    private String courseType;
    private String courseIcon;
    private String courseIntro;

    //返回一个非法的构造类时，在输入默认参数,-1L，后面加空格，以此类推，就会自动提示的语句
    public static CourseInfo invalid() {
        return new CourseInfo(-1L, "" ,"" ,"" ,"");
    }


}
