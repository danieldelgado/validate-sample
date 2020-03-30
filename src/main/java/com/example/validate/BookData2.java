package com.example.validate;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BookData2 {

    @NotEmpty
    private String data1;

    @NotNull
    private String data2;


}
