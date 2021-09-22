package br.com.edu.fafic.release1.domain;

import lombok.*;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Usuarios {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    private Bibliotecario bibliotecario;

    @OneToOne
    private Aluno aluno;

    @OneToOne
    private Professor professor;
}
