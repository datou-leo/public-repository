drop table config if exists;
create table config(
	id bigint generated by default as identity,
	cron varchar(40),
	primary key(id)
);
