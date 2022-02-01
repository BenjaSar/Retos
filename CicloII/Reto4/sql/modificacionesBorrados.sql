SET SQL_SAFE_UPDATES = 0;
update pelicula p set p.pel_anio="2012" where p.pel_titulo="El señor de los anillos";
commit;
update usuario u set u.usu_celular="3115678432"  where u.alias="ninja";
commit;
delete from transmision t where t.ptransmisiones="Stardust" and t.alias="green";
commit;