package com.example.MongoDemo.model;

import com.example.MongoDemo.ServiceLayer.IdGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "User")
public class User {



    @Transient
    private static IdGenerator idg = new IdGenerator();
    @Id
    private Object _id = (Object) idg.getId();

    private String first_name;
    private String last_name;
    private String email;
    private String mobileNo;
    private String gender;
    private boolean married_status;
    private Address address;
    private Card card;

}
