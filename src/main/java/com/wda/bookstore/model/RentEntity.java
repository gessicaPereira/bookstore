package com.wda.bookstore.model;

import com.wda.bookstore.model.enums.Status;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rent")
public class RentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "booksEntity")
    private BooksEntity booksEntity;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "usersEntity_id_fk")
    private UsersEntity usersEntity;

    @Column(name = "rental_date", nullable = false)
    private LocalDateTime rental_date;

    @Column(name = "forecast_return", nullable = false)
    private LocalDateTime forecast_return;

    @Column(name = "return_date", nullable = false)
    private LocalDateTime return_date;

    @Enumerated(EnumType.STRING)
    private Status status;


}
