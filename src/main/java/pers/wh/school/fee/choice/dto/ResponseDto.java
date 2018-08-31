package pers.wh.school.fee.choice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
public class ResponseDto {

    private int code;
    private String desc;
    private Object data;

}
