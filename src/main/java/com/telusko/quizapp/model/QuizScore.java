package com.telusko.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.dialect.function.TruncFunction;

import java.util.Date;

@Entity
@Data
@Table(name = "quizscore")
public class QuizScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;

    @Column(name = "score")
    private Integer score;

    @Column(name = "attemptedon")
    private Date attemptedon;

    @Column(name = "totalscore")
    private Integer totalscore;





}
