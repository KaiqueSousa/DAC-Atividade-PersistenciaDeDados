package com.ifpb.atividade.domain;

import com.ifpb.atividade.domain.Artigo;
import com.ifpb.atividade.domain.Contato;
import com.ifpb.atividade.domain.Endereco;
import com.ifpb.atividade.domain.Inscricao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T15:51:14")
@StaticMetamodel(Participante.class)
public class Participante_ { 

    public static volatile ListAttribute<Participante, Inscricao> inscricao;
    public static volatile SingularAttribute<Participante, Endereco> endereco;
    public static volatile SingularAttribute<Participante, String> instituicao;
    public static volatile SingularAttribute<Participante, String> profissao;
    public static volatile SingularAttribute<Participante, String> CPF;
    public static volatile SingularAttribute<Participante, String> nome;
    public static volatile SingularAttribute<Participante, String> tipoUsuario;
    public static volatile SingularAttribute<Participante, Long> id;
    public static volatile SingularAttribute<Participante, String> nomeCracha;
    public static volatile ListAttribute<Participante, Artigo> artigo;
    public static volatile SingularAttribute<Participante, Contato> contato;
    public static volatile SingularAttribute<Participante, String> email;

}