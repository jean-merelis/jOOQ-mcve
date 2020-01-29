DROP SCHEMA IF EXISTS mcve CASCADE;

CREATE SCHEMA mcve;

CREATE TABLE mcve.test (
  id SERIAL PRIMARY KEY,
  name TEXT NOT NULL
);

INSERT INTO mcve.test(name) values ('Joe');
INSERT INTO mcve.test(name) values ('Maria');
INSERT INTO mcve.test(name) values ('John');
INSERT INTO mcve.test(name) values ('Bill');