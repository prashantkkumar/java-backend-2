package org.example.practice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
    private String message;
    private String status;
    private LocalTime time;
    private Object data;

    public Response(String message,Object data) {}
}
