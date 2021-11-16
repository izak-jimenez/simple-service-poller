package com.krycodeassignment.servicepoller.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Service {
    @Id
    @NonNull
    private String id;

    private String name;

    private String url;

    private String status;

    private LocalDateTime createdOn;

    private LocalDateTime modifiedOn;
}
