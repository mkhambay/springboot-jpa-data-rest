CREATE SEQUENCE driver_seq
  INCREMENT 1
  MINVALUE 100
  MAXVALUE 99999999999999999
  START 1
  CACHE 1;

CREATE TABLE driver
(
  id bigint NOT NULL,
  first_name character varying(100),
  last_name character varying(100),
  last_updated date,
  CONSTRAINT "DRIVER_PK" PRIMARY KEY (id)
);

insert into driver (id, first_name, last_name) values (1, 'Henry', 'Williams');

commit;