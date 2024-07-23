insert into t_party(id, discrim, name)
select NEXT_PK('s_party') /*'0000'*/ id, 'G' discrim, 'Alsel' name;

insert into t_group(id, open, intro)
values ('0000', 1, '아르셰르에 어서오세요');

insert into t_party(id, discrim, name)
select NEXT_PK('s_party') /*'0001'*/ id, 'U' discrim, 'suezirekaka' name;