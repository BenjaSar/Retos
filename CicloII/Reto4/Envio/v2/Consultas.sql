SELECT '    Consulta 1'; 
select pel_titulo titulo from pelicula
union
select ser_titulo titulo from serie
order by 1 asc;
SELECT 'Consulta 2';
select pel_titulo||'|'||pel_resumen||'|'||pel_anio from pelicula where pel_anio>2000;
SELECT 'Consulta 3';
select distinct pel_titulo from pelicula p 
inner join director d on p.dir_id = d.dir_id
where d.dir_nombre='Peter' and d.dir_apellido='Jackson';
SELECT 'Consulta 4';
select distinct ptransmisiones from transmision where alias="lucky" order by ptransmisiones;
SELECT 'Consulta 5';
select u.alias||'|'||u.usu_nombre||'|'||u.usu_apellido from transmision t inner join usuario u on t.alias=u.alias where t.ptransmisiones="Stardust" order by u.usu_apellido asc;
SELECT 'Consulta 6';
select count(*) from pelicula where pel_anio>2000;