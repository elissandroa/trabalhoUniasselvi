
    create table tb_client (
       id int8 generated by default as identity,
        duvida varchar(255),
        email varchar(255),
        mensagem varchar(255),
        name varchar(255),
        primary key (id)
    );
