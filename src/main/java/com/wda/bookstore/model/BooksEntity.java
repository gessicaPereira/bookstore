package com.wda.bookstore.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class BooksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "name")
    private String name;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "launch", nullable = false)
    private LocalDateTime launch;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "publishing")
    private PublishingEntity publishing;

    @OneToMany(mappedBy = "booksEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RentEntity> rentEntities;

}
