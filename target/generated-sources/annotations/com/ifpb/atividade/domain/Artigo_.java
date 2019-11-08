package com.ifpb.atividade.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-08T10:00:16")
@StaticMetamodel(Artigo.class)
public class Artigo_ { 

    public static volatile SingularAttribute<Artigo, String> coautores;
    public static volatile SingularAttribute<Artigo, String> titulo;
    public static volatile SingularAttribute<Artigo, String> urlDownload;
    public static volatile SingularAttribute<Artigo, Integer> id;
    public static volatile SingularAttribute<Artigo, String> orientador;
    public static volatile SingularAttribute<Artigo, Date> dataSubmissao;
    public static volatile SingularAttribute<Artigo, String> modalidade;

}