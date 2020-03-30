
package com.example.validate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "book"
})
public class BookData3 {

    @Valid
    @JsonProperty("book")
    private List<Book> book = null;

    @JsonProperty("book")
    public List<Book> getBook() {
        return book;
    }

    @JsonProperty("book")
    public void setBook(List<Book> book) {
        this.book = book;
    }

}