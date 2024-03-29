package com.tpr.controllers;

import com.tpr.entities.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    @PostMapping(value = "/excel", consumes = MediaType.APPLICATION_JSON_VALUE)
    public byte[] getExcelRepost(@RequestBody List<Student> students) {
        return new byte[]{};
    }
}
