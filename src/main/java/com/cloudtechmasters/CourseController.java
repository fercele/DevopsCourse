package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
//create two endpoints getAllAwsServices and getAllDevopsTools
    private static final String BD_CREDENTIALS = "MYPASSWORD123";
    
    @GetMapping("/getAllAwsServices")
    public List<String> getAllAwsServices(){
        System.out.println(BD_CREDENTIALS);
        return Arrays.asList("ec2","iam","rds","ecr","eks");
    }

    @GetMapping("/getAllDevopsTools")
    public List<String> getAllDevopsTools(){
        return Arrays.asList("git","maven","sonar","nexus","jenkins");
    }
}
